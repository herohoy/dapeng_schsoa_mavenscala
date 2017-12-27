package com.today36524.schoolsoa

        import com.isuwang.dapeng.core._
        import com.isuwang.org.apache.thrift._
        import com.isuwang.dapeng.remoting.BaseCommonServiceClient
        import com.today36524.schoolsoa.SchoolServiceCodec._
        import scala.concurrent.{Future, Promise}
        import java.util.function.BiConsumer

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        **/
        object SchoolServiceAsyncClient extends BaseCommonServiceClient("com.today36524.schoolsoa.service.SchoolService", "1.0.0"){

        override def isSoaTransactionalProcess: Boolean = {

          var isSoaTransactionalProcess = false
          
          isSoaTransactionalProcess
        }

        
            /**
            * 

    query the schoolsoa name

            **/
            def findSchoolNameById(id:String , timeout: Long) : scala.concurrent.Future[String] = {

            initContext("findSchoolNameById");

            try {
              val _responseFuture = sendBaseAsync(findSchoolNameById_args(id), new FindSchoolNameById_argsSerializer(), new FindSchoolNameById_resultSerializer(), timeout).asInstanceOf[java.util.concurrent.CompletableFuture[findSchoolNameById_result]]

              val promise = Promise[String]()

              _responseFuture.whenComplete(new BiConsumer[findSchoolNameById_result, Throwable]{

              override def accept(r: findSchoolNameById_result, e: Throwable): Unit = {
                if(e != null)
                  promise.failure(e)
                else
                  promise.success(r.success)
                }
              })
              promise.future
            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }finally {
              destoryContext()
            }
          }
          
            /**
            * 
            **/
            def findSchoolById(id:String , timeout: Long) : scala.concurrent.Future[com.today36524.schoolsoa.bean.School] = {

            initContext("findSchoolById");

            try {
              val _responseFuture = sendBaseAsync(findSchoolById_args(id), new FindSchoolById_argsSerializer(), new FindSchoolById_resultSerializer(), timeout).asInstanceOf[java.util.concurrent.CompletableFuture[findSchoolById_result]]

              val promise = Promise[com.today36524.schoolsoa.bean.School]()

              _responseFuture.whenComplete(new BiConsumer[findSchoolById_result, Throwable]{

              override def accept(r: findSchoolById_result, e: Throwable): Unit = {
                if(e != null)
                  promise.failure(e)
                else
                  promise.success(r.success)
                }
              })
              promise.future
            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }finally {
              destoryContext()
            }
          }
          
            /**
            * 
            **/
            def findAllSchool( timeout: Long) : scala.concurrent.Future[List[com.today36524.schoolsoa.bean.School]] = {

            initContext("findAllSchool");

            try {
              val _responseFuture = sendBaseAsync(findAllSchool_args(), new FindAllSchool_argsSerializer(), new FindAllSchool_resultSerializer(), timeout).asInstanceOf[java.util.concurrent.CompletableFuture[findAllSchool_result]]

              val promise = Promise[List[com.today36524.schoolsoa.bean.School]]()

              _responseFuture.whenComplete(new BiConsumer[findAllSchool_result, Throwable]{

              override def accept(r: findAllSchool_result, e: Throwable): Unit = {
                if(e != null)
                  promise.failure(e)
                else
                  promise.success(r.success)
                }
              })
              promise.future
            }catch{
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            }finally {
              destoryContext()
            }
          }
          

      }
      