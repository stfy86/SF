package entity;
// Generated 29/04/2014 10:12:33 AM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * TbFacturaXDetalleFactura generated by hbm2java
 */
public class TbFacturaXDetalleFactura  implements java.io.Serializable {


     private int facdfCod;
     private TbFactura tbFactura;
     private TbDetalleFactura tbDetalleFactura;
     private String facdfUserInsert;
     private String facdfUserUpdate;
     private Date facdfFechaInsert;
     private Date facdfFechaUpdate;

    public TbFacturaXDetalleFactura() {
    }

    public TbFacturaXDetalleFactura(int facdfCod, TbFactura tbFactura, TbDetalleFactura tbDetalleFactura, String facdfUserInsert, String facdfUserUpdate, Date facdfFechaInsert, Date facdfFechaUpdate) {
       this.facdfCod = facdfCod;
       this.tbFactura = tbFactura;
       this.tbDetalleFactura = tbDetalleFactura;
       this.facdfUserInsert = facdfUserInsert;
       this.facdfUserUpdate = facdfUserUpdate;
       this.facdfFechaInsert = facdfFechaInsert;
       this.facdfFechaUpdate = facdfFechaUpdate;
    }
   
    public int getFacdfCod() {
        return this.facdfCod;
    }
    
    public void setFacdfCod(int facdfCod) {
        this.facdfCod = facdfCod;
    }
    public TbFactura getTbFactura() {
        return this.tbFactura;
    }
    
    public void setTbFactura(TbFactura tbFactura) {
        this.tbFactura = tbFactura;
    }
    public TbDetalleFactura getTbDetalleFactura() {
        return this.tbDetalleFactura;
    }
    
    public void setTbDetalleFactura(TbDetalleFactura tbDetalleFactura) {
        this.tbDetalleFactura = tbDetalleFactura;
    }
    public String getFacdfUserInsert() {
        return this.facdfUserInsert;
    }
    
    public void setFacdfUserInsert(String facdfUserInsert) {
        this.facdfUserInsert = facdfUserInsert;
    }
    public String getFacdfUserUpdate() {
        return this.facdfUserUpdate;
    }
    
    public void setFacdfUserUpdate(String facdfUserUpdate) {
        this.facdfUserUpdate = facdfUserUpdate;
    }
    public Date getFacdfFechaInsert() {
        return this.facdfFechaInsert;
    }
    
    public void setFacdfFechaInsert(Date facdfFechaInsert) {
        this.facdfFechaInsert = facdfFechaInsert;
    }
    public Date getFacdfFechaUpdate() {
        return this.facdfFechaUpdate;
    }
    
    public void setFacdfFechaUpdate(Date facdfFechaUpdate) {
        this.facdfFechaUpdate = facdfFechaUpdate;
    }




}


