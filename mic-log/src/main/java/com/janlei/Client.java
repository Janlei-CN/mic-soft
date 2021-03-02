package com.janlei;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client {

    private static final Logger LOG = LogManager.getLogger(Client.class);

    public static void main(String[] args) {
        LOG.info("test:{}", "张三");
    }

    public String test(String name){

        return name;
    }
}
