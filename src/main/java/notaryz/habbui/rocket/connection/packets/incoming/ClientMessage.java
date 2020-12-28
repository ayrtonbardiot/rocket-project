package notaryz.habbui.rocket.connection.packets.incoming;

import java.nio.ByteBuffer;

public class ClientMessage {
    private final int header;
    private ByteBuffer buffer = null;

    public ClientMessage(int header, ByteBuffer buf){
        this.header = header;
        this.buffer = buf;
    }

    public int readShort() {
        try {
            return this.buffer.getShort();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

    public Integer readInt() {
        try {
            return this.buffer.getInt();
        } catch (Exception e) {
        }

        return 0;
    }

    public boolean readBoolean() {
        try {
            return this.buffer.get() == 1;
        } catch (Exception e) {
        }

        return false;
    }

    public String readString() {
        try {
            int length = this.readShort();
            byte[] data = new byte[length];
            this.buffer.get(data);
            return new String(data);
        } catch (Exception e) {
            return "";
        }
    }
}
