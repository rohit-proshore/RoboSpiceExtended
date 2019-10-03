package com.e.robospiceextension.request;

public interface RequestProcessorListener {
    void requestsInProgress();

    void allRequestComplete();
}
