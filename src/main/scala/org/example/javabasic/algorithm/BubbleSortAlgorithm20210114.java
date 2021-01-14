package org.example.javabasic.algorithm;

/**
 * @author : chunji.yang
 * @date : 2021-01-14 20:50
 * @remark : 排序算法之冒泡排序
 */
public class BubbleSortAlgorithm20210114 {
    public static void main(String[] args) {
        int arr[] = {8, 4, 2, 7, 3};
        BubbleSort(arr);
        printArray(arr);
    }

    /**
     * <pre>
     * 冒泡排序算法：
     * 1、算法原理：比较两个相邻的元素，将值大的元素右移。
     *
     * 2、算法思路：首先第一个元素和第二个元素比较，如果第一个大，则二者交换，否则不交换；然后第二个元素和第三个元素比较，如果第二个大，则二者交换，否则不交换……一直执行下去，
     *            最终最大的那个元素被交换到最后，一趟冒泡排序完成。最坏的情况是排序是逆序的。
     * </pre>
     *
     * @param arr 要进行排序的数组
     *            2021-01-14 22:06
     */
    public static void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {  //-i 是因为排过序之后最大的在后面不用比较了，-1 是为了避免数组角标越界
                if (arr[j] > arr[j + 1]) { //数组中的相邻2个元素进行比较，前面比后面的大就交换位置
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * <pre>
     *     功能：打印数组元素
     *
     * </pre>
     *
     * @param arr 打印的数组
     *            2021-01-14 22:10
     */
    public static void printArray(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i] + "]");
            }
        }
    }
}
