package com.domsdevnest.advanced.trace.logtrace;

import com.domsdevnest.advanced.trace.TraceStatus;

public interface LogTrace {

    TraceStatus begin(String message);

    void end(TraceStatus status);

    void exception(TraceStatus status, Exception e);
}
