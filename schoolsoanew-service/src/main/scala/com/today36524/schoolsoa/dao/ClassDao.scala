package com.today36524.schoolsoa.dao

import com.alibaba.druid.pool.DruidDataSource
import com.today36524.schoolsoa.bean.Clazz
import com.today36524.schoolsoa.util.ScalaSqlUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import wangzx.scala_commons.sql._

object ClassDao {
  def findClassesByGrade(gradeId:String) = ScalaSqlUtil.dataSource.rows[Clazz](
    s"select id,name,classorder,grade_id from bean_clazz where grade_id = $gradeId order by classorder")
  def findClassById(id:String):Clazz = ScalaSqlUtil.dataSource.row[Clazz](
    s"select id,name,classorder,grade_id from bean_clazz where id = $id").get
}

@Repository
class ClassDao extends {
  @Autowired
  var dataSource:DruidDataSource = _
  def findClassesByGrade(gradeId:String) = dataSource.rows[Clazz](
      s"select id,name,classorder,grade_id from bean_clazz where grade_id = $gradeId order by classorder")
  def findClassById(id:String):Clazz = dataSource.row[Clazz](
    s"select id,name,classorder,grade_id from bean_clazz where id = $id").get
}
