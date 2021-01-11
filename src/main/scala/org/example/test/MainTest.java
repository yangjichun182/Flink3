package org.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List list = Arrays.asList(1, 2, 3, 4);
        ArrayList arrayList = new ArrayList(list);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i);
        }
    }
}
