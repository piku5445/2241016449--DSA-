package java11.fundamentals.chapter18;

public class LambdaFunctionalInterfaceExample {

    interface printingSomeText {
        void print(String anyValue);
    }

    public void printLambdaText(String lambdaText, printingSomeText pst) {
        pst.print(lambdaText);
    }

    public static void main(String[] args) {
        LambdaFunctionalInterfaceExample lmd1 = new LambdaFunctionalInterfaceExample();
        String lambdaText = "Understanding Lambdas";

        // Using lambda expression
        printingSomeText pst = (String letsPrint) -> {
            System.out.println(letsPrint);
        };

        lmd1.printLambdaText(lambdaText, pst);
    }
}
