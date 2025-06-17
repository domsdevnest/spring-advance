package hello.proxy.app.v1;

import org.springframework.web.bind.annotation.*;

@RequestMapping
@ResponseBody
//@RestController -- 스프링 부트 3.0 이상에서 필수
public interface OrderControllerV1 {
    @GetMapping("/v1/request")
    String request(@RequestParam("itemId") String itemId);

    @GetMapping("/v1/no-log")
    String noLog();

}
