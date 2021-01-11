package org.example.flink.scala

import org.apache.flink.streaming.api.scala._
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment
import org.apache.flink.streaming.api.windowing.time.Time

/**
 * @author : chunji.yang
 * @date : 2020-11-22 14:13
 * @remark :通过socketTextStream的方式来获取数据进行流式计算
 */
object WindowWordCount {
  def main(args: Array[String]): Unit = {


    val env: StreamExecutionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment
    val text: DataStream[String] = env.socketTextStream("192.168.56.101", 9999)

    val counts = text
      .flatMap {
        _.toLowerCase.split("\\W+") filter {
          _.nonEmpty
        }
      }
      .map {
        (_, 1)
      }
      .keyBy(0)
      .timeWindow(Time.seconds(5))
      .sum(1)

    counts.print()

    env.execute("Window Stream WordCount")
  }
}
