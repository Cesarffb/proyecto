package sexshop;
// Generated 07-jul-2017 20:54:18 by Hibernate Tools 4.3.1



/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private int cedula;
     private String nombreRazonSocial;
     private String direccion;
     private String ruc;
     private String telefono;
     private String correoElectronico;

    public Cliente() {
    }

	
    public Cliente(int cedula) {
        this.cedula = cedula;
    }
    public Cliente(int cedula, String nombreRazonSocial, String direccion, String ruc, String telefono, String correoElectronico) {
       this.cedula = cedula;
       this.nombreRazonSocial = nombreRazonSocial;
       this.direccion = direccion;
       this.ruc = ruc;
       this.telefono = telefono;
       this.correoElectronico = correoElectronico;
    }
   
    public int getCedula() {
        return this.cedula;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public String getNombreRazonSocial() {
        return this.nombreRazonSocial;
    }
    
    public void setNombreRazonSocial(String nombreRazonSocial) {
        this.nombreRazonSocial = nombreRazonSocial;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getRuc() {
        return this.ruc;
    }
    
    public void setRuc(String ruc) {
        this.ruc = ruc;
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




}


