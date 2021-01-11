package org.example.spark.scala

object Test {
  def main(args:Array[String]) :Unit ={
    val m = Map("Tom" -> 55,"Jak" -> 56,"Jim" -> 66)
    for ((key, value) <- m) {
      println("key is:" + key + " ,value is:" + value)
    }
  }
}
