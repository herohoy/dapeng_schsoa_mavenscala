package com.today36524.schoolsoa.util

import java.io.FileInputStream
import java.util.Properties
import javax.sql.DataSource

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource
import org.springframework.context.annotation.{Bean, Configuration}
import wangzx.scala_commons.sql._


@deprecated("Please use DruidDataSource instead","1.0.1")
object ScalaSqlUtil {

  val dataSource: DataSource = {

    val properties = new Properties()
    val path = Thread.currentThread().getContextClassLoader
      .getResource("config_schoolsoanew.properties").getPath //文件要放到resource文件夹下
    properties.load(new FileInputStream(path))
    val dataSource: MysqlDataSource = new MysqlDataSource
    dataSource.setURL(properties.getProperty("DB_CRMDB_URL"))
    dataSource.setUser(properties.getProperty("DB_CRMDB_USER"))
    dataSource.setPassword(properties.getProperty("DB_CRMDB_PASSWD"))

    dataSource
  }

}

/*@Configuration
class ScalaSqlUtil{

  @Bean
  def getDataSource : DataSource = {
    val properties = new Properties()
    val path = Thread.currentThread().getContextClassLoader
      .getResource("application.properties").getPath //文件要放到resource文件夹下
    properties.load(new FileInputStream(path))
    val dataSource = new MysqlDataSource
    //以下代码模式在本场景不适用
//    {
//      this.url = properties.getProperty("spring.datasource.url")
//      this.user = properties.getProperty("spring.datasource.username")
//      this.password = properties.getProperty("spring.datasource.password")
//    }
    dataSource.setURL(properties.getProperty("spring.datasource.url"))
    dataSource.setUser(properties.getProperty("spring.datasource.username"))
    dataSource.setPassword(properties.getProperty("spring.datasource.password"))

    dataSource
  }
}*/
