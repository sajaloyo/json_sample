package com.org.webapp.util;

import java.sql.Types;
import org.hibernate.dialect.PostgreSQL9Dialect;
// import org.hibernate.dialect.PostgreSQL94Dialect;
// org.hibernate.dialect.Dialect

public class MyPostgreSQLDialect extends PostgreSQL9Dialect {

  public MyPostgreSQLDialect() {
    this.registerColumnType(Types.JAVA_OBJECT, "jsonb");
  }
}
