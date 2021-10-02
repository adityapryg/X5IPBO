
/**
 * Object 2 PohonPepaya here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PohonPepaya
{
    public static void main(String[] args)
    {
        int banyakBuah = 1;
        
        Tumbuhan pohonPepaya = new Tumbuhan();
        
        pohonPepaya.jenisDaun = "menjari";
        pohonPepaya.jenisAkar = "tunggang";
        pohonPepaya.banyakBuah = banyakBuah;
        
        System.out.println("Jenis daun tumbuhan adalah: " + pohonPepaya.jenisDaun);
        System.out.println("Jenis akar tumbuhan adalah: " + pohonPepaya.jenisAkar);
        System.out.println("Pohon berbuah sebanyak: " + pohonPepaya.banyakBuah);
        System.out.println(pohonPepaya.ambilBuah(1));
        pohonPepaya.fotosintesis();
    }
}
