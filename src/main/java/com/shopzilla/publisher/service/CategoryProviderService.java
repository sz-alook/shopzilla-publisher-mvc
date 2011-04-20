/**
 * Copyright (C) 2004 - 2011 Shopzilla, Inc. 
 * All rights reserved. Unauthorized disclosure or distribution is prohibited.
 */
package com.shopzilla.publisher.service;

import com.shopzilla.api.client.model.Category;
import java.util.List;

/**
 * @author alook
 * @since 4/19/11
 */
public interface CategoryProviderService {

    List<Category> fetchCategories();
}
