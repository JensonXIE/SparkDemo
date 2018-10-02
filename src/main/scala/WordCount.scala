
object WordCount {
	
	def main(args: Array[String]): Unit = {
		val conf = new SparkConf().setAppName("wordcount")
		val sc = new SparkContext(conf)
		
		val input = sc.textFile("D:\\workspace\\IdeaProjects\\SparkDemo\\helloSpark.txt")
		val lines = input.flatMap(line=>line.split(" "))
		
	}
}
