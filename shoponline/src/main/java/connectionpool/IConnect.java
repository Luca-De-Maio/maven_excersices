package connectionpool;

public interface IConnect{

    void connectToDB();

    default void disconnectFromDB() {
        System.out.println("llamando de default");
    }

}
