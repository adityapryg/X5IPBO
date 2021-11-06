
/**
 * Write a description of class KoperasiSimpanPinjam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KoperasiSimpanPinjam
{
    int saldo;
    
    /**
     * Constructor for objects of class KoperasiSimpanPinjam
     */
    public KoperasiSimpanPinjam(int saldo)
    {
        System.out.println(saldo);
        this.saldo = saldo;
        
    }

    public int checkSaldo()
    {
        return saldo;
    }
    
    public void setor(int jumlah)
    {
        saldo = saldo + jumlah;
    }
    
    public void tarik(int jumlah)
    {
        saldo = saldo - jumlah;
    }
    
    public Boolean isSaldoCukup(int jumlah)
    {
        if (saldo >= jumlah){
            return true;
        }
        return false;
    }
}
