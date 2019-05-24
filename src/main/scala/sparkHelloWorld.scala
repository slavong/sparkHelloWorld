object sparkHelloWorld extends App {
  import org.apache.spark.SparkContext
  import org.apache.spark.SparkContext._
  import org.apache.spark.SparkConf

  println("hello, spark!")

  val conf = new SparkConf().setAppName("sparkHelloWorld")
  val sc = new SparkContext(conf)
  val df = sc.parallelize(Array(1,2,3))

  df.collect().foreach(println)
  sc.stop()

}