package com.example.step1.log;

import java.util.HashMap;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.logging.Logger;

public class Test {
    private static Logger log = Logger.getLogger(Test.class.toString());

    public static void main(String[] args) {
        // 级别依次升高，后面的日志级别会屏蔽之前的级别
        log.finest("finest");
        log.finer("finer");
        log.fine("fine");
        log.config("config");
        log.info("info");
        log.warning("warning");
        log.severe("server");



    }
}