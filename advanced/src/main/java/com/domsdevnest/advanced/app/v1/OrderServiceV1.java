package com.domsdevnest.advanced.app.v1;

import com.domsdevnest.advanced.trace.hellotrace.HelloTraceV1;
import com.domsdevnest.advanced.trace.TraceStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV1 {
    private final OrderRepositoryV1 orderRepository;
    private final HelloTraceV1 trace;

    public void orderItem(String itemId)
    {
        TraceStatus status = null;
        try {
            status = trace.begin("OrderServce.orderItem()");
            orderRepository.save(itemId);
            trace.end(status);
        } catch (Exception e) {
            trace.exception(status,e);
            throw e;
        }
    }
}
