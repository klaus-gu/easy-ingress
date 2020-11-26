package xyz.turboklaus.feign.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Turbo Klaus
 * @author <a href="mailto:guyue375@outlook.com">klaus</a>
 * @program easy-ingress
 **/
@RestController
public class FeignInvokeService {

    @Autowired
    private FeignInvoke feignInvoke;

    @GetMapping("feign/get")
    public String get(){
        return feignInvoke.hello();
    }
}
