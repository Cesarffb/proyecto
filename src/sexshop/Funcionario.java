package sexshop;
// Generated 29-jun-2017 17:59:48 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Funcionario generated by hbm2java
 */
public class Funcionario  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String apellido;
     private String correo;
     private String telefono;
     private String cargo;
     private Set detalledecompras = new HashSet(0);
     private Set detalleventas = new HashSet(0);

    public Funcionario() {
    }

    public Funcionario(String nombre, String apellido, String correo, String telefono, String cargo, Set detalledecompras, Set detalleventas) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.correo = correo;
       this.telefono = telefono;
       this.cargo = cargo;
       this.detalledecompras = detalledecompras;
       this.detalleventas = detalleventas;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Set getDetalledecompras() {
        return this.detalledecompras;
    }
    
    public void setDetalledecompras(Set detalledecompras) {
        this.detalledecompras = detalledecompras;
    }
    public Set getDetalleventas() {
        return this.detalleventas;
    }
    
    public void setDetalleventas(Set detalleventas) {
        this.detalleventas = detalleventas;
    }




}


