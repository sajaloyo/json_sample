package com.org.webapp.service;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.org.webapp.entity.TransactionEntity;
import com.org.webapp.repo.TransactionRepo;

@Service
public class TransactionService {

  @Autowired
  TransactionRepo transactionsRepo;

  public TransactionEntity addData(String data) {
    System.out.println(data);
    JSONParser parser = new JSONParser();
    try {
      JSONObject json = (JSONObject) parser.parse(data);
      return transactionsRepo.save(new TransactionEntity(json));
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return null;
  }

}
