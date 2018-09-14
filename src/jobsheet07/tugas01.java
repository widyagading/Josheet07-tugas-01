package jobsheet07;
import java.util.Scanner;
public class tugas1 {
    public static void tampilJudul(String identitas)
    {
        System.out.println("Identitas: " + identitas);
    }    
    public static void main(String[] args)
    {
        String identitas = "Widya Gading Sejati / XRPL2 / 38";        
        tampilJudul(identitas);
        int lembar = 3000;
        int[] nominal = {3000, 2000, 1000, 500};
        Scanner scan = new Scanner(System.in);
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Uang: ");
        int uang = baca.nextInt();
        
        for(int i = 0; i < nominal.length; i++)
        {
            int jumlah = uang / nominal[i];
            uang = uang - (nominal[i] * jumlah);
            
            System.out.println("Lembar " + nominal[i] + " = " + jumlah);
        }
        
    }
}
}