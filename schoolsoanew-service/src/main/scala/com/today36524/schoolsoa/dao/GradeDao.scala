package com.today36524.schoolsoa.dao

import com.alibaba.druid.pool.DruidDataSource
import com.today36524.schoolsoa.bean.Grade
import com.today36524.schoolsoa.util.ScalaSqlUtil
import org.springframework.beans.factory.annotation.Autowired
import wangzx.scala_commons.sql._


object GradeDao {
  def findGradesBySchool(schoolId:String) = {
    ScalaSqlUtil.dataSource.rows[Grade](
      s"select id,level,year,school_id from bean_grade where school_id = $schoolId")
  }
  def findGradeById(id:String) = {
    ScalaSqlUtil.dataSource.row[Grade](
      s"select id,level,year,school_id from bean_grade where id = $id")
  }
}

class GradeDao {
  @Autowired
  var dataSource:DruidDataSource = _
  def findGradesBySchool(schoolId:String) = dataSource.rows[Grade](
      s"select id,level,year,school_id from bean_grade where school_id = $schoolId")
  def findGradeById(id:String) =
  {
    dataSource.row[Grade](
      s"select id,level,year,school_id from bean_grade where id = $id").get
  }
}
