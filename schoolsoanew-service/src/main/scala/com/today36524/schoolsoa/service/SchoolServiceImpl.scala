package com.today36524.schoolsoa.service
import com.today36524.schoolsoa.bean.School
import com.today36524.schoolsoa.dao.SchoolDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

class SchoolServiceImpl extends SchoolService{
  @Autowired
  var schoolDao:SchoolDao = _
  /**
    *
    **
  query the schoolsoa name
    *
    **/
  override def findSchoolNameById(id: String): String = SchoolDao.findSchoolById(id).name

  /**
    *
    **/
  override def findSchoolById(id: String): School = {
    SchoolDao.findSchoolById(id)
  }

  /**
    *
    **/
  override def findAllSchool(): List[School] = schoolDao.findAllSchool
}
