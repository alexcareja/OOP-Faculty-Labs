package com.oop_pub.exceptions.ex4;

import java.util.EnumSet;

public class EmailLogger extends LoggerBase {

    EmailLogger() {
        super();
    }

    EmailLogger(EnumSet<LogLevel> logs) {
        for(LogLevel l : logs) {
            if(l == LogLevel.FunctionalMessage || l == LogLevel.FunctionalError) {
                this.logs.add(l);
            }
        }
    }

    @Override
    protected void writeMessage(String m) {
        System.out.println("[Email]" + m);
    }
}
