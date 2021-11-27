/**
 * Inheritence
 * 
 * @author (Aditya Prayoga)
 * @npm (201943502046)
 */
public class Makanan extends Item
{    
   public void tampilkanMakanan(){
       Item item = new Item();
       item.input("Nasi Goreng", 15000, 2);
       item.tampilkan();
   }
}
