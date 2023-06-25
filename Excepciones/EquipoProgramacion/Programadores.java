public class Programadores {
    private String nombre;
    private String apellidos;

    public Programadores(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;

        String na = nombre + apellidos;

        try {
            for (int i = 0; i < na.length(); i++) {
                char l = na.charAt(i);
                if (!Character.isLetter(l)) {
                    throw new Exception("El nombre y apellido del programador solo puede contener letras");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {

            if (na.length() > 20) {
                throw new Exception("El nombre no puede contener más de 20 caracteres");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Programadores:" +
                "NOMBRE:'" + nombre +
                ", APELLIDOS:'" + apellidos ;
    }
    }

