import java.util.Scanner;

public class Patient {
    private String patientName;
    private double height;
    private double weight;
    double bmi;

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double computeBMI(){
        bmi=weight/(height*height);
        return bmi;
    }
}
class detail{
    public static void main(String[] args) {
        Patient p = new Patient();
        Scanner sc = new Scanner(System.in);
        p.setPatientName(sc.nextLine());
        p.setHeight(sc.nextDouble());
        p.setWeight(sc.nextDouble());
        System.out.println(p.computeBMI());
    }
}