package com.org.webapp.service;

import java.util.UUID;
import com.org.webapp.manager.AbstractDbInstance;

public abstract class AbstractService<T> implements ServiceInterface<T> {
  public abstract AbstractDbInstance<T, UUID> getInstance();

  public T findById(UUID id) {
    return getInstance().findById(id);
  }

  public T create(T entity) {
    return getInstance().create(entity);
  }
}
