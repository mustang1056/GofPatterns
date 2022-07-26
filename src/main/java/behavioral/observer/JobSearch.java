package behavioral.observer;

public class JobSearch {

    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubsriber = new Subsriber("Petrov");
        Observer secondSubscriber = new Subsriber("Ivanov");

        jobSite.addObserver(firstSubsriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java position");

        jobSite.removeVacancy("Third Java position");

    }

}
