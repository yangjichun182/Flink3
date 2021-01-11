package org.example.scalabasic.map
/**
 * Author   : jichun.yang
 * Date     : 2020-12-30
 * Function : scala 的map 遍历,生成新 map ，反转 key 和 value
 */
object scalaMap04 {
  def main(args: Array[String]): Unit = {
    val m = Map("Tom" -> 55, "Jak" -> 56, "Jim" -> 66)
    // 生成新 map ，反转 key 和 value
    for ((key, value) <- m)
      yield (value, key)
  }
}
