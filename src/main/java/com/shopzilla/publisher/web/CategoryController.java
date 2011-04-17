package com.shopzilla.publisher.web;

import com.shopzilla.api.client.ProductClient;
import com.shopzilla.api.client.helper.CredentialFactory;
import com.shopzilla.publisher.domain.Category;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RooWebScaffold(path = "categories", formBackingObject = Category.class)
@RequestMapping("/categories")
@Controller
public class CategoryController {

    private CredentialFactory credentialFactory;
    private ProductClient productClient;

    @RequestMapping(method = RequestMethod.POST)
    public String create(@Valid Category category, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("category", category);
            return "categories/create";
        }
        uiModel.asMap().clear();
        category.persist();
        return "redirect:/categories/" + encodeUrlPathSegment(category.get_id().toString(), httpServletRequest);
    }

	@RequestMapping(params = "form", method = RequestMethod.GET)
    public String createForm(Model uiModel) {
        uiModel.addAttribute("category", new Category());
        return "categories/create";
    }

	@RequestMapping(value = "/{_id}", method = RequestMethod.GET)
    public String show(@PathVariable("_id") Long _id, Model uiModel) {
        uiModel.addAttribute("category", Category.findCategory(_id));
        uiModel.addAttribute("itemId", _id);


        return "categories/show";
    }

	@RequestMapping(method = RequestMethod.GET)
    public String list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            uiModel.addAttribute("categories", Category.findCategoryEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) Category.countCategories() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("categories", Category.findAllCategories());
        }
        return "categories/list";
    }

	@RequestMapping(method = RequestMethod.PUT)
    public String update(@Valid Category category, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("category", category);
            return "categories/update";
        }
        uiModel.asMap().clear();
        category.merge();
        return "redirect:/categories/" + encodeUrlPathSegment(category.get_id().toString(), httpServletRequest);
    }

	@RequestMapping(value = "/{_id}", params = "form", method = RequestMethod.GET)
    public String updateForm(@PathVariable("_id") Long _id, Model uiModel) {
        uiModel.addAttribute("category", Category.findCategory(_id));
        return "categories/update";
    }

	@RequestMapping(value = "/{_id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("_id") Long _id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        Category.findCategory(_id).remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/categories";
    }

	@ModelAttribute("categories")
    public Collection<Category> populateCategories() {
        return Category.findAllCategories();
    }

	String encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        }
        catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }

    @Required
    public void setCredentialFactory(CredentialFactory credentialFactory) {
        this.credentialFactory = credentialFactory;
    }

    @Required
    public void setProductClient(ProductClient productClient) {
        this.productClient = productClient;
    }
}
