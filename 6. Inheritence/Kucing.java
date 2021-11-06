public class Kucing extends Hewan
{
    @Override
    public void berjalan()
    {
        System.out.println("Hore! " + getClass().getSimpleName() + " ini berjalan!");
    }
    
    public static void main(String args[])
    {
        Hewan hewan = new Hewan();
        hewan.berjalan();
        
        Kucing kucing = new Kucing();
        kucing.berjalan();
    }
}
