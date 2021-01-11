package org.example.flink.scala

import org.apache.flink.streaming.api.scala._
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment


object WindowWordCount1 {
  def main(args: Array[String]): Unit = {
    val strPath = "D:\\tmp\\temp.txt"
    val env: StreamExecutionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment
    val ds = env.readTextFile(strPath)
    val result_ds = ds
      .flatMap(_.split(" "))
      .map((_, 1))
      .keyBy(0)
      .sum(1)
    result_ds.print();

    env.execute("WindowWordCount1")
  }
}
