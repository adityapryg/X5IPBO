
/**
 * Write a description of class PohonMangga here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PohonMangga
{
    public static void main(String[] args)
    {
        tumbuhan pohonMangga = new tumbuhan();
        
        pohonMangga.jenisDaun = "menyirip";
        pohonMangga.jenisAkar = "tunggang";
        
        System.out.println("Jenis daun tumbuhan adalah : " + pohonMangga.jenisDaun);
        System.out.println("Jenis akar tumbuhan adalah : " + pohonMangga.jenisAkar);
    }
}
