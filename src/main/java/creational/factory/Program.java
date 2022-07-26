package creational.factory;

public class Program {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("php");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("Java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("C++")) {
            return new CppDeveloperFactory();
        } else {
            return new PhpDeveloperFactory();
        }
    }
}
