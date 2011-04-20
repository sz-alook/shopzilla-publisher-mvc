package com.shopzilla.publisher.domain;

//@Entity
//@Configurable
public class Category {

    private Long id;

    private String title;

	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Title: ").append(getTitle());
        return sb.toString();
    }

//	@PersistenceContext
//    transient EntityManager entityManager;

//	@Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "_id")
    private Long _id;

//	@Version
//    @Column(name = "version")
    private Integer version;

	public Long get_id() {
        return this._id;
    }

	public void set_id(Long id) {
        this._id = id;
    }

	public Integer getVersion() {
        return this.version;
    }

	public void setVersion(Integer version) {
        this.version = version;
    }

//	@Transactional
//    public void persist() {
//        if (this.entityManager == null) this.entityManager = entityManager();
//        this.entityManager.persist(this);
//    }
//
//	@Transactional
//    public void remove() {
//        if (this.entityManager == null) this.entityManager = entityManager();
//        if (this.entityManager.contains(this)) {
//            this.entityManager.remove(this);
//        } else {
//            Category attached = Category.findCategory(this._id);
//            this.entityManager.remove(attached);
//        }
//    }
//
//	@Transactional
//    public void flush() {
//        if (this.entityManager == null) this.entityManager = entityManager();
//        this.entityManager.flush();
//    }
//
//	@Transactional
//    public void clear() {
//        if (this.entityManager == null) this.entityManager = entityManager();
//        this.entityManager.clear();
//    }
//
//	@Transactional
//    public Category merge() {
//        if (this.entityManager == null) this.entityManager = entityManager();
//        Category merged = this.entityManager.merge(this);
//        this.entityManager.flush();
//        return merged;
//    }
//
//	public static final EntityManager entityManager() {
//        EntityManager em = new Category().entityManager;
//        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
//        return em;
//    }
//
//	public static long countCategories() {
//        return entityManager().createQuery("SELECT COUNT(o) FROM Category o", Long.class).getSingleResult();
//    }
//
//	public static List<Category> findAllCategories() {
//        return entityManager().createQuery("SELECT o FROM Category o", Category.class).getResultList();
//    }
//
//	public static Category findCategory(Long _id) {
//        if (_id == null) return null;
//        return entityManager().find(Category.class, _id);
//    }
//
//	public static List<Category> findCategoryEntries(int firstResult, int maxResults) {
//        return entityManager().createQuery("SELECT o FROM Category o", Category.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
//    }

	public Long getId() {
        return this.id;
    }

	public void setId(Long id) {
        this.id = id;
    }

	public String getTitle() {
        return this.title;
    }

	public void setTitle(String title) {
        this.title = title;
    }
}
