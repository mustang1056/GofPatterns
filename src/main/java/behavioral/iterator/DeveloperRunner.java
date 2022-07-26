package behavioral.iterator;

public class DeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreSQl"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Max", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: "+javaDeveloper.getName());
        System.out.println("Skill: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + "");
        }

    }
}
