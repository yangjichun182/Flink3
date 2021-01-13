package org.example.javabasic;

/**
 * @author : chunji.yang
 * @date : 2021-01-12 20:49
 * @remark : 获取数组的最大值和最小值
 */
public class ArrayMax202101122048 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 10, 13};
        int max = getArrayMax(arr);
        System.out.println("数组中的最大值：" + max);
        System.out.println("==============================");
        int min = getArrayMin(arr);
        System.out.println("数组的最小值:" + min);
    }

    /**
     * @param arr 传入一个整数类型的数组
     * @return 返回数组中的最大值
     */
    public static int getArrayMax(int arr[]) {
        int max = 0;  // 定义一个变量接收最大值，初始化为0
        for (int i = 0; i < arr.length; i++) { //遍历数组
            if (arr[i] > max)
                max = arr[i];  //如果数组中的元素的值比max就将该值赋予max
        }
        return max;
    }

    /**
     * 获取浮点类型数组中的最大值，这个方法是上面的方法的重载
     *
     * @param arr 传入一个浮点类型的数组
     * @return 返回数组中的最大值
     */
    public static double getArrayMax(double arr[]) {
        double max = 0.0;  // 定义一个变量接收最大值，初始化为0
        for (int i = 0; i < arr.length; i++) { //遍历数组
            if (arr[i] > max)
                max = arr[i];  //如果数组中的元素的值比max就将该值赋予max
        }
        return max;
    }

    /**
     * 获取数组中的最小值
     *
     * @param arr 传入的数组
     * @return 返回数组中的最小值
     */
    public static int getArrayMin(int arr[]) {
        int min = 0;  //定义一个变量接收最小值，初始化为0
        for (int i = 0; i < arr.length; i++) { // 2021-01-12 22:03 修改，这里需要注意一下，数组的角标是从 0 开始的，那么长度就应该是小于数组的长度，故而这里只能够小于
            if (min > arr[i]) //数组内的值和min进行比较，小于min的值就将该值赋值给min
                min = arr[i];
        }
        return min;
    }

    /**
     * 获取数组中的最小值,这个方法是上面方法的重载，重载要素：方法名称相同，参数不同，返回数据类型不同
     *
     * @param arr 传入的数组
     * @return 返回数组中的最小值
     */
    public static double getArrayMin(double arr[]) {
        double min = 0.0;  //定义一个变量接收最小值，初始化为0
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) //数组内的值和min进行比较，小于min的值就将该值赋值给min
                min = arr[i];
        }
        return min;
    }
}
