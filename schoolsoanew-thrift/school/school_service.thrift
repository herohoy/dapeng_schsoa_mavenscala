include "school.thrift"

namespace java com.today36524.schoolsoa.service

/**
  School service,to query information of schools
*/
service SchoolService {
   /**
    query the schoolsoa name
   */
   string findSchoolNameById (1:string id),

   school.School findSchoolById(1:string id),

   list<school.School> findAllSchool()
}
