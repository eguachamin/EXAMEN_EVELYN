package EL_BUHO;
class Ticket extends Ruta{
    private double costo;

    private double incremento;
    
    public Ticket(int id_pasaj, String nombre_pasaj, int telf_pasaj, 
                  String email_pasaj,String tipo_servicio, String ruta_pasa,
                  String ida_vuelta,double costo) {
        super(id_pasaj,nombre_pasaj,telf_pasaj,email_pasaj,tipo_servicio, ruta_pasa,ida_vuelta);
        this.costo=costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        double total;
        incremento=getCosto()*0.30;
        if (getTipo_servicio()=="Normal" && getIda_vuelta()=="Ida"){
            System.out.println("El costo de la ruta escogida: "+getCosto());
        } else if (getTipo_servicio()=="VIP" && getIda_vuelta()=="Ida") {
            total=getCosto()+incremento;
            System.out.println("El costo de la ruta escogida: "+total);
        } else if (getTipo_servicio()=="Normal" && getIda_vuelta()=="Vuelta" ){
            total=getCosto()+getCosto();
            System.out.println("El costo de la ruta escogida: "+total);
        } else if (getTipo_servicio()=="VIP" && getIda_vuelta()=="Vuelta") {
            total=getCosto()+incremento+getCosto();
            System.out.println("El costo de la ruta escogida: "+total);
        }
    }
}