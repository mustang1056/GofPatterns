package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunnner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<Developer>();

        developers.add(developerFactory.getDeveloperBySpeciality("Java"));
        developers.add(developerFactory.getDeveloperBySpeciality("Java"));
        developers.add(developerFactory.getDeveloperBySpeciality("Java"));
        developers.add(developerFactory.getDeveloperBySpeciality("Java"));
        developers.add(developerFactory.getDeveloperBySpeciality("Java"));
        developers.add(developerFactory.getDeveloperBySpeciality("Java"));
        developers.add(developerFactory.getDeveloperBySpeciality("Java"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));

        for(Developer developer: developers){
            developer.writeCode();
        }
    }
}
