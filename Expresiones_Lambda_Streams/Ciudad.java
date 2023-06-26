public class Ciudades {
    private String nombre;
    private String provincia;
    private int habitantes;

    public Ciudades() {
    }

    public Ciudades(String nombre, String provincia, int habitantes) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "CIUDADES" +
                "\n nombre: '" + nombre + '\'' +
                "\n provincia: '" + provincia + '\'' +
                "\n habitantes: " + habitantes + "\n\n";
    }
}
