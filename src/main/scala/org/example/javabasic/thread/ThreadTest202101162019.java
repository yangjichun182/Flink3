package org.example.javabasic.thread;

/**
 * @author : chunji.yang
 * @date : 2021-01-16 20:19
 * @remark : Java线程技术基础认识
 */
public class ThreadTest202101162019 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        String threadName = thread.getName();  //获取当前线程的名称
        System.out.println(threadName);
        System.out.println("===========================================");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        for (int i = 0; i < stackTrace.length; i++) {
            System.out.println(i);
        }
        System.out.println("===========================================");


    }
}
