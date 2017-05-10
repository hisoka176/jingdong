import org.apache.spark.sql.Row
import org.apache.spark.sql.SparkSession


class Hive{
      case class Record(key:Int,value:String)

      def nova(){
      	  val warehouseLocation = "hdfs://localhost:9000/user/hive/warehouse/jingdong.db"
	  val spark = SparkSession.builder()
	      .appName("spark hive Example")
	      .config("spark.sql.warehouse.dir",warehouseLocation)
	      .enableHiveSupport()
	      .getOrCreate()

	  import spark.implicits._
	  import spark.sql

	  sql("use jingdong")
	  sql("show tables").show()
	  sql("show databases").show()
	  spark.stop()
	  }
	  }