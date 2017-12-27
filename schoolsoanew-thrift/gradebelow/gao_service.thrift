include "gao.thrift"

namespace java com.today36524.schoolsoa.service

/**
  Grade service,to query information of grades
*/
service GradeService {
   /**
    query grade
   */
   gao.Grade findGradeById(1:string id),

   list<gao.Grade> findGradesBySchool(1:string schoolId)
}

service ClassService {
   /**
    query class
   */
   gao.Clazz findClassById(1:string id),

   list<gao.Clazz> findClassesByGrade(1:string gradeId)
}

service StudentService {
   /**
    query student
   */
   gao.Student findStudentById(1:string id),

   list<gao.Student> findStudentsByClass(1:string classId),

   list<gao.StudentInfo> findStudentRowsByClass(1:string classId)
}

service LessonService {
   /**
    query lesson
   */
   gao.Lesson findLessonByName(1:string name),

   list<gao.Lesson> findAllLessons()
}

service ScoreService {
   /**
    query student
   */
   gao.Score findScoreByStudentIdAndLessonName(1:string id),

   list<gao.Score> findScoresByStudentId(1:string studentId),

   list<gao.Score> findAllScores()
}
