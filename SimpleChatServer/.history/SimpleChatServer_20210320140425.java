import java.io.*;
import java.net.*;
import java.util.*;

public class SimpleChatServer {
    ArrayList clientOutputStreams;
    
    public class ClientHandler implements Runnable {
        BufferedReader isReader = new InputStreamReader(sock.getInputStream());
    }
}