import javax.naming.Name;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class Student {
    static ArrayList<ArrayList> UNP= new ArrayList<>();
    ArrayList<String> Inner_list=new ArrayList<String>();

    public  Student(String User_Name,String Password,String Name){
        this.Inner_list.add(User_Name.toLowerCase(Locale.ROOT));
        this.Inner_list.add(Password);
        this.Inner_list.add(Name.toLowerCase(Locale.ROOT));
        UNP.add(this.Inner_list);

    }
    static public void login(String User_name,String Password,String Name) throws Invalid_exp{
        int bool=0;
        for (ArrayList i : Student.UNP)  {
            if (User_name.toLowerCase(Locale.ROOT).equals(i.get(0))&&Password.equals(i.get(1))&&Name.toLowerCase(Locale.ROOT).equals(i.get(2))) {
                System.out.println("you have been logged in");
                bool+=1;
                }
            }


        if(bool==0){
            throw new Invalid_exp("name,username or password is incorrect");
        }

    }
}
