public class FakeDatabaseConnector {
    private static FakeDatabaseConnector instance;
    private static boolean isConnected = false;
    private static String address;

    private FakeDatabaseConnector(){}

    public static FakeDatabaseConnector getInstance(){
        if(instance == null)
            instance = new FakeDatabaseConnector();

        return instance;
    }

    public void DatabaseConnect(String address){
        isConnected = true;
        FakeDatabaseConnector.address = address;
        System.out.println("Połączono z serwerem " + address);
    }

    public void DatabaseDisconnect(){
        isConnected = false;
        FakeDatabaseConnector.address = "";
        System.out.println("Rozłaczono z serwerem");
    }

    public boolean getIsConnected(){
        return isConnected;
    }

    public String getAddress() {
        return address;
    }

    public void getConnection(){
        if(isConnected)
            System.out.println("Połaczono z " + address);
        else
            System.out.println("Brak połącznia z serwerem");
    }

    public void FakeQuery(String query){
        if(isConnected){
            System.out.println("Wykonano zapytanie " + query);
        }
        else {
            System.out.println("Brak połączenia z serwerem");
        }
    }
}
