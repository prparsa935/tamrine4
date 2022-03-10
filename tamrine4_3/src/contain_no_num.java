import java.util.ArrayList;




public class contain_no_num {
    public String sr;

    public contain_no_num(String sr) throws Exception{
        this.sr=sr;
        for(Integer i=0;i<=9;i++){
            if(this.sr.contains(i.toString())){
                throw new Exception("This string has a number");
            }

        }
    }

    public void print_length(){
        System.out.println(this.sr.length());


    }

}
