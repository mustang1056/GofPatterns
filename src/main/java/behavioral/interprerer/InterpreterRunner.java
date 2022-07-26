package behavioral.interprerer;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEEExpression();

        System.out.println("Does developers knows Java Core: "+isJava.interpret("Java Core"));
        System.out.println("Does developers knows Java EE: "+isJavaEE.interpret("Java Spring"));
    }

    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression(){
        Expression java = new TerminalExpression("Java");
        Expression javaSpring = new TerminalExpression("Spring");

        return new AndExpresssion(java, javaSpring);
    }
}
