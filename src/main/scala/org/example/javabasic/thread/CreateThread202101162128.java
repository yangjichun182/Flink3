package org.example.javabasic.thread;

/**
 * @author : chunji.yang
 * @date : 2021-01-16 21:28
 * @remark : Java线程技术，通过2种不同的方式来创建java线程
 */
public class CreateThreadOne202101162128 {
    public static void main(String[] args) {
        MyThread01 myThread = new MyThread01();  // 静态方法只能调用静态，所以这里要将内部类改为static，需要注意，static标识的变量或者类生命周期太长，资源回收不充分少用
        myThread.run();
        System.out.println("===============================================");
        MyThread02 myThread02 = new MyThread02();
        myThread02.run();
    }

    /**
     * @date ：2021-01-16 21:31
     * @remark :继承Thread 的方式创建线程
     */
    static class MyThread01 extends Thread {
        @Override
        public void run() {
            super.run();
            System.out.println("继承Thread方式创建线程");
        }
    }

    static class MyThread02 implements Runnable {

        @Override
        public void run() {
            System.out.println("实现Runnable的方式实现创建一个线程");
        }
    }
}



