package notaryz.habbui.rocket.connection.packets;

import notaryz.habbui.rocket.connection.packets.incoming.EventPacket;
import notaryz.habbui.rocket.connection.packets.incoming.IncomingHeaders;
import notaryz.habbui.rocket.connection.packets.incoming.handshake.SecureLoginEvent;

import java.util.HashMap;

public class PacketManager {

    private final HashMap<Integer, Class<? extends EventPacket>> incoming;

    public PacketManager(){
        this.incoming = new HashMap<>();
        this.registerHandshake();
    }

    private void registerHandshake(){
        this.incoming.put(IncomingHeaders.SecureLoginEvent, SecureLoginEvent.class);
    }
}
