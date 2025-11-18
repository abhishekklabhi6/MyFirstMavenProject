package com.Assignment;

public class ThreadsProgram {
    
    public static class ClassA extends Thread
    {
        public void run()
        {
            for(int i = 0; i < 100; i++)
            {
                System.out.println("Class A");
            }
        }
    }
    
    public static class ClassB extends Thread
    {
        public void run()
        {
            for(int i = 0; i < 100; i++)
            {
                System.out.println("Class B");
            }
        }
    }

    public static void main(String[] args) {
        Thread threada = new ClassA();
        Thread threadb = new ClassB();
        threada.start();
        threadb.start();
    }
}