
/**
 * 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class belajar_static2
{
    // default variable
    int a = 10;

    /**
     * static method
     */
    public static void biasa()
    {
        /**
         * Apabila variabel dibawah diuncomment maka akan error
         * alasan: variabel a adalah default variable, untuk memanggilnya harus melalui object
         * Pilihan lain adalah mengganti default variable a menjadi static int a
         */
        //a = 0;
        
        // initialise instance variables
        int b = 5;
        System.out.println("Nilai B : " + b);
        
        /**
         * Cara memanggil default variable a supaya tidak throw error
         */
        belajar_static2 bs = new belajar_static2();
        System.out.println("Nilai A : " + bs.a);
    }

    /**
     * Main method
     */
    public static void main(String[] args)
    {
        //memanggil langsung method tanpa perlu objek (new belajar_static2)
        belajar_static2.biasa();
        //langsung panggil static method biasa()
        biasa();
    }
}
