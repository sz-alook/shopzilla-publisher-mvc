package com.shopzilla.publisher.domain;

//@Configurable
//@Component
//@RooDataOnDemand(entity = Category.class)
public class CategoryDataOnDemand {

//	private Random rnd = new java.security.SecureRandom();
//
//	private List<Category> data;
//
//	public Category getNewTransientCategory(int index) {
//        com.shopzilla.publisher.domain.Category obj = new com.shopzilla.publisher.domain.Category();
//        setId(obj, index);
//        setTitle(obj, index);
//        return obj;
//    }
//
//	private void setId(Category obj, int index) {
//        java.lang.Long id = new Integer(index).longValue();
//        obj.setId(id);
//    }
//
//	private void setTitle(Category obj, int index) {
//        java.lang.String title = "title_" + index;
//        obj.setTitle(title);
//    }
//
//	public Category getSpecificCategory(int index) {
//        init();
//        if (index < 0) index = 0;
//        if (index > (data.size() - 1)) index = data.size() - 1;
//        Category obj = data.get(index);
//        return Category.findCategory(obj.get_id());
//    }
//
//	public Category getRandomCategory() {
//        init();
//        Category obj = data.get(rnd.nextInt(data.size()));
//        return Category.findCategory(obj.get_id());
//    }
//
//	public boolean modifyCategory(Category obj) {
//        return false;
//    }
//
//	public void init() {
//        data = com.shopzilla.publisher.domain.Category.findCategoryEntries(0, 10);
//        if (data == null) throw new IllegalStateException("Find entries implementation for 'Category' illegally returned null");
//        if (!data.isEmpty()) {
//            return;
//        }
//
//        data = new java.util.ArrayList<com.shopzilla.publisher.domain.Category>();
//        for (int i = 0; i < 10; i++) {
//            com.shopzilla.publisher.domain.Category obj = getNewTransientCategory(i);
//            obj.persist();
//            obj.flush();
//            data.add(obj);
//        }
//    }
}
