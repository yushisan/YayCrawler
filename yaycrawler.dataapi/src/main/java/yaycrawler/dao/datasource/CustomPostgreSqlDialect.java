package yaycrawler.dao.datasource;

import org.hibernate.dialect.PostgreSQL9Dialect;

import java.sql.Types;


public class CustomPostgreSqlDialect extends PostgreSQL9Dialect {

    public CustomPostgreSqlDialect() {
        this.registerColumnType(Types.JAVA_OBJECT, "data");
    }
}
