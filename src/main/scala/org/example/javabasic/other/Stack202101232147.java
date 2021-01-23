package org.example.javabasic.other;

/**
 * @author : chunji.yang
 * @date : 2021-01-23 21:48
 * @remark : Java模拟堆栈
 */
public class Stack202101232147 {
    /**
     * 存储区域
     */
    int[] data;
    /**
     * 最大存储量
     */
    int maxSize;
    int top;
    //constructor
    public Stack202101232147(int maxSize) {
        this.maxSize = maxSize;
        this.data = new int[maxSize];
        top = -1;
    }

    public static void main(String[] args) throws Exception {
        Stack202101232147 stack = new Stack202101232147(1000);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        while (stack.top >= 0) {
            System.out.println(stack.pop());
        }
    }


    /**
     * 将数据放入堆栈
     *
     * @param data
     * @return
     */
    public boolean push(int data) {
        if (top + 1 == maxSize) {
            System.out.println("队站已满");
            return false;
        }
        this.data[++top] = data;
        return true;
    }

    /**
     * 将数据取出堆栈
     *
     * @return
     * @throws Exception
     */
    public int pop() throws Exception {
        if (top == -1) {
            throw new Exception("堆栈已空");
        }
        return this.data[top--];
    }


}
