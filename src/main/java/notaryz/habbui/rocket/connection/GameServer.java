package notaryz.habbui.rocket.connection;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.websocket.server.WebSocketHandler;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;

import java.io.IOException;
import java.net.InetSocketAddress;

public class GameServer {
    private Server wserver;
    private String iphost;
    private int porthost;

    public GameServer(String host, int port) throws Exception {
        this.iphost = host;
        this.porthost = port;
        init();
    }

    public void init() throws Exception {
        try {
            this.wserver = new Server(InetSocketAddress.createUnresolved(this.iphost, this.porthost));
            WebSocketHandler wsHandler = new WebSocketHandler() {
                @Override
                public void configure(WebSocketServletFactory factory) {
                    factory.register(GameServerHandler.class);
                }
            };
            /*this.headers = new THashMap<>();
            this.onlinewebsocket = new THashMap<>();
            headers.put(1, PingWS.class);
            headers.put(2, AuthentificationEvent.class);*/
            wserver.setHandler(wsHandler);
            wserver.start();
            //LOGGER.info("Started WebSocket on " + this.host + ":" + this.port);
        } catch (IOException ex) {
            //LOGGER.error("[WEBSOCKET] Failed to bind WebSocket server on " + this.host + ":" + this.port + " !");
            ex.printStackTrace();
            System.exit(0);
        }
    }
}
