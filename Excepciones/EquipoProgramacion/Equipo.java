import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Equipo {
    private String nombreEquipo;
    private String Universidad;
    private String Lenguaje;
    private int tamaño;
    private Programadores[] programador;

    public Equipo(String nombreEquipo, String universidad, String lenguaje, int tamaño, Programadores programador) {
        this.nombreEquipo = nombreEquipo;
        Universidad = universidad;
        Lenguaje = lenguaje;
        this.tamaño = tamaño;


    }
    public Equipo() {
        this.programador = new Programadores[3];


    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String universidad) {
        Universidad = universidad;
    }

    public String getLenguaje() {
        return Lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        Lenguaje = lenguaje;
    }
    public int getTamaño() throws Exception {
        return tamaño;

    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Programadores[] getProgramador() {
        return programador;
    }

    public void setProgramador(Programadores[] programador) {
        this.programador = programador;
    }

    public void añadirProgramador(Programadores programador) {
        this.programador[tamaño++] = programador;
        try {
            if (tamaño > 3)
                throw new Exception("¡¡ERROR!! El equipo no puede tener más de 3 programadores");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    public boolean completo() {
        if (tamaño == 3) {
            System.out.println("El equipo está completo");
        } else {
            System.out.println("El equipo no está completo");
        }
        return true;
    }

    @Override
    public String toString() {
        return "programador:" + Arrays.toString(programador);
    }
}
