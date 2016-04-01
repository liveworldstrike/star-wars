
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
  
    private String nombre;
    private String apellido;

    private static final int VALORES_INICIALES = 0;
    private static final int PRI_L_NOMBR = 3;
    private static final int PRI_L_APELLIDO = 3;
    private static final int PRI_L_APELL_MADRE = 2;
    private static final int PRI_L_CIUDAD = 3;

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        nombre = null;
        apellido = null;
    }

    public void generateStarWarsName(String nombre,String apellido, String apellidoMadre, String ciudadNacimiento)
    {
        System.out.println("Tu nombre Star Wars es: " + apellido.substring(VALORES_INICIALES , PRI_L_APELLIDO) + nombre.substring(VALORES_INICIALES , PRI_L_NOMBR));
        System.out.println("Tu apellido Star Wars es: " + apellidoMadre.substring(VALORES_INICIALES, PRI_L_APELL_MADRE) + ciudadNacimiento.substring(VALORES_INICIALES,PRI_L_CIUDAD));
    }

}
