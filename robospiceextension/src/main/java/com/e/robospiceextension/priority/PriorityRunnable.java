package com.e.robospiceextension.priority;

/**
 * A callable with priority, from <a href=
 * "http://stackoverflow.com/q/807223/693752">SOF</a>
 * @author SNI
 */
public interface PriorityRunnable extends Runnable {

    int getPriority();

}
