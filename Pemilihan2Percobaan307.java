import java.util.Scanner;

public class Pemilihan2Percobaan307 {
    public static void main(String[] args){
        Scanner input07 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajibersih;
        double pajak = 0;

        System.out.println("masukkan kategori : ");
        kategori = input07.nextLine();
        System.out.println("Masukkan Besarnya Penghasilan : ");
        penghasilan = input07.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")){
            if (penghasilan <= 2000000)
               pajak = 0.1;
            else if (penghasilan  <= 3000000)
               pajak = 0.15;
            else
               pajak = 0.2;
            gajibersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan Bersih : " + gajibersih);
        }else if (kategori.equalsIgnoreCase("pebisnis")){
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 350000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajibersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasil Bersih :" + gajibersih);        
        }else 
            System.out.println("Masukkan Kategori Salah");
    }
}
