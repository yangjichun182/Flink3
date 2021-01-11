package org.example.scalabasic.map

/**
 * Author   : jichun.yang
 * Date     : 2020-12-30
 * Function : scala 的map 遍历,遍历 map 的 key 和 value
 */
object scalaMap {
  def main(args: Array[String]): Unit = {
    val m = Map("Tom" -> 55,"Jak" -> 56,"Jim" -> 66)
    for ((key, value) <- m) {
      println("key is:" + key + " ,value is:" + value)
    }
  }
}
