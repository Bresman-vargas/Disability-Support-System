package disabilitymanager;

/**
 *
 * @author bresm
 */
public class Servicio {
    private String id;
    private String nombre;
    private String descripcion;

    public Servicio(String nombre, String descripcion) {
        this.id = Utilidades.generateUniqueId();
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Descripción: " + descripcion;
    }
}
