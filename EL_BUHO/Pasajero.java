package EL_BUHO;

public class Pasajero {
    private int id_pasaj;
    private String nombre_pasaj;
    private int telf_pasaj;
    private String email_pasaj;

    public Pasajero(int id_pasaj, String nombre_pasaj, int telf_pasaj, String email_pasaj){
        this.id_pasaj=id_pasaj;
        this.nombre_pasaj=nombre_pasaj;
        this.telf_pasaj=telf_pasaj;
        this.email_pasaj=email_pasaj;
    }

    public int getId_pasaj() {
        return id_pasaj;
    }

    public void setId_pasaj(int id_pasaj) {
        this.id_pasaj = id_pasaj;
    }

    public String getNombre_pasaj() {
        return nombre_pasaj;
    }

    public void setNombre_pasaj(String nombre_pasaj) {
        this.nombre_pasaj = nombre_pasaj;
    }

    public int getTelf_pasaj() {
        return telf_pasaj;
    }

    public void setTelf_pasaj(int telf_pasaj) {
        this.telf_pasaj = telf_pasaj;
    }

    public String getEmail_pasaj() {
        return email_pasaj;
    }

    public void setEmail_pasaj(String email_pasaj) {
        this.email_pasaj = email_pasaj;
    }
    public void mostrarDatos(){
        System.out.println("Los Datos del Pasajero son los siguientes: ");
        System.out.println("Cédula del Pasajero: "+getId_pasaj());
        System.out.println("Nombre del Pasajero: "+getNombre_pasaj());
        System.out.println("Telefono del Pasajero: "+getTelf_pasaj());
        System.out.println("Email del Pasajero: "+getEmail_pasaj());
    }
}
