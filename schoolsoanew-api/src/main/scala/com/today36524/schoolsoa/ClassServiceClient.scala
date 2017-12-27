package com.today36524.schoolsoa

        import com.isuwang.dapeng.core._
        import com.isuwang.org.apache.thrift._
        import com.isuwang.dapeng.remoting.BaseCommonServiceClient
        import com.today36524.schoolsoa.ClassServiceCodec._

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        **/
        object ClassServiceClient extends BaseCommonServiceClient("com.today36524.schoolsoa.service.ClassService", "1.0.0"){

        override def isSoaTransactionalProcess: Boolean = {

          var isSoaTransactionalProcess = false
          
          isSoaTransactionalProcess
        }

        
         /**
         * 

    query class

         **/

            def findClassById(id:String ) : com.today36524.schoolsoa.bean.Clazz = {

            initContext("findClassById");

            try {
              val response = sendBase(findClassById_args(id), new FindClassById_argsSerializer(), new FindClassById_resultSerializer())

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

            def findClassesByGrade(gradeId:String ) : List[com.today36524.schoolsoa.bean.Clazz] = {

            initContext("findClassesByGrade");

            try {
              val response = sendBase(findClassesByGrade_args(gradeId), new FindClassesByGrade_argsSerializer(), new FindClassesByGrade_resultSerializer())

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
      