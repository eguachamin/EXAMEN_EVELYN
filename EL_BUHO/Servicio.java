package EL_BUHO;

class Servicio extends Pasajero {
    private String tipo_servicio;

    public Servicio(int id_pasaj, String nombre_pasaj, int telf_pasaj, String email_pasaj,String tipo_servicio){
        super(id_pasaj, nombre_pasaj, telf_pasaj, email_pasaj);
        this.tipo_servicio=tipo_servicio;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de servicio: "+getTipo_servicio());
    }
}
