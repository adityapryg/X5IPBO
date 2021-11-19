
/**
 * Enkapsulasi
 *
 * @author (Aditya Prayoga)
 * @npm (201943502046)
 */
public class Item
{
    // Three private instance variables
    private String nama;
    private int harga;
    private int stok;

    //An accessor method
    public String getNama(){
        return nama = nama;
    }
    
    public int getHarga(){
        return harga = harga;
    }
    
    public int getStok(){
        return stok = stok;
    }
    
    //A mutator method
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    public void setStok(int stok){
        this.stok = stok;
    }
    
    public void tampilkan(){
        System.out.println(getNama() + " \t\t\tRp" + getHarga());
    }
    
    public void input(String nama, int harga, int stok){
        setNama(nama);
        setHarga(harga);
        setStok(stok);
    }
}
