package creational.abstractfactory.banking;

import creational.abstractfactory.ProjectManager;

public class BankingPm implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.printf("Manager manage bank project");
    }
}
