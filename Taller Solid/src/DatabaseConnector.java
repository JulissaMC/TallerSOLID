public class DatabaseConnector {
    private Database database;

    public DatabaseConnector(Database database) {
        this.database = database;
    }

    public void connect() {
        System.out.println("Connecting to database...");
    }
}