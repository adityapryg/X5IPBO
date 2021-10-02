
/**
 * Object 1 PohonMangga here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PohonMangga
{   
    public static void main(String[] args)
    { 
        int banyakBuah = 5;
        
        Tumbuhan pohonMangga = new Tumbuhan();
        
        pohonMangga.jenisDaun = "menyirip";
        pohonMangga.jenisAkar = "tunggang";
        pohonMangga.banyakBuah = banyakBuah;
        
        System.out.println("Jenis daun tumbuhan adalah: " + pohonMangga.jenisDaun);
        System.out.println("Jenis akar tumbuhan adalah: " + pohonMangga.jenisAkar);
        System.out.println("Pohon berbuah sebanyak: " + pohonMangga.banyakBuah);
        System.out.println(pohonMangga.ambilBuah(3));
        pohonMangga.fotosintesis();
        pohonMangga.gugurkanDaun();
    }
}
