import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Invalid_exp{
        Student Nima=new Student("Nima_Az","kihgfadfD","nima");
        Student Reza=new Student("Reza_Ak","fkihgfadfD","Reza");
        Scanner Sc=new Scanner(System.in);
        String User_name,Password,Name;
        System.out.print("name: ");
        Name=Sc.nextLine();
        System.out.print("username: ");
        User_name=Sc.nextLine();
        System.out.print("Password: ");
        Password=Sc.nextLine();
        Student.login(User_name,Password,Name);




        }


}
