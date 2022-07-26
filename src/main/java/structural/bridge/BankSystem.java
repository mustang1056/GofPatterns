package structural.bridge;

public class BankSystem extends Program {

    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developeProgram() {
        System.out.println("Bank system development in progress");
        developer.writeCode();
    }
}
