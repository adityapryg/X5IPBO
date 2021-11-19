public class Karnivora extends Hewan
{
    @Override
    public void berjalan()
    {
        System.out.println("Hewan " + getClass().getSimpleName() + " juga bisa berjalan tau!");
    }
    
    public void makan()
    {
        System.out.println("Hewan " + getClass().getSimpleName() + " makan daging!");
    }
}
