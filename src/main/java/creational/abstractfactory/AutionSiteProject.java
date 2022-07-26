package creational.abstractfactory;

import creational.abstractfactory.website.WebSiteTeamFatory;

public class AutionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFatory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating aution website...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
