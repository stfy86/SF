package entity;
// Generated 05/05/2014 08:59:32 AM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * TbPago generated by hbm2java
 */
public class TbPago  implements java.io.Serializable {


     private int paCod;
     private TbFactura tbFactura;
     private Date paFecha;
     private Integer paMonto;
     private String paFormaPago;
     private String paUserInsert;
     private String paUserUpdate;
     private Date paFechaInsert;
     private Date paFechaUpdate;

    public TbPago() {
    }

	
    public TbPago(int paCod, TbFactura tbFactura, Date paFecha, String paFormaPago, String paUserInsert, String paUserUpdate, Date paFechaInsert, Date paFechaUpdate) {
        this.paCod = paCod;
        this.tbFactura = tbFactura;
        this.paFecha = paFecha;
        this.paFormaPago = paFormaPago;
        this.paUserInsert = paUserInsert;
        this.paUserUpdate = paUserUpdate;
        this.paFechaInsert = paFechaInsert;
        this.paFechaUpdate = paFechaUpdate;
    }
    public TbPago(int paCod, TbFactura tbFactura, Date paFecha, Integer paMonto, String paFormaPago, String paUserInsert, String paUserUpdate, Date paFechaInsert, Date paFechaUpdate) {
       this.paCod = paCod;
       this.tbFactura = tbFactura;
       this.paFecha = paFecha;
       this.paMonto = paMonto;
       this.paFormaPago = paFormaPago;
       this.paUserInsert = paUserInsert;
       this.paUserUpdate = paUserUpdate;
       this.paFechaInsert = paFechaInsert;
       this.paFechaUpdate = paFechaUpdate;
    }
   
    public int getPaCod() {
        return this.paCod;
    }
    
    public void setPaCod(int paCod) {
        this.paCod = paCod;
    }
    public TbFactura getTbFactura() {
        return this.tbFactura;
    }
    
    public void setTbFactura(TbFactura tbFactura) {
        this.tbFactura = tbFactura;
    }
    public Date getPaFecha() {
        return this.paFecha;
    }
    
    public void setPaFecha(Date paFecha) {
        this.paFecha = paFecha;
    }
    public Integer getPaMonto() {
        return this.paMonto;
    }
    
    public void setPaMonto(Integer paMonto) {
        this.paMonto = paMonto;
    }
    public String getPaFormaPago() {
        return this.paFormaPago;
    }
    
    public void setPaFormaPago(String paFormaPago) {
        this.paFormaPago = paFormaPago;
    }
    public String getPaUserInsert() {
        return this.paUserInsert;
    }
    
    public void setPaUserInsert(String paUserInsert) {
        this.paUserInsert = paUserInsert;
    }
    public String getPaUserUpdate() {
        return this.paUserUpdate;
    }
    
    public void setPaUserUpdate(String paUserUpdate) {
        this.paUserUpdate = paUserUpdate;
    }
    public Date getPaFechaInsert() {
        return this.paFechaInsert;
    }
    
    public void setPaFechaInsert(Date paFechaInsert) {
        this.paFechaInsert = paFechaInsert;
    }
    public Date getPaFechaUpdate() {
        return this.paFechaUpdate;
    }
    
    public void setPaFechaUpdate(Date paFechaUpdate) {
        this.paFechaUpdate = paFechaUpdate;
    }




}


