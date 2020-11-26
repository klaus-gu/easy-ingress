package xyz.turboklaus.integrations.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

/**
 * @author Turbo Klaus
 * @author <a href="mailto:guyue375@outlook.com">klaus</a>
 * @program easy-ingress
 **/
public class ZuulRequestPreFilter extends ZuulFilter implements InitializingBean {

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        System.out.println("拦截请求。。。");
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
    }
}
