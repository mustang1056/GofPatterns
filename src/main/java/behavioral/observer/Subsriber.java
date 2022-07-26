package behavioral.observer;

import java.util.List;

public class Subsriber implements Observer{
    String name;

    public Subsriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear "+name+"\n some hanges in vacancies \n" +vacancies);
    }
}
