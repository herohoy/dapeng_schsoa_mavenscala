package com.today36524.schoolsoa.dao

import com.alibaba.druid.pool.DruidDataSource
import com.today36524.schoolsoa.util.ScalaSqlUtil
import com.today36524.schoolsoa.bean.School
import org.springframework.beans.factory.annotation.{Autowired, Qualifier}
import org.springframework.context.support.ClassPathXmlApplicationContext
import wangzx.scala_commons.sql._

//import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository
//import org.springframework.data.jpa.repository.{JpaRepository, Query}

/**
  * 未研究透的写法，使用springboot中的jpa，暂时不知如何结合使用
  */
//trait SchoolDao extends JpaRepository[School,Long]{
//  @Query("select id,name from School")
//  def findWholeList():List[School]
//}


/**
  * 新写法
  */
object SchoolDao {

  /**
    * 在object中引入spring注入的bean无效，暂未发现可引入的方式
    */
  //  @Autowired
//  var schoolDao:SchoolDao = _

  /**
    * 使用scala-sql访问数据的方式
    * @param id 学校ID
    * @return 学校数据
    */
  def findSchoolById(id:String): School
  =
  {
    ScalaSqlUtil.dataSource.row[School](s"select id,name from bean_school where id=$id").get
  }
}

@Repository
class SchoolDao {
  @Autowired
  var dataSource:DruidDataSource = _
  def findAllSchool: List[School]
  = dataSource.rows[School](
    "select id,name from bean_school")

  /**
    * 类型可调用静态方法，反之不然
    * @param id 学校ID
    * @return 学校数据
    */
  def findSchoolById(id:String):School
  = SchoolDao.findSchoolById(id)
}
