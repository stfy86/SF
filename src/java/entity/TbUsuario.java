package entity;
// Generated 09/05/2014 01:09:38 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TbUsuario generated by hbm2java
 */
public class TbUsuario  implements java.io.Serializable {


     private int usCod;
     private Integer usCi;
     private String usNombre;
     private String usApellido;
     private String usUsuario;
     private String usPassword;
     private String usUserInsert;
     private String usUserUpdate;
     private Date usFechaInsert;
     private Date usFechaUpdate;
     private Set tbRolesXUsuarios = new HashSet(0);

    public TbUsuario() {
    }

	
    public TbUsuario(int usCod, String usNombre, String usApellido, String usUsuario, String usPassword, String usUserInsert, String usUserUpdate, Date usFechaInsert, Date usFechaUpdate) {
        this.usCod = usCod;
        this.usNombre = usNombre;
        this.usApellido = usApellido;
        this.usUsuario = usUsuario;
        this.usPassword = usPassword;
        this.usUserInsert = usUserInsert;
        this.usUserUpdate = usUserUpdate;
        this.usFechaInsert = usFechaInsert;
        this.usFechaUpdate = usFechaUpdate;
    }
    public TbUsuario(int usCod, Integer usCi, String usNombre, String usApellido, String usUsuario, String usPassword, String usUserInsert, String usUserUpdate, Date usFechaInsert, Date usFechaUpdate, Set tbRolesXUsuarios) {
       this.usCod = usCod;
       this.usCi = usCi;
       this.usNombre = usNombre;
       this.usApellido = usApellido;
       this.usUsuario = usUsuario;
       this.usPassword = usPassword;
       this.usUserInsert = usUserInsert;
       this.usUserUpdate = usUserUpdate;
       this.usFechaInsert = usFechaInsert;
       this.usFechaUpdate = usFechaUpdate;
       this.tbRolesXUsuarios = tbRolesXUsuarios;
    }
   
    public int getUsCod() {
        return this.usCod;
    }
    
    public void setUsCod(int usCod) {
        this.usCod = usCod;
    }
    public Integer getUsCi() {
        return this.usCi;
    }
    
    public void setUsCi(Integer usCi) {
        this.usCi = usCi;
    }
    public String getUsNombre() {
        return this.usNombre;
    }
    
    public void setUsNombre(String usNombre) {
        this.usNombre = usNombre;
    }
    public String getUsApellido() {
        return this.usApellido;
    }
    
    public void setUsApellido(String usApellido) {
        this.usApellido = usApellido;
    }
    public String getUsUsuario() {
        return this.usUsuario;
    }
    
    public void setUsUsuario(String usUsuario) {
        this.usUsuario = usUsuario;
    }
    public String getUsPassword() {
        return this.usPassword;
    }
    
    public void setUsPassword(String usPassword) {
        this.usPassword = usPassword;
    }
    public String getUsUserInsert() {
        return this.usUserInsert;
    }
    
    public void setUsUserInsert(String usUserInsert) {
        this.usUserInsert = usUserInsert;
    }
    public String getUsUserUpdate() {
        return this.usUserUpdate;
    }
    
    public void setUsUserUpdate(String usUserUpdate) {
        this.usUserUpdate = usUserUpdate;
    }
    public Date getUsFechaInsert() {
        return this.usFechaInsert;
    }
    
    public void setUsFechaInsert(Date usFechaInsert) {
        this.usFechaInsert = usFechaInsert;
    }
    public Date getUsFechaUpdate() {
        return this.usFechaUpdate;
    }
    
    public void setUsFechaUpdate(Date usFechaUpdate) {
        this.usFechaUpdate = usFechaUpdate;
    }
    public Set getTbRolesXUsuarios() {
        return this.tbRolesXUsuarios;
    }
    
    public void setTbRolesXUsuarios(Set tbRolesXUsuarios) {
        this.tbRolesXUsuarios = tbRolesXUsuarios;
    }




}


