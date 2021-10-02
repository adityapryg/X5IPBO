
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
 
   public static void main(String[] args) {
 
        Tumbuhan tumbuhan = new Tumbuhan();
        System.out.println("Apakah tumbuhan IS-A Objek -> " + (tumbuhan instanceof Object));
        System.out.println("Apakah tumbuhan IS-A Tumbuhan -> " + (tumbuhan instanceof Tumbuhan));
        System.out.println("------------------------"); // spasi
 
        PohonMangga pohonMangga = new PohonMangga(); 
        System.out.println("Apakah pohon mangga IS-A Objek -> " + (pohonMangga instanceof Object));
        System.out.println("Apakah pohon mangga IS-A PohonMangga -> " + (pohonMangga instanceof PohonMangga));
 
    }
}
