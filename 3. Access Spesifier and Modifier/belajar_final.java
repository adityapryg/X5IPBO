
/**
 * Write a description of class belajar_final here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class belajar_final
{
    //default class attribute (variable)
    int angka = 23;
    int bilangan = 4;

    public final void MethodeFinal()
    {
        System.out.println("Ini method MethodeFinal dari kelas belajar_final");
    }
    
    /**
     * Constructor for objects of class belajar_final
     */
    public void VariableFinal()
    {
        // Kalau diuncomment akan terjadi error
        //angka = 9;
        // Kalau di uncomment tidak akan terjadi error
        //bilangan = 8;
        System.out.println("Ini method VariableFinal dari kelas belajar_final");
    }

    /**
     * main method
     */
    public static void main(String[] args)
    {
        belajar_final f = new belajar_final();
        f.VariableFinal();
        
        System.out.println("Angka    :" + f.angka);
        System.out.println("Bilangan :" + f.bilangan);
    }
}
