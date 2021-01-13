package org.example.javabasic.algorithm;

/**
 * @author : chunji.yang
 * @date : 2021-01-12 21:50
 * @remark : 排序算法之选择排序
 */
public class SelectSortAlgorithm20210112 {

    public static void main(String[] args) {
        int arr[] = {8, 4, 2, 7, 3};
        selectSort(arr);
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i] + "]");
            }
        }
    }

    /**
     * 选择排序算法
     *
     * @param arr 选择排序的数组
     *            2021-01-13 21:34
     */
    public static void selectSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {  // arr.length-1 是因为最后一个元素已经不需要再进行比较了
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    //swap(arr[i],arr[j]);   //2021-01-13 21:48 这里有个问题，我将交换的这段代码抽象出来做成一个函数后交换的功能就没有起作用了，什么原因？
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    /**
     * 交换两个整数的值
     *
     * @param x 要交换的整数
     * @param y 交换的第二个整数
     *          2021-01-13 22:11
     */
    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;

        //System.out.println("i=" + i + "=====" + "j=" + j);
    }
}
