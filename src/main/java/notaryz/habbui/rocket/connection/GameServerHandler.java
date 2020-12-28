package notaryz.habbui.rocket.connection;

import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;
import org.eclipse.jetty.websocket.api.Session;

import java.io.IOException;

@WebSocket
public class GameServerHandler {

    @OnWebSocketConnect
    public void onConnect(Session session){
        System.out.println("[WEBSOCKET] New connection from " + session.getRemoteAddress().getHostString());
    }

    @OnWebSocketMessage
    public void onMessage(Session session, byte[] data, int offset, int length){
        System.out.println("New packet received. " + session.getRemoteAddress().getHostString());
    }
}
