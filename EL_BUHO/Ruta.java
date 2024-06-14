package EL_BUHO;

class Ruta extends Servicio {
    private String ruta_pasaj;
    private String ida_vuelta;

    public Ruta(int id_pasaj, String nombre_pasaj, int telf_pasaj,
                String email_pasaj,String tipo_servicio, String ruta_pasaj, String ida_vuelta){
        super(id_pasaj, nombre_pasaj, telf_pasaj, email_pasaj,tipo_servicio);
        this.ruta_pasaj=ruta_pasaj;
        this.ida_vuelta=ida_vuelta;
    }

    public String getRuta_pasaj() {
        return ruta_pasaj;
    }

    public void setRuta_pasaj(String ruta_pasaj) {
        this.ruta_pasaj = ruta_pasaj;
    }

    public String getIda_vuelta() {
        return ida_vuelta;
    }

    public void setIda_vuelta(String ida_vuelta) {
        this.ida_vuelta = ida_vuelta;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Su ruta elegida es: "+getRuta_pasaj());
        System.out.println("Su pasaje es : "+getIda_vuelta());
    }
}
