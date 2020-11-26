package xyz.turboklaus.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import xyz.turboklaus.integrations.zuul.ZuulPluginProperties;

@SpringBootApplication
@EnableDiscoveryClient
public class BootstrapApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BootstrapApplication.class, args);
        ZuulPluginProperties.ZuulRouterExtendedProperties pluginProperties = context.getBean(ZuulPluginProperties.ZuulRouterExtendedProperties.class);
        System.out.println(pluginProperties.getRoutes());
    }

}
