 package com.today36524.schoolsoa.bean.serializer;

        import com.today36524.schoolsoa.bean.serializer._;
        import com.isuwang.dapeng.core._
        import com.isuwang.org.apache.thrift._
        import com.isuwang.org.apache.thrift.protocol._

        /**
        * Autogenerated by Dapeng-Code-Generator (1.2.2)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *  @generated
        **/

        class ScoreSerializer extends TCommonBeanSerializer[com.today36524.schoolsoa.bean.Score]{
          
      @throws[TException]
      override def read(iprot: TProtocol): com.today36524.schoolsoa.bean.Score = {

        var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var studentId: String = null
        var lessonName: String = null
        var point: Int = 0
        

      while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRING => studentId = iprot.readString
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 2 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRING => lessonName = iprot.readString
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
              case 3 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.I32 => point = iprot.readI32
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = com.today36524.schoolsoa.bean.Score(studentId = studentId,lessonName = lessonName,point = point)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: com.today36524.schoolsoa.bean.Score, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("Score"))

      
            {
            val elem0 = bean.studentId 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("studentId", com.isuwang.org.apache.thrift.protocol.TType.STRING, 1.asInstanceOf[Short]))
            oprot.writeString(elem0)
            oprot.writeFieldEnd
            
            }
            {
            val elem1 = bean.lessonName 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("lessonName", com.isuwang.org.apache.thrift.protocol.TType.STRING, 2.asInstanceOf[Short]))
            oprot.writeString(elem1)
            oprot.writeFieldEnd
            
            }
            {
            val elem2 = bean.point 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("point", com.isuwang.org.apache.thrift.protocol.TType.I32, 3.asInstanceOf[Short]))
            oprot.writeI32(elem2)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: com.today36524.schoolsoa.bean.Score): Unit = {
      
              if(bean.studentId == null)
              throw new SoaException(SoaBaseCode.NotNull, "studentId字段不允许为空")
            
              if(bean.lessonName == null)
              throw new SoaException(SoaBaseCode.NotNull, "lessonName字段不允许为空")
            
    }
    

          @throws[TException]
          override def toString(bean: com.today36524.schoolsoa.bean.Score): String = if (bean == null) "null" else bean.toString

        }
        
      