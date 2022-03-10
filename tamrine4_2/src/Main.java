import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws no_answer {
        Scanner SC=new Scanner(System.in);
        double a,b,c;
        System.out.print("a: ");
        a= SC.nextDouble();
        System.out.print("b: ");
        b= SC.nextDouble();
        System.out.print("c: ");
        c= SC.nextDouble();
        The_quadratic_equation Eq=new The_quadratic_equation(a,b,c);
        Eq.calculate();
    }
}
