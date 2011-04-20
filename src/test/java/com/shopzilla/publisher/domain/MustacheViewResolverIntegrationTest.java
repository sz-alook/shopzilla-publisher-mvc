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
package com.shopzilla.publisher.domain;

import java.util.Locale;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.mustache.MustacheViewResolver;
/**
 * @author alook
 * @since 4/19/11
 */
@ContextConfiguration(locations = {
                        "classpath:META-INF/spring/applicationContext.xml",
                        "classpath*:/WEB-INF/spring/webmvc-config.xml"})
public class MustacheViewResolverIntegrationTest {
    private static final Log LOG = LogFactory.getLog(MustacheViewResolverIntegrationTest.class);

    WebApplicationContext context;

    @Autowired
    MustacheViewResolver mustacheViewResolver;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testResolverLoader() throws Exception {
//        Resource resource = context.getResource("classpath:META-INF/spring/applicationContext.xml");
//        Resource theResource = context.getResource("classpath*:/WEB-INF/web.xml");
//        Assert.assertEquals(true, theResource.exists());
    }

    @Test
    public void test() throws Exception {
//        View indexView = mustacheViewResolver.resolveViewName("index", Locale.US);
    }
}
