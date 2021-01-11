package org.example.flink.java.source;

import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class SourceFromFile {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        DataStreamSource dataStream= env.readTextFile("D:\\tmp\\temp.txt");

        dataStream.print();

        env.execute("SourceFromFile");
    }

}
