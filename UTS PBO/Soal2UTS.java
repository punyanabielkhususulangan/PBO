import java.util.Scanner;

public class Soal2UTS {
    public static int berat,tinggi;
    public static float konversiTinggi, BMI;
    public static float konversiTinggi(){
        return konversiTinggi = (float)tinggi/100;
    }
    public static float BMI(){
        return BMI = (float) berat/(konversiTinggi()*konversiTinggi());
    }

    public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);
        System.out.print("Input berat badan anda dalam satuan KG ");
        berat = nt.nextInt();
        System.out.print("Input tinggi badan dalam satuan CM ");
        tinggi = nt.nextInt();
        BMI = BMI();
        if(BMI >= 18.5 && BMI <= 22.9){
            System.out.printf("BMI Anda = %.2f",BMI());
            System.out.println(" ");
            System.out.println("Maka berat badan dinyatakan ideal");
        }
        else if(BMI >= 22.9){
            System.out.printf("BMI Anda = %.2f",BMI());
            System.out.println(" ");
            System.out.println("Maka berat badan dinyatakan overweight");
        }
        else if(BMI <= 18.5){
            System.out.printf("BMI Anda = %.2f",BMI());
            System.out.println(" ");
            System.out.println("Maka berat badan dinyatakan underweight");
        }
    }
}
