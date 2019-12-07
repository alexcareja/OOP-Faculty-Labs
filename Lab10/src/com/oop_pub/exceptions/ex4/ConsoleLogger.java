package com.oop_pub.exceptions.ex4;

import java.util.EnumSet;

public class ConsoleLogger extends LoggerBase {

    ConsoleLogger(){
        super();
    }

    ConsoleLogger(EnumSet<LogLevel> logs) {
        super(logs);
    }

    @Override
    protected void writeMessage(String m) {
        System.out.println("[Console]" + m);
    }
}
