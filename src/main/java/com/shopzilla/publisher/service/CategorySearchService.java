/**
 * Copyright 2011 Shopzilla.com
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.shopzilla.publisher.service;

import com.shopzilla.api.client.ProductSearchRequest;
import com.shopzilla.api.client.helper.CredentialFactory;
import com.shopzilla.api.client.http.RestCatalogAPIClient;
import com.shopzilla.api.client.model.CatalogResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author alook
 * @since 4/19/11
 */
public class CategorySearchService {
    private static final Log LOG = LogFactory.getLog(CategorySearchService.class);

    private static RestCatalogAPIClient restCatalogAPIClient;
    private static String apiKey;
    private static String publisherId;


    public CatalogResponse categorySearch(Long categoryId, Integer numResults) {
        ProductSearchRequest productSearchRequest = new ProductSearchRequest();
        productSearchRequest.setApiKey(apiKey);
        productSearchRequest.setPublisherId(publisherId);
        productSearchRequest.setCategoryId(categoryId.toString());
        productSearchRequest.setNumResults(numResults);
        productSearchRequest.setShowAttributes(Boolean.TRUE);

        return restCatalogAPIClient.performSearch(productSearchRequest);
    }


    public void setCredentialFactory(CredentialFactory credentialFactory) {
        apiKey = credentialFactory.getPublisherApiKey();
        publisherId = credentialFactory.getPublisherId();
    }

    public void setRestCatalogAPIClient(RestCatalogAPIClient restCatalogAPIClient) {
        this.restCatalogAPIClient = restCatalogAPIClient;
    }
}
