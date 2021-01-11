package org.example.flink.java.source;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
/**
 * union可以将多个流合并到一个流中，以便对合并的流进行统一处理。是对多个流的水平拼接。
 * 这个例子是将三个socket端口发送来的数据合并到一个流中
 * 可以对这三个流发送来的数据，集中处理。
 */
public class FlinkUnionDemo {
    public static void main(String[] args) throws Exception {
        //1.获取执行环境配置信息
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        //2.定义加载或创建数据源（source）,监听9000端口的socket消息
        DataStream<String> textStream9000 = env.socketTextStream("hadoop01", 9000, "\n");
        DataStream<String> textStream9001 = env.socketTextStream("hadoop01", 9001, "\n");
        DataStream<String> textStream9002 = env.socketTextStream("hadoop01", 9002, "\n");

        DataStream<String> mapStream9000=textStream9000.map(s->"来自9000端口："+s);
        DataStream<String> mapStream9001=textStream9001.map(s->"来自9001端口："+s);
        DataStream<String> mapStream9002=textStream9002.map(s->"来自9002端口："+s);

        //3.union用来合并两个或者多个流的数据，统一到一个流中
        DataStream<String> result =  mapStream9000.union(mapStream9001,mapStream9002);

        //4.打印输出sink
        result.print();
        //5.开始执行
        env.execute();
    }
}
