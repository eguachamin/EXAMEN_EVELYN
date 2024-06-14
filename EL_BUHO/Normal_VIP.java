package EL_BUHO;

class Normal_VIP extends Servicio {

    private String tipo_asiento;
    public int opcion;

    public Normal_VIP(int id_pasaj, String nombre_pasaj, int telf_pasaj,
                      String email_pasaj, String tipo_servicio, String tipo_asiento)
    {
        super(id_pasaj, nombre_pasaj, telf_pasaj, email_pasaj, tipo_servicio);
        this.tipo_asiento=tipo_asiento;

    }

    public String getTipo_asiento() {
        return tipo_asiento;
    }

    public void setTipo_asiento(String tipo_asiento) {
        this.tipo_asiento = tipo_asiento;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
            if(opcion==1) {
            System.out.println("Este serivicio dispone los siguientes beneficios:");
            System.out.println("Tipo de asiento selecionado:" + getTipo_asiento());
            System.out.println("Espacio para una maleta");
            System.out.println("Opción a una maleta adicional por costo extra.");
        } else if (opcion==2) {
            System.out.println("Este serivicio dispone los siguientes beneficios:");
            System.out.println("Televisión, internet y otros dos servicios adicionales a su consideración:");
            System.out.println("Espacio para DOS maleta");
            System.out.println("Opción a una maleta adicional por costo extra.");
        }
    }
}
