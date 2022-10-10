package dataHora;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerTCPDataHora {

    public static void main(String[] args) {
        try{
            ServerSocket Servidor = new ServerSocket(7000);
            while (true){
                System.out.println("Esperando clientes...");

                Socket socket = Servidor.accept();

                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                out.writeBytes("Data e Hora do Servidor:    " + (new Date()));
                out.close();
                socket.close();
            }
        }catch (Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
}
