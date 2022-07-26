package behavioral.command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new SelectCommand(database),
                new UpdateCommand(database),
                new DeleteCommand(database),
                new InsertCommand(database)
        );

        developer.InsertRecord();
        developer.UpdateRecord();
        developer.SelectRecord();
        developer.DeleteRecord();


    }
}
