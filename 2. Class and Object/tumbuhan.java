
/**
 * Write a description of class tumbuhan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tumbuhan
{
    // 3 Attribute
    String jenisDaun;
    String jenisAkar;
    String jenisBiji;
    
    int banyakBuah;
    
    //Method 1
    void fotosintesis(){
        System.out.println("Tumbuhan berfotosintesis dengan bantuan matahari.");
    }
    //Method 2
    void gugurkanDaun()
    {
        System.out.println("Daun akan digugurkan untuk mengurangi fotosintesis.");
    }
    //Method 3
    String ambilBuah(int quantity){
        return quantity + " telah diambil, sisa buah sebanyak " + (banyakBuah - quantity);
    }
}
