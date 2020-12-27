package notaryz.habbui.rocket.connection.packets.incoming;

import org.eclipse.jetty.websocket.api.Session;

public abstract class EventPacket {
    public String message;
    public Session session;

    public EventPacket(){};

    public abstract void handle() throws Exception;
}
