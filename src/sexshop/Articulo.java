package sexshop;
// Generated 29-jun-2017 17:59:48 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Articulo generated by hbm2java
 */
public class Articulo  implements java.io.Serializable {


     private Integer idproducto;
     private byte[] imagenproducto;
     private String nombreProducto;
     private String descripcion;
     private Float precioCompra;
     private Float precioVenta;
     private Integer cantidadDisponible;
     private String categoria;
     private Set detalleventas = new HashSet(0);
     private Set detalledecompras = new HashSet(0);

    public Articulo() {
    }

	
    public Articulo(String categoria) {
        this.categoria = categoria;
    }
    public Articulo(byte[] imagenproducto, String nombreProducto, String descripcion, Float precioCompra, Float precioVenta, Integer cantidadDisponible, String categoria, Set detalleventas, Set detalledecompras) {
       this.imagenproducto = imagenproducto;
       this.nombreProducto = nombreProducto;
       this.descripcion = descripcion;
       this.precioCompra = precioCompra;
       this.precioVenta = precioVenta;
       this.cantidadDisponible = cantidadDisponible;
       this.categoria = categoria;
       this.detalleventas = detalleventas;
       this.detalledecompras = detalledecompras;
    }
   
    public Integer getIdproducto() {
        return this.idproducto;
    }
    
    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }
    public byte[] getImagenproducto() {
        return this.imagenproducto;
    }
    
    public void setImagenproducto(byte[] imagenproducto) {
        this.imagenproducto = imagenproducto;
    }
    public String getNombreProducto() {
        return this.nombreProducto;
    }
    
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Float getPrecioCompra() {
        return this.precioCompra;
    }
    
    public void setPrecioCompra(Float precioCompra) {
        this.precioCompra = precioCompra;
    }
    public Float getPrecioVenta() {
        return this.precioVenta;
    }
    
    public void setPrecioVenta(Float precioVenta) {
        this.precioVenta = precioVenta;
    }
    public Integer getCantidadDisponible() {
        return this.cantidadDisponible;
    }
    
    public void setCantidadDisponible(Integer cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    public String getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Set getDetalleventas() {
        return this.detalleventas;
    }
    
    public void setDetalleventas(Set detalleventas) {
        this.detalleventas = detalleventas;
    }
    public Set getDetalledecompras() {
        return this.detalledecompras;
    }
    
    public void setDetalledecompras(Set detalledecompras) {
        this.detalledecompras = detalledecompras;
    }




}

