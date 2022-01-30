package repository;

public class MySQLConfiguration {
    private String host;
    private int port;
    private String username;
    private String password;

    public MySQLConfiguration() {
        this.host = "localhost";
        this.port = 3307;
        this.username = "root";
        this.password = "";
    }

    public MySQLConfiguration(String host, int port, String username, String password) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
    }
}
