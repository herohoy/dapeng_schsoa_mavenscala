namespace java com.today36524.schoolsoa.bean

struct Grade{
  1:string id,
  2:i32 level,
  3:i32 year,
  4:string schoolId
}

struct Clazz{
  1:string id,
  2:string name,
  3:i32 classorder,
  4:string gradeId
}

struct Student{
  1:string id,
  2:string name,
  3:string sex,
  4:string classId
}

struct Lesson{
  1:required string name,
  2:optional string namecn,
  3:i32 lessonorder
}

struct Score{
  1:required string studentId,
  2:required string lessonName,
  3:i32 point
}

struct StudentInfo{
  1:required string id,
  2:string name,
  3:string sex,
  4:string sex_cn,
  5:string class_id,
  6:i32 yuwen,
  7:i32 shuxue,
  8:i32 yingyu,
  9:i32 total,
  10:i32 average
}
