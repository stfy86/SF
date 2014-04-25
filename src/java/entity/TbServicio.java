package entity;
// Generated 25/04/2014 10:50:16 AM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * TbServicio generated by hbm2java
 */
public class TbServicio  implements java.io.Serializable {


     private int serCod;
     private TbTipoServicio tbTipoServicio;
     private String serDescripcion;
     private int serPrecioUnitario;
     private String serUserInsert;
     private String serUserUpdate;
     private Date serFechaInsert;
     private Date serFechaUpdate;

    public TbServicio() {
    }

    public TbServicio(int serCod, TbTipoServicio tbTipoServicio, String serDescripcion, int serPrecioUnitario, String serUserInsert, String serUserUpdate, Date serFechaInsert, Date serFechaUpdate) {
       this.serCod = serCod;
       this.tbTipoServicio = tbTipoServicio;
       this.serDescripcion = serDescripcion;
       this.serPrecioUnitario = serPrecioUnitario;
       this.serUserInsert = serUserInsert;
       this.serUserUpdate = serUserUpdate;
       this.serFechaInsert = serFechaInsert;
       this.serFechaUpdate = serFechaUpdate;
    }
   
    public int getSerCod() {
        return this.serCod;
    }
    
    public void setSerCod(int serCod) {
        this.serCod = serCod;
    }
    public TbTipoServicio getTbTipoServicio() {
        return this.tbTipoServicio;
    }
    
    public void setTbTipoServicio(TbTipoServicio tbTipoServicio) {
        this.tbTipoServicio = tbTipoServicio;
    }
    public String getSerDescripcion() {
        return this.serDescripcion;
    }
    
    public void setSerDescripcion(String serDescripcion) {
        this.serDescripcion = serDescripcion;
    }
    public int getSerPrecioUnitario() {
        return this.serPrecioUnitario;
    }
    
    public void setSerPrecioUnitario(int serPrecioUnitario) {
        this.serPrecioUnitario = serPrecioUnitario;
    }
    public String getSerUserInsert() {
        return this.serUserInsert;
    }
    
    public void setSerUserInsert(String serUserInsert) {
        this.serUserInsert = serUserInsert;
    }
    public String getSerUserUpdate() {
        return this.serUserUpdate;
    }
    
    public void setSerUserUpdate(String serUserUpdate) {
        this.serUserUpdate = serUserUpdate;
    }
    public Date getSerFechaInsert() {
        return this.serFechaInsert;
    }
    
    public void setSerFechaInsert(Date serFechaInsert) {
        this.serFechaInsert = serFechaInsert;
    }
    public Date getSerFechaUpdate() {
        return this.serFechaUpdate;
    }
    
    public void setSerFechaUpdate(Date serFechaUpdate) {
        this.serFechaUpdate = serFechaUpdate;
    }




}


