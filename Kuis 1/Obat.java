
/**
 * Write a description of class Obat here.
 *
 * @author (Aditya Prayoga)
 * @version (0.0.1)
 */
import java.io.*;
import java.util.*;
public class Obat
{
    // Three private instance variables
    private String ID;
    private String nama;
    private String jenis;
    private int dosis;

    //An accessor method
    public String getID(){
        return this.ID;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getJenis(){
        return this.jenis;
    }
    
    public String getDosis()
    {
        if(this.jenis == "sirup") {
            return this.dosis + "ml";
        }
        return this.dosis + "mg";
    }
    
    //A mutator method
    public void setID(String ID){
        this.ID = ID;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    
    public void setDosis(int dosis){
        this.dosis = dosis;
    }
    
    public String mapToCSV()
    {
        return getID() + "," + getNama() + "," + getJenis() + "," + getDosis();
    }
    
    public String caraMinum(String jenis)
    {
        return "dioral dengan bantuan segelas air atau makanan";
    }
}
