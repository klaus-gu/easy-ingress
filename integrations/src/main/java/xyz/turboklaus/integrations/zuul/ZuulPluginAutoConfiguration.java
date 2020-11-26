package xyz.turboklaus.integrations.zuul;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.ZuulProxyAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static xyz.turboklaus.integrations.zuul.ZuulPluginProperties.ZUUL_PLUGIN_PROPERTIES_PREFIX;

/**
 * @author Turbo Klaus
 * @author <a href="mailto:guyue375@outlook.com">klaus</a>
 * @program easy-ingress
 **/
@Configuration
@EnableZuulProxy
@ConditionalOnProperty(
        prefix = ZUUL_PLUGIN_PROPERTIES_PREFIX,
        value = "enabled",
        havingValue = "true",
        matchIfMissing = true)
@EnableConfigurationProperties({
        ZuulPluginProperties.class,
        ZuulPluginProperties.ZuulRouterExtendedProperties.class
})
@AutoConfigureBefore(ZuulProxyAutoConfiguration.class)
public class ZuulPluginAutoConfiguration {

    @Bean
    ZuulPropertiesBeanPostProcessor zuulPropertiesBeanPostProcessor() {
        return new ZuulPropertiesBeanPostProcessor();
    }

    @Bean
    public ZuulRequestPreFilter zuulRequestPreFilter(){
        return new ZuulRequestPreFilter();
    }

    @Bean
    public ZuulRequestPreAccessFilter zuulRequestPreAccessFilter(){
        return new ZuulRequestPreAccessFilter();
    }

    @Bean
    public ZuulResponsePostFilter zuulResponsePostFilter(){
        return new ZuulResponsePostFilter();
    }
}
