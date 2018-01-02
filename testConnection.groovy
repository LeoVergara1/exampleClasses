    import java.sql.*
  @Grab('mysql:mysql-connector-java:5.1.25')
@GrabConfig(systemClassLoader = true)
import groovy.sql.Sql
try{
  // def sql =  Sql.newInstance("jdbc:mysql://localhost:3306/impulsomx_qa","root","makingdevs", "com.mysql.jdbc.Driver")
  def sql = Sql.newInstance('jdbc:mysql://localhost:3306/impulsomx_qa', 'root',
  'makingdevs', 'com.mysql.jdbc.Driver')
  def sqlstr = """select * from corporate"""
  def data = sql.execute(sqlstr);
  sql.eachRow('select * from corporate') {
    tp ->
      println(tp.corporate_url)
  }
  sql.close()
  println data

}catch(all){
  println "Fallo"
  println all
}

