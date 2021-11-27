
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.IOException;
public class Main extends Klinik
{
    public static void main(String args[]) throws IOException
    {
        Klinik klinik = new Klinik();
        Scanner input = new Scanner(System.in);
        
        try {
            klinik.tampilkanMenu();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        boolean noSelection = true;
        do {
            System.out.println("Pilih salah satu obat [1,2,3,4]");
            String userChoice = input.nextLine();
            
            if (userChoice != "0"){
                klinik.tampilkanObatByID(userChoice);
            } else {
                noSelection = false;
            }
        }  while (noSelection);
    }
}
