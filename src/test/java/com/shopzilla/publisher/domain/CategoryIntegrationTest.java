package com.shopzilla.publisher.domain;

import org.junit.Test;

//@Configurable
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext.xml")
//@Transactional
//@RooIntegrationTest(entity = Category.class)
public class CategoryIntegrationTest {

    @Test
    public void testMarkerMethod() {
    }
//
//	@Autowired
//    private CategoryDataOnDemand dod;
//
//	@Test
//    public void testCountCategories() {
//        org.junit.Assert.assertNotNull("Data on demand for 'Category' failed to initialize correctly", dod.getRandomCategory());
//        long count = com.shopzilla.publisher.domain.Category.countCategories();
//        org.junit.Assert.assertTrue("Counter for 'Category' incorrectly reported there were no entries", count > 0);
//    }
//
//	@Test
//    public void testFindCategory() {
//        com.shopzilla.publisher.domain.Category obj = dod.getRandomCategory();
//        org.junit.Assert.assertNotNull("Data on demand for 'Category' failed to initialize correctly", obj);
//        java.lang.Long id = obj.get_id();
//        org.junit.Assert.assertNotNull("Data on demand for 'Category' failed to provide an identifier", id);
//        obj = com.shopzilla.publisher.domain.Category.findCategory(id);
//        org.junit.Assert.assertNotNull("Find method for 'Category' illegally returned null for id '" + id + "'", obj);
//        org.junit.Assert.assertEquals("Find method for 'Category' returned the incorrect identifier", id, obj.get_id());
//    }
//
//	@Test
//    public void testFindAllCategories() {
//        org.junit.Assert.assertNotNull("Data on demand for 'Category' failed to initialize correctly", dod.getRandomCategory());
//        long count = com.shopzilla.publisher.domain.Category.countCategories();
//        org.junit.Assert.assertTrue("Too expensive to perform a find all test for 'Category', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
//        java.util.List<com.shopzilla.publisher.domain.Category> result = com.shopzilla.publisher.domain.Category.findAllCategories();
//        org.junit.Assert.assertNotNull("Find all method for 'Category' illegally returned null", result);
//        org.junit.Assert.assertTrue("Find all method for 'Category' failed to return any data", result.size() > 0);
//    }
//
//	@Test
//    public void testFindCategoryEntries() {
//        org.junit.Assert.assertNotNull("Data on demand for 'Category' failed to initialize correctly", dod.getRandomCategory());
//        long count = com.shopzilla.publisher.domain.Category.countCategories();
//        if (count > 20) count = 20;
//        java.util.List<com.shopzilla.publisher.domain.Category> result = com.shopzilla.publisher.domain.Category.findCategoryEntries(0, (int) count);
//        org.junit.Assert.assertNotNull("Find entries method for 'Category' illegally returned null", result);
//        org.junit.Assert.assertEquals("Find entries method for 'Category' returned an incorrect number of entries", count, result.size());
//    }
//
//	@Test
//    public void testFlush() {
//        com.shopzilla.publisher.domain.Category obj = dod.getRandomCategory();
//        org.junit.Assert.assertNotNull("Data on demand for 'Category' failed to initialize correctly", obj);
//        java.lang.Long id = obj.get_id();
//        org.junit.Assert.assertNotNull("Data on demand for 'Category' failed to provide an identifier", id);
//        obj = com.shopzilla.publisher.domain.Category.findCategory(id);
//        org.junit.Assert.assertNotNull("Find method for 'Category' illegally returned null for id '" + id + "'", obj);
//        boolean modified =  dod.modifyCategory(obj);
//        java.lang.Integer currentVersion = obj.getVersion();
//        obj.flush();
//        org.junit.Assert.assertTrue("Version for 'Category' failed to increment on flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
//    }
//
//	@Test
//    public void testMerge() {
//        com.shopzilla.publisher.domain.Category obj = dod.getRandomCategory();
//        org.junit.Assert.assertNotNull("Data on demand for 'Category' failed to initialize correctly", obj);
//        java.lang.Long id = obj.get_id();
//        org.junit.Assert.assertNotNull("Data on demand for 'Category' failed to provide an identifier", id);
//        obj = com.shopzilla.publisher.domain.Category.findCategory(id);
//        boolean modified =  dod.modifyCategory(obj);
//        java.lang.Integer currentVersion = obj.getVersion();
//        com.shopzilla.publisher.domain.Category merged = (com.shopzilla.publisher.domain.Category) obj.merge();
//        obj.flush();
//        org.junit.Assert.assertEquals("Identifier of merged object not the same as identifier of original object", merged.get_id(), id);
//        org.junit.Assert.assertTrue("Version for 'Category' failed to increment on merge and flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
//    }
//
//	@Test
//    public void testPersist() {
//        org.junit.Assert.assertNotNull("Data on demand for 'Category' failed to initialize correctly", dod.getRandomCategory());
//        com.shopzilla.publisher.domain.Category obj = dod.getNewTransientCategory(Integer.MAX_VALUE);
//        org.junit.Assert.assertNotNull("Data on demand for 'Category' failed to provide a new transient entity", obj);
//        org.junit.Assert.assertNull("Expected 'Category' identifier to be null", obj.get_id());
//        obj.persist();
//        obj.flush();
//        org.junit.Assert.assertNotNull("Expected 'Category' identifier to no longer be null", obj.get_id());
//    }
//
//	@Test
//    public void testRemove() {
//        com.shopzilla.publisher.domain.Category obj = dod.getRandomCategory();
//        org.junit.Assert.assertNotNull("Data on demand for 'Category' failed to initialize correctly", obj);
//        java.lang.Long id = obj.get_id();
//        org.junit.Assert.assertNotNull("Data on demand for 'Category' failed to provide an identifier", id);
//        obj = com.shopzilla.publisher.domain.Category.findCategory(id);
//        obj.remove();
//        obj.flush();
//        org.junit.Assert.assertNull("Failed to remove 'Category' with identifier '" + id + "'", com.shopzilla.publisher.domain.Category.findCategory(id));
//    }
}
