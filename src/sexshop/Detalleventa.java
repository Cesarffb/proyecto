package sexshop;
// Generated 07-jul-2017 20:54:18 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Detalleventa generated by hbm2java
 */
public class Detalleventa  implements java.io.Serializable {


     private int id;
     private Articulo articulo;
     private Funcionario funcionario;
     private int clienteCedula;
     private Integer cantidad;
     private Float importe;
     private Date fecha;
     private int usuariosId;

    public Detalleventa() {
    }

	
    public Detalleventa(int id, Articulo articulo, Funcionario funcionario, int clienteCedula, int usuariosId) {
        this.id = id;
        this.articulo = articulo;
        this.funcionario = funcionario;
        this.clienteCedula = clienteCedula;
        this.usuariosId = usuariosId;
    }
    public Detalleventa(int id, Articulo articulo, Funcionario funcionario, int clienteCedula, Integer cantidad, Float importe, Date fecha, int usuariosId) {
       this.id = id;
       this.articulo = articulo;
       this.funcionario = funcionario;
       this.clienteCedula = clienteCedula;
       this.cantidad = cantidad;
       this.importe = importe;
       this.fecha = fecha;
       this.usuariosId = usuariosId;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Articulo getArticulo() {
        return this.articulo;
    }
    
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public int getClienteCedula() {
        return this.clienteCedula;
    }
    
    public void setClienteCedula(int clienteCedula) {
        this.clienteCedula = clienteCedula;
    }
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public Float getImporte() {
        return this.importe;
    }
    
    public void setImporte(Float importe) {
        this.importe = importe;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getUsuariosId() {
        return this.usuariosId;
    }
    
    public void setUsuariosId(int usuariosId) {
        this.usuariosId = usuariosId;
    }




}


