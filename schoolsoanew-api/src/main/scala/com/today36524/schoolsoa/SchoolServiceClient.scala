package com.today36524.schoolsoa

        import com.isuwang.dapeng.core._
        import com.isuwang.org.apache.thrift._
        import com.isuwang.dapeng.remoting.BaseCommonServiceClient
        import com.today36524.schoolsoa.SchoolServiceCodec._

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        **/
        object SchoolServiceClient extends BaseCommonServiceClient("com.today36524.schoolsoa.service.SchoolService", "1.0.0"){

        override def isSoaTransactionalProcess: Boolean = {

          var isSoaTransactionalProcess = false
          
          isSoaTransactionalProcess
        }

        
         /**
         * 

    query the schoolsoa name

         **/

            def findSchoolNameById(id:String ) : String = {

            initContext("findSchoolNameById");

            try {
              val response = sendBase(findSchoolNameById_args(id), new FindSchoolNameById_argsSerializer(), new FindSchoolNameById_resultSerializer())

              response.success

            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }
            finally {
              destoryContext();
            }
            }
          
         /**
         * 
         **/

            def findSchoolById(id:String ) : com.today36524.schoolsoa.bean.School = {

            initContext("findSchoolById");

            try {
              val response = sendBase(findSchoolById_args(id), new FindSchoolById_argsSerializer(), new FindSchoolById_resultSerializer())

              response.success

            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }
            finally {
              destoryContext();
            }
            }
          
         /**
         * 
         **/

            def findAllSchool() : List[com.today36524.schoolsoa.bean.School] = {

            initContext("findAllSchool");

            try {
              val response = sendBase(findAllSchool_args(), new FindAllSchool_argsSerializer(), new FindAllSchool_resultSerializer())

              response.success

            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }
            finally {
              destoryContext();
            }
            }
          

        /**
        * getServiceMetadata
        **/
        @throws[SoaException]
        def getServiceMetadata: String = {
          initContext("getServiceMetadata")
          try {
            val _request = new getServiceMetadata_args()
            val _response = sendBase(_request, new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer())
            _response.success
          }catch{
            case e: SoaException => throw e
            case e: TException => throw new SoaException(e)
          }
          finally {
            destoryContext()
          }
        }

        }
      