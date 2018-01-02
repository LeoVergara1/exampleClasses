package clasess

@Grab('mysql:mysql-connector-java:5.1.25')
@GrabConfig(systemClassLoader = true)
import groovy.sql.Sql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Singleton
class SqlConection {
  def sql =  Sql.newInstance("jdbc:mysql://localhost:3306/test","root","makingdevs", "com.mysql.jdbc.Driver")

}