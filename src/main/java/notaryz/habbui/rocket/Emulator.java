package notaryz.habbui.rocket;

import notaryz.habbui.rocket.configuration.ConfigurationManager;
import sun.security.tools.jarsigner.TimestampedSigner;

import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

public class Emulator {
    private static ConfigurationManager configurationManager;

    public static void main(String[] args) throws IOException {
        Timestamp timestampStart = new Timestamp(System.currentTimeMillis());
        System.out.println("        |\n" +
                "       / \\\n" +
                "      / _ \\\n" +
                "     |.o '.|\n" +
                "     |'._.'|\n" +
                "     |     |\n" +
                "   ,'|  |  |`.\n" +
                "  /  |  |  |  \\\n" +
                "  |,-'--|--'-.|");
        System.out.println("RocketProject - by nttZx#0013");
        System.out.println("© Tous droits réservés - 2021");

        configurationManager = new ConfigurationManager("config.ini");
        System.out.println("Configuration ---> chargé !");


    }

}
