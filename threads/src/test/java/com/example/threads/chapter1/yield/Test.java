package com.example.threads.chapter1.yield;

public class Test {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
