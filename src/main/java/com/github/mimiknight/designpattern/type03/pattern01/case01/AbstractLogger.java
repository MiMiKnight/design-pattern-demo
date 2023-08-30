package com.github.mimiknight.designpattern.type03.pattern01.case01;

public abstract class AbstractLogger {

    public static final int DEBUG = 1;
    public static final int INFO = 2;
    public static final int ERROR = 3;

    protected int level;


    /**
     * 责任链中下一个日志记录器
     */
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}
