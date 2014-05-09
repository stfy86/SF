package entity;
// Generated 09/05/2014 01:09:38 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TbDetalleFactura generated by hbm2java
 */
public class TbDetalleFactura  implements java.io.Serializable {


     private int dfCod;
     private int dfCantidad;
     private String dfDescripcion;
     private double dfPrecioUnitario;
     private Double dfExentas;
     private Double dfCincoPorciento;
     private Double dfDiezPorciento;
     private String dfUserInsert;
     private String dfUserUpdate;
     private Date dfFechaInsert;
     private Date dfFechaUpdate;
     private Set tbFacturaXDetalleFacturas = new HashSet(0);

    public TbDetalleFactura() {
    }

	
    public TbDetalleFactura(int dfCod, int dfCantidad, String dfDescripcion, double dfPrecioUnitario, String dfUserInsert, String dfUserUpdate, Date dfFechaInsert, Date dfFechaUpdate) {
        this.dfCod = dfCod;
        this.dfCantidad = dfCantidad;
        this.dfDescripcion = dfDescripcion;
        this.dfPrecioUnitario = dfPrecioUnitario;
        this.dfUserInsert = dfUserInsert;
        this.dfUserUpdate = dfUserUpdate;
        this.dfFechaInsert = dfFechaInsert;
        this.dfFechaUpdate = dfFechaUpdate;
    }
    public TbDetalleFactura(int dfCod, int dfCantidad, String dfDescripcion, double dfPrecioUnitario, Double dfExentas, Double dfCincoPorciento, Double dfDiezPorciento, String dfUserInsert, String dfUserUpdate, Date dfFechaInsert, Date dfFechaUpdate, Set tbFacturaXDetalleFacturas) {
       this.dfCod = dfCod;
       this.dfCantidad = dfCantidad;
       this.dfDescripcion = dfDescripcion;
       this.dfPrecioUnitario = dfPrecioUnitario;
       this.dfExentas = dfExentas;
       this.dfCincoPorciento = dfCincoPorciento;
       this.dfDiezPorciento = dfDiezPorciento;
       this.dfUserInsert = dfUserInsert;
       this.dfUserUpdate = dfUserUpdate;
       this.dfFechaInsert = dfFechaInsert;
       this.dfFechaUpdate = dfFechaUpdate;
       this.tbFacturaXDetalleFacturas = tbFacturaXDetalleFacturas;
    }
   
    public int getDfCod() {
        return this.dfCod;
    }
    
    public void setDfCod(int dfCod) {
        this.dfCod = dfCod;
    }
    public int getDfCantidad() {
        return this.dfCantidad;
    }
    
    public void setDfCantidad(int dfCantidad) {
        this.dfCantidad = dfCantidad;
    }
    public String getDfDescripcion() {
        return this.dfDescripcion;
    }
    
    public void setDfDescripcion(String dfDescripcion) {
        this.dfDescripcion = dfDescripcion;
    }
    public double getDfPrecioUnitario() {
        return this.dfPrecioUnitario;
    }
    
    public void setDfPrecioUnitario(double dfPrecioUnitario) {
        this.dfPrecioUnitario = dfPrecioUnitario;
    }
    public Double getDfExentas() {
        return this.dfExentas;
    }
    
    public void setDfExentas(Double dfExentas) {
        this.dfExentas = dfExentas;
    }
    public Double getDfCincoPorciento() {
        return this.dfCincoPorciento;
    }
    
    public void setDfCincoPorciento(Double dfCincoPorciento) {
        this.dfCincoPorciento = dfCincoPorciento;
    }
    public Double getDfDiezPorciento() {
        return this.dfDiezPorciento;
    }
    
    public void setDfDiezPorciento(Double dfDiezPorciento) {
        this.dfDiezPorciento = dfDiezPorciento;
    }
    public String getDfUserInsert() {
        return this.dfUserInsert;
    }
    
    public void setDfUserInsert(String dfUserInsert) {
        this.dfUserInsert = dfUserInsert;
    }
    public String getDfUserUpdate() {
        return this.dfUserUpdate;
    }
    
    public void setDfUserUpdate(String dfUserUpdate) {
        this.dfUserUpdate = dfUserUpdate;
    }
    public Date getDfFechaInsert() {
        return this.dfFechaInsert;
    }
    
    public void setDfFechaInsert(Date dfFechaInsert) {
        this.dfFechaInsert = dfFechaInsert;
    }
    public Date getDfFechaUpdate() {
        return this.dfFechaUpdate;
    }
    
    public void setDfFechaUpdate(Date dfFechaUpdate) {
        this.dfFechaUpdate = dfFechaUpdate;
    }
    public Set getTbFacturaXDetalleFacturas() {
        return this.tbFacturaXDetalleFacturas;
    }
    
    public void setTbFacturaXDetalleFacturas(Set tbFacturaXDetalleFacturas) {
        this.tbFacturaXDetalleFacturas = tbFacturaXDetalleFacturas;
    }




}


