package Project;

public class Project1Check {
    public void check(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException c){
            System.out.println(c);
        }

    }
}
