package com.org.webapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import org.hibernate.annotations.Type;
import org.json.simple.JSONObject;
import com.org.webapp.util.JSONBUserType;

@Entity(name = "users")
@org.hibernate.annotations.TypeDef(name = "JSONBUserType", typeClass = JSONBUserType.class)
public class TransactionEntity extends AbstractEntity {

  @Column(nullable = true)
  @Type(type = "JSONBUserType")
  private JSONObject data;

  public TransactionEntity() {}

  public TransactionEntity(JSONObject data) {
    System.out.println("Entity constructor\n" + data);
    this.data = data;
  }

  public JSONObject getData() {
    return data;
  }

  public void setData(JSONObject data) {
    this.data = data;
  }
}
