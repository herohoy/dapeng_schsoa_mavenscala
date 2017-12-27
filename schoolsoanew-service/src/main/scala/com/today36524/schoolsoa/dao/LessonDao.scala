package com.today36524.schoolsoa.dao

import com.today36524.schoolsoa.bean.Lesson
import com.today36524.schoolsoa.util.ScalaSqlUtil
import wangzx.scala_commons.sql._

object LessonDao {
  def findAllLessons = ScalaSqlUtil.dataSource.rows[Lesson](
    "select name,namecn,lessonorder from bean_lesson order by lessonorder")
  def findLessonByName(name:String) = ScalaSqlUtil.dataSource.row[Lesson](
    s"select name,namecn,lessonorder from bean_lesson where name=$name")
}
