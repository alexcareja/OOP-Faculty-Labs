package com.oop_pub.exceptions.ex4;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public abstract class LoggerBase {
    private LoggerBase next = null;
    protected List<LogLevel> logs = new ArrayList<>();
    //private String m;
    LoggerBase(EnumSet<LogLevel> logs) {
        this.logs.addAll(logs);
    }

    protected LoggerBase() {
    }

    public void setNext(LoggerBase l) {
        this.next = l;
    }

    protected abstract void writeMessage(String m);

    public void message(String m, LogLevel log) {
        for(LogLevel l : this.logs) {
            if(l == log) {
                this.writeMessage(m);
            }
        }
        if (next != null) {
            next.message(m, log);
        }
    }
}
