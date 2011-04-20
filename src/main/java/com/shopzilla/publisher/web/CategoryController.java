package com.shopzilla.publisher.web;

import com.shopzilla.api.client.model.CatalogResponse;
import com.shopzilla.publisher.service.CategorySearchService;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/categories")
@Controller
public class CategoryController {

    private CategorySearchService categorySearchService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String show(@PathVariable("id") Long id, Model uiModel) {

        uiModel.addAttribute("itemId", id);

        CatalogResponse response = categorySearchService.categorySearch(id, 10);

        uiModel.addAttribute("offers", response.getOffers());
        uiModel.addAttribute("products", response.getProducts());
        uiModel.addAttribute("attributes", response.getRelatedAttributes());

        return "show";
    }

    @Required
    public void setCategorySearchService(CategorySearchService categorySearchService) {
        this.categorySearchService = categorySearchService;
    }
}
