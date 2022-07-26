package behavioral.command;

public class Developer {
    Command select;
    Command update;
    Command delete;
    Command insert;

    public Developer(Command select, Command update, Command delete, Command insert) {
        this.select = select;
        this.update = update;
        this.delete = delete;
        this.insert = insert;
    }

    public void InsertRecord(){
        insert.execute();
    }
    public void UpdateRecord(){
        update.execute();
    }
    public void SelectRecord(){
        select.execute();
    }
    public void DeleteRecord(){
        delete.execute();
    }



}
