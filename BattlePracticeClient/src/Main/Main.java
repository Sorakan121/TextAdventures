package Main;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();

        Socket socket = new Socket("localhost", 1234);
        Client client = new Client(socket, username);
        client.sendMessage();
        client.listenForMessage();
    }
}
