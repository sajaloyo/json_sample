package com.org.webapp.entity;

import java.util.Date;
import java.util.UUID;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@MappedSuperclass
public abstract class AbstractEntity {

  @Id
  UUID id;

  private Date createdAt;

  private Date updatedAt;

  public AbstractEntity() {
    super();
    this.id = UUID.randomUUID();
  }

  public AbstractEntity(UUID id, Date createdAt, Date updatedAt) {
    super();
    this.id = id;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  @PreUpdate
  protected void onUpdate() {
    this.updatedAt = new Date();
  }

  @PrePersist
  protected void onCreate() {
    this.updatedAt = this.createdAt = new Date();
  }
}
