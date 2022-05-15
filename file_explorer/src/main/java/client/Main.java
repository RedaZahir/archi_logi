package client;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n---- WELCOME TO OUR EXPLORER ----\n\n");
        ClientImp client = new ClientImp();
        System.out.println(client.describe());
    }
}
