public class Cd extends DispositivoAlmacenamiento {
    private String escribeDato = "láser";
    private int velocidadGiro;

    public Cd(String nombre, int capacidad, String contenido, String tipo, String brand, int velocidadGiro) {
        super(nombre, capacidad, contenido, tipo, brand);
        this.velocidadGiro = velocidadGiro;
    }

    @Override
    public void girar(){
        System.out.println("El CD gira a una velocidad de " + velocidadGiro + " RPM");
    }

    @Override
    public void almacenar(String datos){
        setContenido(datos);
        System.out.println("Datos almacenados mediante " + escribeDato + ": " + datos);
    }

    @Override
    public void leerDato(){
        System.out.println("Leyendo datos del CD: " + getContenido());
    }
}
