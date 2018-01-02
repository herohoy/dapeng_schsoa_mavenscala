package com.today36524.schoolsoa.service
import com.today36524.schoolsoa.bean.Clazz
import com.today36524.schoolsoa.dao.ClassDao

class ClassServiceImpl extends ClassService{
  /**
    *
    **
  query class
    *
    **/
  override def findClassById(id: String): Clazz = ClassDao.findClassById(id)

  /**
    *
    **/
  override def findClassesByGrade(gradeId: String): List[Clazz] = ClassDao.findClassesByGrade(gradeId)
}
