
/**
 * Write a description of class child_belajar_final here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class child_belajar_final extends belajar_final
{
    
    /**
     * Reka ulang method variable final
     */
    public void VariableFinal()
    {
        System.out.println("Ini method VariableFinal yang sudah di reka ulang (override)");
    }
    
    public static void main(String[] args){
        child_belajar_final cf = new child_belajar_final();
        cf.VariableFinal();
        cf.MethodeFinal();
    }
}
