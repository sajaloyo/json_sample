package com.org.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.org.webapp.entity.TransactionEntity;
import com.org.webapp.request.TransactionRequest;
import com.org.webapp.response.BaseObjectResponse;
import com.org.webapp.response.ServiceResponse;
import com.org.webapp.service.TransactionService;

@RestController
public class TransactionController {

  @Autowired
  TransactionService transactionService;

  @RequestMapping(value = "/users/test", method = RequestMethod.GET)
  public String test() {
    return "SUCCESS";
  }

  @RequestMapping(value = "/users", method = RequestMethod.POST)
  public ServiceResponse<BaseObjectResponse<TransactionEntity>> addData(
      @RequestBody TransactionRequest request) {
    TransactionEntity ent = transactionService.addData(request.getData());
    return new ServiceResponse<BaseObjectResponse<TransactionEntity>>(
        new BaseObjectResponse<TransactionEntity>(ent));
  }
}

