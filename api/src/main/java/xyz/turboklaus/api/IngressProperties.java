package xyz.turboklaus.api;

import java.io.Serializable;

/**
 * @author Turbo Klaus
 * @author <a href="mailto:guyue375@outlook.com">klaus</a>
 * @program easy-ingress
 **/
public class IngressProperties implements Serializable {

    public static final String INGRESS_PROPERTIES_PREFIX = "easy.ingress";

    private boolean enabled = true;

    private boolean ssl;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isSsl() {
        return ssl;
    }

    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }
}
