package entity;
// Generated 12/05/2014 11:58:21 AM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * TbContrato generated by hbm2java
 */
public class TbContrato  implements java.io.Serializable {


     private int conCod;
     private TbTipoContrato tbTipoContrato;
     private TbCliente tbCliente;
     private int conNro;
     private Boolean conEstado;
     private Date conFechaInicio;
     private Date conFechaFin;
     private String conDescripcion;
     private double conMonto;
     private Double conMontoEntrega;
     private int conCantidadCuotas;
     private double conMontoCuota;
     private String conUserInsert;
     private String conUserUpdate;
     private Date conFechaInsert;
     private Date conFechaUpdate;

    public TbContrato() {
    }

	
    public TbContrato(int conCod, TbTipoContrato tbTipoContrato, TbCliente tbCliente, int conNro, Date conFechaInicio, Date conFechaFin, double conMonto, int conCantidadCuotas, double conMontoCuota, String conUserInsert, String conUserUpdate, Date conFechaInsert, Date conFechaUpdate) {
        this.conCod = conCod;
        this.tbTipoContrato = tbTipoContrato;
        this.tbCliente = tbCliente;
        this.conNro = conNro;
        this.conFechaInicio = conFechaInicio;
        this.conFechaFin = conFechaFin;
        this.conMonto = conMonto;
        this.conCantidadCuotas = conCantidadCuotas;
        this.conMontoCuota = conMontoCuota;
        this.conUserInsert = conUserInsert;
        this.conUserUpdate = conUserUpdate;
        this.conFechaInsert = conFechaInsert;
        this.conFechaUpdate = conFechaUpdate;
    }
    public TbContrato(int conCod, TbTipoContrato tbTipoContrato, TbCliente tbCliente, int conNro, Boolean conEstado, Date conFechaInicio, Date conFechaFin, String conDescripcion, double conMonto, Double conMontoEntrega, int conCantidadCuotas, double conMontoCuota, String conUserInsert, String conUserUpdate, Date conFechaInsert, Date conFechaUpdate) {
       this.conCod = conCod;
       this.tbTipoContrato = tbTipoContrato;
       this.tbCliente = tbCliente;
       this.conNro = conNro;
       this.conEstado = conEstado;
       this.conFechaInicio = conFechaInicio;
       this.conFechaFin = conFechaFin;
       this.conDescripcion = conDescripcion;
       this.conMonto = conMonto;
       this.conMontoEntrega = conMontoEntrega;
       this.conCantidadCuotas = conCantidadCuotas;
       this.conMontoCuota = conMontoCuota;
       this.conUserInsert = conUserInsert;
       this.conUserUpdate = conUserUpdate;
       this.conFechaInsert = conFechaInsert;
       this.conFechaUpdate = conFechaUpdate;
    }
   
    public int getConCod() {
        return this.conCod;
    }
    
    public void setConCod(int conCod) {
        this.conCod = conCod;
    }
    public TbTipoContrato getTbTipoContrato() {
        return this.tbTipoContrato;
    }
    
    public void setTbTipoContrato(TbTipoContrato tbTipoContrato) {
        this.tbTipoContrato = tbTipoContrato;
    }
    public TbCliente getTbCliente() {
        return this.tbCliente;
    }
    
    public void setTbCliente(TbCliente tbCliente) {
        this.tbCliente = tbCliente;
    }
    public int getConNro() {
        return this.conNro;
    }
    
    public void setConNro(int conNro) {
        this.conNro = conNro;
    }
    public Boolean getConEstado() {
        return this.conEstado;
    }
    
    public void setConEstado(Boolean conEstado) {
        this.conEstado = conEstado;
    }
    public Date getConFechaInicio() {
        return this.conFechaInicio;
    }
    
    public void setConFechaInicio(Date conFechaInicio) {
        this.conFechaInicio = conFechaInicio;
    }
    public Date getConFechaFin() {
        return this.conFechaFin;
    }
    
    public void setConFechaFin(Date conFechaFin) {
        this.conFechaFin = conFechaFin;
    }
    public String getConDescripcion() {
        return this.conDescripcion;
    }
    
    public void setConDescripcion(String conDescripcion) {
        this.conDescripcion = conDescripcion;
    }
    public double getConMonto() {
        return this.conMonto;
    }
    
    public void setConMonto(double conMonto) {
        this.conMonto = conMonto;
    }
    public Double getConMontoEntrega() {
        return this.conMontoEntrega;
    }
    
    public void setConMontoEntrega(Double conMontoEntrega) {
        this.conMontoEntrega = conMontoEntrega;
    }
    public int getConCantidadCuotas() {
        return this.conCantidadCuotas;
    }
    
    public void setConCantidadCuotas(int conCantidadCuotas) {
        this.conCantidadCuotas = conCantidadCuotas;
    }
    public double getConMontoCuota() {
        return this.conMontoCuota;
    }
    
    public void setConMontoCuota(double conMontoCuota) {
        this.conMontoCuota = conMontoCuota;
    }
    public String getConUserInsert() {
        return this.conUserInsert;
    }
    
    public void setConUserInsert(String conUserInsert) {
        this.conUserInsert = conUserInsert;
    }
    public String getConUserUpdate() {
        return this.conUserUpdate;
    }
    
    public void setConUserUpdate(String conUserUpdate) {
        this.conUserUpdate = conUserUpdate;
    }
    public Date getConFechaInsert() {
        return this.conFechaInsert;
    }
    
    public void setConFechaInsert(Date conFechaInsert) {
        this.conFechaInsert = conFechaInsert;
    }
    public Date getConFechaUpdate() {
        return this.conFechaUpdate;
    }
    
    public void setConFechaUpdate(Date conFechaUpdate) {
        this.conFechaUpdate = conFechaUpdate;
    }




}


