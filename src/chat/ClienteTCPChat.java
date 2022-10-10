package chat;

import java.io.DataInputStream;
import java.net.Socket;

public class ClienteTCPChat {
    public static void main(String[] args) throws Exception {
        Socket Cliente = new Socket("10.100.36.125", 7000);

        DataInputStream in = new DataInputStream(Cliente.getInputStream());

        System.out.println(in.readLine());

        in.close();

        Cliente.close();
    }
}
