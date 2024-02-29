import java.util.Scanner;
public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen kilonuzu giriniz.");
        double kilonuz = scanner.nextDouble();
        System.out.print("Lutfen boyunuzu giriniz.");
        double boyunuz = scanner.nextDouble();

        double Bmi = kilonuz/((boyunuz/100)*(boyunuz/100));

        String Bmi_aralik;
        if(Bmi<18.5){
            Bmi_aralik ="Zayif";
        }else if(Bmi >=18.5 && Bmi<25){
            Bmi_aralik = "Normal";
        }else if(Bmi>=25&& Bmi<30){
            Bmi_aralik = "Fazla Kilolu";
        }else{
            Bmi_aralik ="Obez";
        }
        System.out.println("Vucut kitle Endeksi sonucunuz:"+Bmi);
        System.out.println("BMI Kategoriniz:"+Bmi_aralik);
        scanner.close();
    }
}