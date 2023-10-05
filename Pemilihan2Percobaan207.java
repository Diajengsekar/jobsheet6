import java.util.Scanner;

public class Pemilihan2Percobaan207 {
    public static void main (String[] args){
        Scanner input07 = new Scanner(System.in);
        System.out.println("Masukkan sudut1");
        float sudut1 = input07.nextFloat();
        System.out.println("Masukkan sudut2");
        float sudut2 = input07.nextFloat();
        System.out.println("Masukkan sudut3");
        float sudut3 = input07.nextFloat();
        float totalSudut;
        totalSudut = sudut1 + sudut2 + sudut3;


            if (sudut1 == sudut2 && sudut2 == sudut3) {
                System.out.println("Segitiga adalah segitiga sama sisi.");
            } else if (sudut1 == sudut2 || sudut2 == sudut3 || sudut1 == sudut3) {
                System.out.println("Segitiga adalah segitiga sama kaki.");
            } else {
                System.out.println("Segitiga adalah segitiga sembarang.");
            }
        }
        }
    


