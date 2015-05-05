package com.kigesui.main;

import org.apache.log4j.Logger;
//import org.apache.log4j.BasicConfigurator;

public class Driver {

    static Logger logger = Logger.getLogger(Driver.class);

    public static void main(String[] args) {
//        BasicConfigurator.configure();
        System.out.println("Hello World!");
        logger.info("hello world");
    }

    public static int add(int a, int b) {
        return a + b;
    }

}
