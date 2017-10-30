package com.org.webapp.manager;

public interface AbstractDbInstance<T, M> {


  // public abstract JpaRepository<T, UUID> getRepo();
  //
  public T findById(M id);

  public T create(T entity);
  // public List<T> bulkCreate(List<T> entities) ;
  // public T findById(UUID id) {
  // return getRepo().findOne(id);
  // }
  //
  // public T create(T entity) {
  // System.out.println("AbstractDBInstance : \n" + entity);
  // try {
  // return getRepo().save(entity);
  // } catch (Exception e) {
  // System.out.println("exception in save call");
  // e.printStackTrace();
  // }
  // return null;
  // }
  //
  // public List<T> bulkCreate(List<T> entities) {
  // List<T> createdEntities = new ArrayList<T>();
  // for (T entity : entities) {
  // createdEntities.add(create(entity));
  // }
  // return createdEntities;
  // }
}
