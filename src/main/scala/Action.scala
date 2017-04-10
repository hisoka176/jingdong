import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

class Action(logFile:String){
      println(logFile)

      def loadData(){
      	  val spark = SparkSession.builder().appName("spark sql").getOrCreate()
	  import spark.implicits._
	  println(this.logFile)
	  val data = spark.read.option("header","true").option("encoding","gbk").csv(this.logFile);
	  data.createOrReplaceTempView("jdata_action")
	  val sqlDF = spark.sql("select * from jdata_action limit 10")
	  sqlDF.show()
	  val typeDF = spark.sql("select distinct(type) from jdata_action");
	  typeDF.show()
	  sqlString = "
	  	    select user_id,sku_id,
		    	   if(type='1',1,0) as type1,
			   if(type='2',2,0) as type2,
			   if(type='3',3,0) as type3,
			   if(type='4',4,0) as type4,
			   if(type='5',5,0) as type5,
			   if(type='6',6,0) as type6,
		    from jdata_action
		    
	  println("haha")
	  data.printSchema()
	  data.show()
	  }
}