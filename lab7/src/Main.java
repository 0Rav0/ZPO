public class Main {
    public static void main(String[] args) {
        FakeDatabaseConnector databaseConnector1 = FakeDatabaseConnector.getInstance();
        FakeDatabaseConnector databaseConnector2 = FakeDatabaseConnector.getInstance();

        databaseConnector1.FakeQuery("SELECT * FROM names");
        databaseConnector1.DatabaseConnect("192.168.1.100");
        databaseConnector2.FakeQuery("SELECT * FROM names");
        databaseConnector2.getConnection();
    }
}