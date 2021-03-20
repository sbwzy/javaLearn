import java.io.*;
import java.net.*;
import java.util.*;

public class SimpleChatServer {
    ArrayList clientOutputStreams;
    
    public class ClientHandler implements Runnable {
        BufferedReader reader;
        Socket sock;

        public ClientHandler(Socket clientSocket) {
            try {
                sock = clientSocket;
                InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(isReader);
            } catch(Exception ex) {ex.printStackTrace();}
        }

        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("read" + message);
                    tellEveryone(message);
                }
            } catch (Exception ex) {ex.printStackTrace();}
        }
    }

    public static void main (String[] args) {
        new SimpleChatServer().go();
    }

    public void go() {
        clientOutputStreams = new ArrayList();
        try {
            ServerSocket ServerSock = new ServerSocket(5000);

            while (true) {
                Socket clientSocket = serverSock.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientOutputStreams.add(writer);

                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
                System.out.println("got a connection");
            }
        } catch (Exception ex) {ex.printStackTrace();}
    }

    
}