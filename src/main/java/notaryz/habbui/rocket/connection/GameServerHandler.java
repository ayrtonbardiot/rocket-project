package notaryz.habbui.rocket.connection;

import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;
import org.eclipse.jetty.websocket.api.Session;

import java.io.IOException;

@WebSocket
public class GameServerHandler {

    @OnWebSocketConnect
    public void onConnect(Session session) throws IOException {
        System.out.println("[WEBSOCKET] New connection from " + session.getRemoteAddress().getHostString());
    }
}
