package Entidades;

/**
 *
 * @author tomyv Dígito Verificador. Crear una clase NIF que se usará para
 * mantener DNIs con su correspondiente letra (NIF). Los atributos serán el
 * número de DNI (entero largo) y la letra (String o char) que le corresponde.
 * En NIFService se dispondrá de los siguientes métodos: Métodos getters y
 * setters para el número de DNI y la letra. Método crearNif(): le pide al
 * usuario el DNI y con ese DNI calcula la letra que le corresponderá. Una vez
 * calculado, le asigna la letra que le corresponde según Método mostrar(): que
 * nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula;
 * por ejemplo: 00395469-F).
 *
 */
public class NIF {
    private long dni;
    private String letra;

    public NIF() {
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
    
}
