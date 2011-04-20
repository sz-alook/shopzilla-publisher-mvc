package com.shopzilla.publisher.web;

import com.shopzilla.api.client.ProductSearchRequest;
import com.shopzilla.api.client.helper.CredentialFactory;
import com.shopzilla.api.client.http.RestCatalogAPIClient;
import com.shopzilla.api.client.model.CatalogResponse;
import com.shopzilla.publisher.domain.Category;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RooWebScaffold(path = "categories", formBackingObject = Category.class)
@RequestMapping("/categories")
@Controller
public class CategoryController {

    private CredentialFactory credentialFactory;

    private RestCatalogAPIClient restCatalogAPIClient;

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String show(@RequestParam("id") Long id, Model uiModel) {
        //uiModel.addAttribute("category", Category.findCategory(_id));
        uiModel.addAttribute("itemId", id);

        String publisherId = credentialFactory.getPublisherId();
        String apiKey = credentialFactory.getPublisherApiKey();

        ProductSearchRequest searchRequest = new ProductSearchRequest();
        searchRequest.setApiKey(apiKey);
        searchRequest.setPublisherId(publisherId);
        searchRequest.setCategoryId(id.toString());
        searchRequest.setNumResults(100);
        CatalogResponse response = restCatalogAPIClient.performSearch(searchRequest);

        uiModel.addAttribute("offers", response.getOffers());
        uiModel.addAttribute("products", response.getProducts());
        uiModel.addAttribute("attributes", response.getRelatedAttributes());

        return "show";
    }

    @Required
    public void setCredentialFactory(CredentialFactory credentialFactory) {
        this.credentialFactory = credentialFactory;
    }

    @Required
    public void setRestCatalogAPIClient(RestCatalogAPIClient restCatalogAPIClient) {
        this.restCatalogAPIClient = restCatalogAPIClient;
    }
}
