package com.e.robospiceextension.request.listener;

public enum RequestStatus {
    PENDING, //
    READING_FROM_CACHE, //
    LOADING_FROM_NETWORK, //
    WRITING_TO_CACHE, //
    COMPLETE;
}
