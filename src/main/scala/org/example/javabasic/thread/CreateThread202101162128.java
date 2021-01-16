package org.example.javabasic.thread;

/**
 * @author : chunji.yang
 * @date : 2021-01-16 21:28
 * @remark : Java线程技术，通过2种不同的方式来创建java线程
 */
public class CreateThread202101162128 {
    /**
     * <pre>
     * 问题列表：
     *        1）、为什么有了继承Thread的方式来创建一个线程还要用实现 Runnable的方式来创建一个线程
     *            a) 使用继承Thread类的方式来开发多线程应用程序在设计上是有局限性的，因为Java是单继承，不支持多继承，所以为了改变这种限制，可以使用实现Runnable接口的方式来实现多线程技术
     *            b) 将线程的任务从线程的子类中分离出来, 进行单独的封装, 按照面向对象的思想将任务封装为对象.
     * </pre>

     */
    public static void main(String[] args) {
        MyThread01 myThread = new MyThread01();  // 静态方法只能调用静态，所以这里要将内部类改为static，需要注意，static标识的变量或者类生命周期太长，资源回收不充分少用
        myThread.start();
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
            System.out.println(Thread.currentThread().getName());
        }
    }

    static class MyThread02 implements Runnable {

        @Override
        public void run() {
            System.out.println("实现Runnable的方式实现创建一个线程");
            System.out.println(Thread.currentThread().getName());
        }
    }


}



