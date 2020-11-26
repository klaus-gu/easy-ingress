package xyz.turboklaus.feign.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Turbo Klaus
 * @author <a href="mailto:guyue375@outlook.com">klaus</a>
 * @program easy-ingress
 **/
@FeignClient(serviceId = "easy-ingress-test")
public interface FeignInvoke {
    @GetMapping("hello")
    String hello();
}
