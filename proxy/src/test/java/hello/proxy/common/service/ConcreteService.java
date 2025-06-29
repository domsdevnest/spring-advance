package hello.proxy.common.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
public class ConcreteService {
    public void call() {
        log.info("concreteservice call 호출");
    }
}