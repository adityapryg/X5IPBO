
/**
 * Write a description of class MainMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class MainMenu
{
    static int saldoAwal = 0;
    /**
     * Constructor for objects of class MainMenu
     */
    public MainMenu()
    {
        // initialise instance variables
        saldoAwal = 254321;
    }
    
    void clearScreen()
    {
      System.out.print('\u000C');
    }
   
   public static void main(String args[])
   {
       Scanner input = new Scanner(System.in);
       displayMenu();
       
       int pilihan = input.nextInt();
      
       while(pilihan != 4){
           showMenu(pilihan);
           break;
       }
   }
    
    private static void displayMenu() {
        System.out.println("|------ Koperasi Simpan Pinjam ------|");
        System.out.println("|------           Menu         ------|");
        System.out.println("|------------------------------------|");
        System.out.println("|   1. Check Saldo                   |");
        System.out.println("|   2. Setor Tabungan                |");
        System.out.println("|   3. Penarikan                     |");
        System.out.println("|   4. Keluar                        |");
        System.out.println("|------------------------------------|");
    }
    
    private static void showMenu(int pilihan)
    {
        Scanner input = new Scanner(System.in);
        MainMenu menu = new MainMenu();
        KoperasiSimpanPinjam koperasi = new KoperasiSimpanPinjam(saldoAwal);
        if (pilihan == 1){
           System.out.println("Saldo anda tersedia sebesar: " + koperasi.checkSaldo());
       } else if (pilihan == 2){
           System.out.println("Masukkan jumlah uang: ");
           koperasi.setor(input.nextInt());
            System.out.println("Uang disetorkan, saldo saat ini: " + koperasi.checkSaldo());
       } else if (pilihan == 3){
           System.out.println("Masukkan jumlah uang: ");
           int tarik = input.nextInt();
           if(koperasi.isSaldoCukup(tarik)){
               koperasi.tarik(tarik);
                System.out.println("Uang ditarik, saldo saat ini: " + koperasi.checkSaldo());
           } else {
               System.out.println("Saldo anda tidak cukup, silahkan setor terlebih dahulu");
           }
       } else {
           System.out.println("Pilihan menu tidak tersedia, ulangi pilih menu? (Y/T)");
           String ulang = input.nextLine();
           
           if(ulang == "Y"){
               System.out.println("Pilihan Y");
               menu.clearScreen();
               menu.displayMenu();
           } else {
               System.out.println("Pilihan T");
           }
       }
    }
}
