import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object Test{
       def main(args:Array[String]){
       	   val hive = new Hive()
	   hive.nova()

       }
}