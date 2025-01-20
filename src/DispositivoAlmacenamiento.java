
public abstract class DispositivoAlmacenamiento {
    private String nombre;
    private int capacidad;
    private String contenido;
    private String tipo;
    private String brand;

    public DispositivoAlmacenamiento(String nombre, int capacidad, String contenido, String tipo, String brand) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.contenido = contenido;
        this.tipo = tipo;
        this.brand = brand;
    }

    public String informacion(){
        return "Nombre: " + nombre + "\n"
                + "Capacidad: " + capacidad+ " GB" + "\n"
                + "Contenido: " + contenido + "\n"
                + "Tipo: " + tipo + "\n"
                + "Marca: " + brand + "\n";
    }

    public abstract void girar();
    public abstract void almacenar(String datos); //Añado el String datos para permitir que se puedan almacenar los datos que se quieren almacenar
    public abstract void leerDato();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
