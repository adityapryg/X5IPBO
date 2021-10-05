
/**
 * Write a description of class belajar_static here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class belajar_static
{
    // static variabel dalam class
    static int bilangan = 0;
    //default variable
    int angka = 0;
    
    /**
     * 
     */
    public void perubahan()
    {
        bilangan += 10;
        angka += 10;
        System.out.println("Nilai BILANGAN : " + bilangan);
        System.out.println("NIlai ANGKA    : " + angka);
    }

    /**
     * Main method
     *
     */
    public static void main(String[] args)
    {
        belajar_static vs1 = new belajar_static();
        vs1.perubahan();
        
        belajar_static vs2 = new belajar_static();
        vs2.perubahan();
    }
}