package org.example.javabasic.other;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author : chunji.yang
 * @date   : 2021-01-11 22:27
 * @remark : 实现将数据写到文件里面
 */
public class FileRead202101112149 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("F:\\workspace\\Flink3\\src\\main\\resources\\a.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("123");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
