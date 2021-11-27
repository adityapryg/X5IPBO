
/**
 * Write a description of class Klinik here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class Klinik extends Obat
{    
    public void input(String ID, String nama, String jenis, int dosis) throws IOException {
        BufferedWriter bw = new BufferedWriter( new FileWriter("klinik_db.txt",true) );
    		
        super.setID(ID);
        super.setNama(nama);
        super.setJenis(jenis);
        super.setDosis(dosis);
        
        bw.write(mapToCSV());
        bw.flush();
	bw.newLine();
	bw.close();		
    }
    
    @Override
    public String caraMinum(String jenis)
    {
        switch(jenis) {
          case "kapsul":
            return "diminum dengan cara oral atau dibuka kapsul untuk dicampur dengan air";
          case "sirup":
            return "diminum secara langsung sesuai dengan informasi dosis dan takar";
          default:
            return super.caraMinum(jenis);
        }
    }
    
    public void tampilkanMenu() throws IOException
    {
        BufferedReader br = new BufferedReader( new FileReader("klinik_db.txt") );
    		
    	String record;
    	System.out.println(" ------------------------------------------------------------- ");
    	System.out.println("|	Nama\t\t\tJenis\t\tDosis        |");
    	System.out.println(" ------------------------------------------------------------- ");
    		
    	while( ( record = br.readLine() ) != null ) {
        	StringTokenizer st = new StringTokenizer(record,",");
    		System.out.println("|	"+st.nextToken() + ". " +st.nextToken()+"\t\t"+st.nextToken()+"\t\t"+st.nextToken()+"\t");
    	}
    	System.out.println("|	                                            	     |");
    	System.out.println(" ------------------------------------------------------------- ");
    	br.close();    		
    }
    
    public void tampilkanObatByID(String ID) throws IOException {
	String record, instruksi;
	Scanner strInput = new Scanner(System.in);
	BufferedReader br = new BufferedReader( new FileReader("klinik_db.txt") );
		
	while( ( record = br.readLine() ) != null ) {
		StringTokenizer st = new StringTokenizer(record,",");
		if( record.contains(ID) && st.nextToken().equals(ID)) {
        	    System.out.print(st.nextToken() + ", ");
	    
                    String jenis = st.nextToken();
                    System.out.println(" " + jenis + " " + caraMinum(jenis));
                }
	}
	br.close();
    }
}
