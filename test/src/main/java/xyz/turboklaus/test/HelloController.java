package xyz.turboklaus.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Turbo Klaus
 * @author <a href="mailto:guyue375@outlook.com">klaus</a>
 * @program easy-ingress
 **/
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "success";
    }
}
