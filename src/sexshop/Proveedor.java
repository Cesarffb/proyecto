package sexshop;
// Generated 29-jun-2017 17:59:48 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private Integer id;
     private String descripcion;
     private String direccion;
     private String telefono;
     private String correoElectronico;
     private Set detalledecompras = new HashSet(0);

    public Proveedor() {
    }

    public Proveedor(String descripcion, String direccion, String telefono, String correoElectronico, Set detalledecompras) {
       this.descripcion = descripcion;
       this.direccion = direccion;
       this.telefono = telefono;
       this.correoElectronico = correoElectronico;
       this.detalledecompras = detalledecompras;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public Set getDetalledecompras() {
        return this.detalledecompras;
    }
    
    public void setDetalledecompras(Set detalledecompras) {
        this.detalledecompras = detalledecompras;
    }




}

