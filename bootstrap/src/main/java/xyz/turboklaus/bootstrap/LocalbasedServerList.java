package xyz.turboklaus.bootstrap;


import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Turbo Klaus
 * @author <a href="mailto:guyue375@outlook.com">klaus</a>
 * @program easy-ingress
 * 基于本地配置的服务列表
 **/
public class LocalbasedServerList implements ServerList<Server> {
    @Override
    public List<Server> getInitialListOfServers() {
        List<Server> servers = new ArrayList<>();
        servers.add(new Server("127.0.0.1",8001));
        servers.add(new Server("127.0.0.1",8002));
        servers.add(new Server("127.0.0.1",8003));
        return servers;
    }

    @Override
    public List<Server> getUpdatedListOfServers() {
        List<Server> servers = new ArrayList<>();
        servers.add(new Server("127.0.0.1",8001));
        servers.add(new Server("127.0.0.1",8002));
        servers.add(new Server("127.0.0.1",8003));
        return servers;
    }
}
