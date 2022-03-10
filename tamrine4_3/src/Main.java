import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string: ");
        String Sr=sc.nextLine();
        contain_no_num Cnn=new contain_no_num(Sr);
        Cnn.print_length();
    }
}
