package xyz.turboklaus.bootstrap;

import com.netflix.loadbalancer.LoadBalancerBuilder;
import com.netflix.loadbalancer.ZoneAwareLoadBalancer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@EnableDiscoveryClient
public class BootstrapApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BootstrapApplication.class, args);
        ZoneAwareLoadBalancer zoneAwareLoadBalancer = LoadBalancerBuilder.newBuilder().withDynamicServerList(new LocalbasedServerList()).buildDynamicServerListLoadBalancer();
        zoneAwareLoadBalancer.getAllServers();
    }
}
