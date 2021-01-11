package org.example.scalabasic.map
/**
 * Author   : jichun.yang
 * Date     : 2020-12-30
 * Function : scala 的map 遍历,遍历 map 的 key
 */
object scalaMap03 {
  def main(args: Array[String]): Unit = {
    val m = Map("Tom" -> 55,"Jak" -> 56,"Jim" -> 66)
    // 遍历 map 的 value
    for (ele <- m.values) {
      println("value is " + ele)
    }
  }
}
