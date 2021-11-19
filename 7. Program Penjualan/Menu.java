/**
 * Polymorphism
 * 
 * @author (Aditya Prayoga)
 * @npm (201943502046)
 */
import java.util.Scanner;
public class Menu
{
    public static void main(String args[]) {
        int jum, tagihan = 0, current_state = 0, i;
        int[] harga      = new int [5];
        String[] cart    = new String[5];
        Scanner input    = new Scanner(System.in);
        
        Item makanan, minuman, camilan;
        makanan = new Makanan();
        minuman = new Minuman();        
        camilan = new Camilan();
        
        makanan.input("1. Nasi Goreng", 15000, 2);        
        minuman.input("2. Es Tea", 2000, 2);
        camilan.input("3. Krupuk Udang", 1000, 2);
    
        System.out.println ("\n------------------ Menu ------------------");
        System.out.println ("------------------------------------------");
        
        // Set up an array with instances of each item
        Item[] items = {makanan, minuman, camilan};
        // Iterate through the list of items and perform the same action with each
        for (Item item : items) {
            item.tampilkan();
        }
        System.out.println ("------------------------------------------");
        
        boolean noSelection = true;
        do {
            System.out.println("TAMBAH PESANAN? y/n");
 
            char userChoice = input.next().charAt(0);
 
            switch (userChoice) {
                case 'y':
                    System.out.println("PESANAN KE-"+ (++current_state) +": ");
                    switch(input.nextInt()){
                        case 1:
                            cart[current_state] = makanan.getNama();
                            harga[current_state] = makanan.getHarga();
                            break;
                        case 2:
                            cart[current_state] = minuman.getNama();
                            harga[current_state] = minuman.getHarga();
                            break;
                        case 3:
                            cart[current_state] = camilan.getNama();
                            harga[current_state] = camilan.getHarga();
                            break;
                        default:
                            
                    }
                    break;
                case 'n':
                    noSelection = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
 
            }
 
        }  while (noSelection);
        
        System.out.println("\nBILL PESANAN ANDA:");
        for (i=1; i<=current_state;i++){
            System.out.println(cart[i] + " \t\t\tRp" + harga[i]);
            tagihan += harga[i];
        }
        System.out.println("------------------------------------------");
        System.out.println("Total Bayar:                   Rp" + tagihan);
    }
}
