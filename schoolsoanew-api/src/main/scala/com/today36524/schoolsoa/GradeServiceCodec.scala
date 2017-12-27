package com.today36524.schoolsoa
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
        object GradeServiceCodec {

        
            case class findGradeById_args(id:String)

            case class findGradeById_result(success:com.today36524.schoolsoa.bean.Grade)

            class FindGradeById_argsSerializer extends TCommonBeanSerializer[findGradeById_args]{
            
      @throws[TException]
      override def read(iprot: TProtocol): findGradeById_args = {

        var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var id: String = null
        

      while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRING => id = iprot.readString
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = findGradeById_args(id = id)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: findGradeById_args, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("findGradeById_args"))

      
            {
            val elem0 = bean.id 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("id", com.isuwang.org.apache.thrift.protocol.TType.STRING, 1.asInstanceOf[Short]))
            oprot.writeString(elem0)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: findGradeById_args): Unit = {
      
              if(bean.id == null)
              throw new SoaException(SoaBaseCode.NotNull, "id字段不允许为空")
            
    }
    

            override def toString(bean: findGradeById_args): String = if(bean == null)  "null" else bean.toString
            }

            class FindGradeById_resultSerializer extends TCommonBeanSerializer[findGradeById_result]{

            @throws[TException]
            override def read(iprot: TProtocol): findGradeById_result = {

              var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
              iprot.readStructBegin

              var success : com.today36524.schoolsoa.bean.Grade = null

              while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

                schemeField = iprot.readFieldBegin

                schemeField.id match {
                    case 0 =>
                       schemeField.`type` match {
                          case com.isuwang.org.apache.thrift.protocol.TType.STRUCT =>  success = new com.today36524.schoolsoa.bean.serializer.GradeSerializer().read(iprot)
                          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                  }
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                }

                iprot.readFieldEnd
              }

              iprot.readStructEnd
              val bean = findGradeById_result(success)
              validate(bean)

              bean
            }

            
      @throws[TException]
      override def write(bean: findGradeById_result, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("findGradeById_result"))

      
            {
            val elem0 = bean.success 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("success", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, 0.asInstanceOf[Short]))
             new com.today36524.schoolsoa.bean.serializer.GradeSerializer().write(elem0, oprot)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
            
      @throws[TException]
      override def validate(bean: findGradeById_result): Unit = {
      
              if(bean.success == null)
              throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空")
            
                if(bean.success != null)
                new com.today36524.schoolsoa.bean.serializer.GradeSerializer().validate(bean.success)
              
    }
    

            override def toString(bean: findGradeById_result): String = if(bean == null)  "null" else bean.toString
          }

            class findGradeById extends SoaProcessFunction[com.today36524.schoolsoa.service.GradeService, findGradeById_args, findGradeById_result, FindGradeById_argsSerializer,  FindGradeById_resultSerializer]("findGradeById", new FindGradeById_argsSerializer(), new FindGradeById_resultSerializer()){

            override def isOneway: Boolean = false

            override def getEmptyArgsInstance: findGradeById_args = null


            @throws[TException]
            def getResult(iface: com.today36524.schoolsoa.service.GradeService, args: findGradeById_args):findGradeById_result = {

              val _result = iface.findGradeById(args.id)
              findGradeById_result(_result )
            }
          }
          
            case class findGradesBySchool_args(schoolId:String)

            case class findGradesBySchool_result(success:List[com.today36524.schoolsoa.bean.Grade])

            class FindGradesBySchool_argsSerializer extends TCommonBeanSerializer[findGradesBySchool_args]{
            
      @throws[TException]
      override def read(iprot: TProtocol): findGradesBySchool_args = {

        var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
        iprot.readStructBegin()

      var schoolId: String = null
        

      while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

        schemeField = iprot.readFieldBegin

        schemeField.id match {
          
              case 1 =>
                  schemeField.`type` match {
                    case com.isuwang.org.apache.thrift.protocol.TType.STRING => schoolId = iprot.readString
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
            }
            
          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
        }
      }

      iprot.readFieldEnd
      iprot.readStructEnd

      val bean = findGradesBySchool_args(schoolId = schoolId)
      validate(bean)

      bean
      }
    
      @throws[TException]
      override def write(bean: findGradesBySchool_args, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("findGradesBySchool_args"))

      
            {
            val elem0 = bean.schoolId 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("schoolId", com.isuwang.org.apache.thrift.protocol.TType.STRING, 1.asInstanceOf[Short]))
            oprot.writeString(elem0)
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
      @throws[TException]
      override def validate(bean: findGradesBySchool_args): Unit = {
      
              if(bean.schoolId == null)
              throw new SoaException(SoaBaseCode.NotNull, "schoolId字段不允许为空")
            
    }
    

            override def toString(bean: findGradesBySchool_args): String = if(bean == null)  "null" else bean.toString
            }

            class FindGradesBySchool_resultSerializer extends TCommonBeanSerializer[findGradesBySchool_result]{

            @throws[TException]
            override def read(iprot: TProtocol): findGradesBySchool_result = {

              var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null
              iprot.readStructBegin

              var success : List[com.today36524.schoolsoa.bean.Grade] = List.empty

              while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {

                schemeField = iprot.readFieldBegin

                schemeField.id match {
                    case 0 =>
                       schemeField.`type` match {
                          case com.isuwang.org.apache.thrift.protocol.TType.LIST =>  success = {
        val _list0 : com.isuwang.org.apache.thrift.protocol.TList = iprot.readListBegin
        val _result0 = (0 until _list0.size).map(_ => {new com.today36524.schoolsoa.bean.serializer.GradeSerializer().read(iprot)}).toList
        iprot.readListEnd
        _result0
        }
                          case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                  }
                    case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                }

                iprot.readFieldEnd
              }

              iprot.readStructEnd
              val bean = findGradesBySchool_result(success)
              validate(bean)

              bean
            }

            
      @throws[TException]
      override def write(bean: findGradesBySchool_result, oprot: TProtocol): Unit = {

      validate(bean)
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("findGradesBySchool_result"))

      
            {
            val elem0 = bean.success 
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("success", com.isuwang.org.apache.thrift.protocol.TType.LIST, 0.asInstanceOf[Short]))
            
        oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRUCT, elem0.size))
        elem0.foreach(elem1 => { new com.today36524.schoolsoa.bean.serializer.GradeSerializer().write(elem1, oprot)})
        oprot.writeListEnd
      
            oprot.writeFieldEnd
            
            }
      oprot.writeFieldStop
      oprot.writeStructEnd
    }
    
            
      @throws[TException]
      override def validate(bean: findGradesBySchool_result): Unit = {
      
              if(bean.success == null)
              throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空")
            
    }
    

            override def toString(bean: findGradesBySchool_result): String = if(bean == null)  "null" else bean.toString
          }

            class findGradesBySchool extends SoaProcessFunction[com.today36524.schoolsoa.service.GradeService, findGradesBySchool_args, findGradesBySchool_result, FindGradesBySchool_argsSerializer,  FindGradesBySchool_resultSerializer]("findGradesBySchool", new FindGradesBySchool_argsSerializer(), new FindGradesBySchool_resultSerializer()){

            override def isOneway: Boolean = false

            override def getEmptyArgsInstance: findGradesBySchool_args = null


            @throws[TException]
            def getResult(iface: com.today36524.schoolsoa.service.GradeService, args: findGradesBySchool_args):findGradesBySchool_result = {

              val _result = iface.findGradesBySchool(args.schoolId)
              findGradesBySchool_result(_result )
            }
          }
          

        case class getServiceMetadata_args()

        case class getServiceMetadata_result(success: String)

        class GetServiceMetadata_argsSerializer extends TCommonBeanSerializer[getServiceMetadata_args] {

          @throws[TException]
          override def read(iprot: TProtocol): getServiceMetadata_args = {

            iprot.readStructBegin

            var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null

            while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {
              schemeField = iprot.readFieldBegin
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
              iprot.readFieldEnd
            }

            iprot.readStructEnd

            val bean = getServiceMetadata_args()
            validate(bean)

            bean
          }

          @throws[TException]
          override def write(bean: getServiceMetadata_args, oproto: TProtocol): Unit = {
            validate(bean)
            oproto.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("getServiceMetadata_args"))

            oproto.writeFieldStop
            oproto.writeStructEnd
          }

          @throws[TException]
          override def validate(bean: getServiceMetadata_args): Unit = {}

          override def toString(bean: getServiceMetadata_args): String = if (bean == null) "null" else bean.toString
        }



        class GetServiceMetadata_resultSerializer extends TCommonBeanSerializer[getServiceMetadata_result] {
          @throws[TException]
          override def read(iprot: TProtocol): getServiceMetadata_result = {
            iprot.readStructBegin

            var schemeField: com.isuwang.org.apache.thrift.protocol.TField = null

            var success: String = null

            while (schemeField == null || schemeField.`type` != com.isuwang.org.apache.thrift.protocol.TType.STOP) {
              schemeField = iprot.readFieldBegin

              schemeField.id match {
                case 0 =>
                schemeField.`type` match {
                  case com.isuwang.org.apache.thrift.protocol.TType.STRING => success = iprot.readString
                  case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
                }
                case _ => com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.`type`)
              }
              iprot.readFieldEnd
            }

            iprot.readStructEnd
            val bean = getServiceMetadata_result(success)
            validate(bean)

            bean
          }

          @throws[TException]
          override def write(bean: getServiceMetadata_result, oproto: TProtocol): Unit = {
            validate(bean)
            oproto.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("getServiceMetadata_result"))

            oproto.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("success", com.isuwang.org.apache.thrift.protocol.TType.STRING, 0.asInstanceOf[Short]))
            oproto.writeString(bean.success)
            oproto.writeFieldEnd

            oproto.writeFieldStop
            oproto.writeStructEnd
          }

          @throws[TException]
          override def validate(bean: getServiceMetadata_result): Unit = {
            if (bean.success == null)
            throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空")
          }

          override def toString(bean: getServiceMetadata_result): String = if (bean == null) "null" else bean.toString

        }



  class getServiceMetadata extends SoaProcessFunction[com.today36524.schoolsoa.service.GradeService, getServiceMetadata_args, getServiceMetadata_result, GetServiceMetadata_argsSerializer, GetServiceMetadata_resultSerializer](
  "getServiceMetadata", new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer()) {

      override def isOneway: Boolean = false

      override def getEmptyArgsInstance: getServiceMetadata_args = getServiceMetadata_args()

      @throws[TException]
      override def getResult(iface: com.today36524.schoolsoa.service.GradeService, args: getServiceMetadata_args): getServiceMetadata_result = {

        val source = scala.io.Source.fromInputStream(GradeServiceCodec.getClass.getClassLoader.getResourceAsStream("com.today36524.schoolsoa.service.GradeService.xml"))
        val success = source.mkString
        source.close
        getServiceMetadata_result(success)
      }
      }

      class Processor(iface: com.today36524.schoolsoa.service.GradeService) extends SoaCommonBaseProcessor(iface, Processor.getProcessMap)

        object Processor{

          type PF = SoaProcessFunction[com.today36524.schoolsoa.service.GradeService, _, _, _ <: TCommonBeanSerializer[_], _ <: TCommonBeanSerializer[_]]

          def getProcessMap(): java.util.Map[String, PF] = {
             val map = new java.util.HashMap[String, PF]()
            map.put("findGradeById", new findGradeById)
              map.put("findGradesBySchool", new findGradesBySchool)
              
            map.put("getServiceMetadata", new getServiceMetadata)
            map
          }

        }
        }
      