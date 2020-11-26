package xyz.turboklaus.integrations.zuul;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import static xyz.turboklaus.api.IngressProperties.INGRESS_PROPERTIES_PREFIX;
import static xyz.turboklaus.integrations.zuul.ZuulPluginProperties.ZUUL_PLUGIN_PROPERTIES_PREFIX;
import static xyz.turboklaus.integrations.zuul.ZuulPluginProperties.ZuulRouterExtendedProperties.ZUUL_EXTENDED_PROPERTIES_PREFIX;

/**
 * @author Turbo Klaus
 * @author <a href="mailto:guyue375@outlook.com">klaus</a>
 * @program easy-ingress
 **/
@Getter
@Setter
@ToString
@NoArgsConstructor
@ConfigurationProperties(prefix = ZUUL_PLUGIN_PROPERTIES_PREFIX)
public class ZuulPluginProperties implements Serializable {

    public static final String ZUUL_PLUGIN_PROPERTIES_PREFIX = INGRESS_PROPERTIES_PREFIX + ".zuul";

    private boolean enabled = true;

    @Getter
    @Setter
    @ToString
    @NoArgsConstructor
    @ConfigurationProperties(prefix = ZUUL_EXTENDED_PROPERTIES_PREFIX)
    public static class ZuulRouterExtendedProperties {

        public static final String ZUUL_EXTENDED_PROPERTIES_PREFIX = ZUUL_PLUGIN_PROPERTIES_PREFIX + ".ext";

        /**
         * Map of route names to properties.
         */
        private Map<String, ZuulExtendedRoute> routes = new LinkedHashMap<>();

        @Getter
        @Setter
        @ToString
        public static class ZuulExtendedRoute extends ZuulProperties.ZuulRoute {

            private String version;

            private SwaggerProperties swagger = new SwaggerProperties();
        }

        @Getter
        @Setter
        @ToString
        public static class SwaggerProperties {

            private boolean enabled = false;
        }
    }
}
