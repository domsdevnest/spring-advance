package com.domsdevnest.advanced.trace.callback;

import com.domsdevnest.advanced.trace.TraceStatus;
import com.domsdevnest.advanced.trace.logtrace.LogTrace;

public class TraceTemplate {

    private final LogTrace trace;

    public TraceTemplate(LogTrace trace) {
        this.trace = trace;
    }

    public <T> T execute(String message, TraceCallback<T> callback) {
        TraceStatus status = null;
        try {
            status = trace.begin(message);
            T result = callback.call();

            trace.end(status);
            return result;
        } catch (Exception e) {
            trace.exception(status, e);
            throw new RuntimeException(e);
        }
    }
}
