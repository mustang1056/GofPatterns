package creational.abstractfactory.website;

import creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Manager manage website");
    }
}
