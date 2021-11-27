/**
 * Inheritence
 * 
 * @author (Aditya Prayoga)
 * @npm (201943502046)
 */
public class Minuman extends Item
{
   public void tampilkanMinuman(){
       Item item = new Item();
       item.input("Es Tea", 2000, 2);
       item.tampilkan();
   }
}
