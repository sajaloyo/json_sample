package com.org.webapp.service;

import java.util.UUID;

public interface ServiceInterface<T> {
	public T findById(UUID id);
	public T create(T entity);
}
