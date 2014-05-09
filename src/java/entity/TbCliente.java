package entity;
// Generated 09/05/2014 01:09:38 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TbCliente generated by hbm2java
 */
public class TbCliente  implements java.io.Serializable {


     private int cliCod;
     private Integer cliCi;
     private String cliRuc;
     private String cliNombre;
     private String cliApellido;
     private String cliDireccion;
     private Integer cliTelefono;
     private String cliUserInsert;
     private String cliUserUpdate;
     private Date cliFechaInsert;
     private Date cliFechaUpdate;
     private Set tbFacturas = new HashSet(0);
     private Set tbContratos = new HashSet(0);

    public TbCliente() {
    }

	
    public TbCliente(int cliCod, String cliNombre, String cliApellido, String cliUserInsert, String cliUserUpdate, Date cliFechaInsert, Date cliFechaUpdate) {
        this.cliCod = cliCod;
        this.cliNombre = cliNombre;
        this.cliApellido = cliApellido;
        this.cliUserInsert = cliUserInsert;
        this.cliUserUpdate = cliUserUpdate;
        this.cliFechaInsert = cliFechaInsert;
        this.cliFechaUpdate = cliFechaUpdate;
    }
    public TbCliente(int cliCod, Integer cliCi, String cliRuc, String cliNombre, String cliApellido, String cliDireccion, Integer cliTelefono, String cliUserInsert, String cliUserUpdate, Date cliFechaInsert, Date cliFechaUpdate, Set tbFacturas, Set tbContratos) {
       this.cliCod = cliCod;
       this.cliCi = cliCi;
       this.cliRuc = cliRuc;
       this.cliNombre = cliNombre;
       this.cliApellido = cliApellido;
       this.cliDireccion = cliDireccion;
       this.cliTelefono = cliTelefono;
       this.cliUserInsert = cliUserInsert;
       this.cliUserUpdate = cliUserUpdate;
       this.cliFechaInsert = cliFechaInsert;
       this.cliFechaUpdate = cliFechaUpdate;
       this.tbFacturas = tbFacturas;
       this.tbContratos = tbContratos;
    }
   
    public int getCliCod() {
        return this.cliCod;
    }
    
    public void setCliCod(int cliCod) {
        this.cliCod = cliCod;
    }
    public Integer getCliCi() {
        return this.cliCi;
    }
    
    public void setCliCi(Integer cliCi) {
        this.cliCi = cliCi;
    }
    public String getCliRuc() {
        return this.cliRuc;
    }
    
    public void setCliRuc(String cliRuc) {
        this.cliRuc = cliRuc;
    }
    public String getCliNombre() {
        return this.cliNombre;
    }
    
    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }
    public String getCliApellido() {
        return this.cliApellido;
    }
    
    public void setCliApellido(String cliApellido) {
        this.cliApellido = cliApellido;
    }
    public String getCliDireccion() {
        return this.cliDireccion;
    }
    
    public void setCliDireccion(String cliDireccion) {
        this.cliDireccion = cliDireccion;
    }
    public Integer getCliTelefono() {
        return this.cliTelefono;
    }
    
    public void setCliTelefono(Integer cliTelefono) {
        this.cliTelefono = cliTelefono;
    }
    public String getCliUserInsert() {
        return this.cliUserInsert;
    }
    
    public void setCliUserInsert(String cliUserInsert) {
        this.cliUserInsert = cliUserInsert;
    }
    public String getCliUserUpdate() {
        return this.cliUserUpdate;
    }
    
    public void setCliUserUpdate(String cliUserUpdate) {
        this.cliUserUpdate = cliUserUpdate;
    }
    public Date getCliFechaInsert() {
        return this.cliFechaInsert;
    }
    
    public void setCliFechaInsert(Date cliFechaInsert) {
        this.cliFechaInsert = cliFechaInsert;
    }
    public Date getCliFechaUpdate() {
        return this.cliFechaUpdate;
    }
    
    public void setCliFechaUpdate(Date cliFechaUpdate) {
        this.cliFechaUpdate = cliFechaUpdate;
    }
    public Set getTbFacturas() {
        return this.tbFacturas;
    }
    
    public void setTbFacturas(Set tbFacturas) {
        this.tbFacturas = tbFacturas;
    }
    public Set getTbContratos() {
        return this.tbContratos;
    }
    
    public void setTbContratos(Set tbContratos) {
        this.tbContratos = tbContratos;
    }




}


