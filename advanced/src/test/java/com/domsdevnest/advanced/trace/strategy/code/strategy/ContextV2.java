package com.domsdevnest.advanced.trace.strategy.code.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 전략을 파라미터로 전달
 */
@Slf4j
public class ContextV2 {

    public void execute(Strategy strategy) {
        long startTime = System.currentTimeMillis();
        //비즈니스로직 실행
        strategy.call();
        //비즈니스로직 종료
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime={}", resultTime);
    }
}
