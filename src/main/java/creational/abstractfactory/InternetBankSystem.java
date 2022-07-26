package creational.abstractfactory;

import creational.abstractfactory.banking.BankingTeamFactory;

public class InternetBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Developer bank system");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
