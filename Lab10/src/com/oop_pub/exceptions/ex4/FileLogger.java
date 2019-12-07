package com.oop_pub.exceptions.ex4;

import java.io.File;
import java.util.EnumSet;

public class FileLogger extends LoggerBase{

    FileLogger() {
        super();
    }

    FileLogger(EnumSet<LogLevel> logs) {
        for(LogLevel l : logs) {
            if(l == LogLevel.Warning || l == LogLevel.Error) {
                this.logs.add(l);
            }
        }
    }

    @Override
    protected void writeMessage(String m) {
        System.out.println("[File]" + m);
    }
}
