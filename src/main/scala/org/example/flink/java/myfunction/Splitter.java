package org.example.flink.java.myfunction;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;

public class Splitter implements FlatMapFunction<String, Tuple2<String, Integer>> {
    public void flatMap(String value, Collector<Tuple2<String, Integer>> out) throws Exception {
        for (String word: value.split(" ")) {
            out.collect(new Tuple2<String, Integer>(word, 1));
        }
    }
}
