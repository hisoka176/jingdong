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
	  data.show()
	  }
}