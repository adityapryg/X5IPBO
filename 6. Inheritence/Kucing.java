public class Kucing extends Karnivora
{
    @Override
    public void berjalan()
    {
        System.out.println("Hore! " + getClass().getSimpleName() + " ini berjalan!");
    }
    
    @Override
    public void makan()
    {
        System.out.println(getClass().getSimpleName() + " juga termasuk hewan karnivora loh!");
    }
    
    public static void main(String args[])
    {
        Hewan hewan = new Hewan();
        hewan.berjalan();
        
        System.out.println();
        
        Karnivora karnivora = new Karnivora();
        karnivora.berjalan();
        karnivora.makan();
        
        System.out.println();
        
        Kucing kucing = new Kucing();
        kucing.berjalan();
        kucing.makan();
    }
}
