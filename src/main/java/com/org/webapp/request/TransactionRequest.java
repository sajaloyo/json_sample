package com.org.webapp.request;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionRequest {


  @NotNull
  @NotBlank
  @JsonProperty("jsondata")
  private String data;

  public TransactionRequest(String data) {
    super();
    this.data = data;
    System.out.println(data);
  }

  public TransactionRequest() {
    super();
    // TODO Auto-generated constructor stub
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

}
