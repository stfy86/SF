package helper;

import hibernate.HibernateUtil;
import entity.TbGasto;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class GastoFH
{  
    private Session sesion; 
    private Transaction tx;  

    public boolean create(TbGasto gasto) throws HibernateException 
    { 
        boolean rta = false;
        Integer id = 0;          
        try 
        { 
            iniciarOperacion(); 
            if(gasto != null){
                auditoriaGuardar(gasto);
                id = (Integer) sesion.save(gasto); 
                if(id != 0){
                    tx.commit(); 
                    rta = true;
                }
                
            }
            
                
            
        } catch (HibernateException he) 
        { 
            manejarExcepcion(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        }  
        
        return rta; 
    }  

    public boolean update(TbGasto gasto) throws HibernateException 
    { 
        boolean rta = false;
        try 
        { 
            iniciarOperacion();            
            auditoriaActualizar(gasto);
            sesion.update(gasto); 
            tx.commit();
            rta = true;            
        } catch (HibernateException he) 
        { 
            manejarExcepcion(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        } 
        return rta;
    }  
    
  
    public boolean delete(TbGasto gasto) throws HibernateException 
    { 
        boolean rta = false;
        try 
        { 
            iniciarOperacion();
            if(gasto != null){
                sesion.delete(gasto); 
                tx.commit();
                rta = true; 
            }
 
        } catch (HibernateException he) 
        { 
            manejarExcepcion(he); 
            throw he; 
        } finally 
        { 
            sesion.close(); 
        } 
        return rta;
    }  

    public TbGasto search(Integer idGasto) throws HibernateException 
    { 
        TbGasto gasto = null;  
        try 
        { 
            iniciarOperacion(); 
            gasto = (TbGasto) sesion.get(TbGasto.class, idGasto); 
        } finally 
        { 
            sesion.close(); 
        }  

        return gasto; 
    } 
    
    //public TbGasto searchGasto(String gasto) throws HibernateException 
    // 
        //TbGasto usr = null; 
       // try 
        // 
            //iniciarOperacion();  
            //String cadena = "from TbGasto where cliNombre = '"+ gasto + "'";
            //List<TbGasto> lista = sesion.createQuery(cadena).list();
            //for (TbGasto p : lista) {  
                //if (p.getGaNombre().equals(gasto)) {  
                    ///return p;  
                //}  
            //}  
                        
        //} catch (HibernateException he) 
        //{ 
            //manejarExcepcion(he); 
            //throw he; 
        //} 
        //finally 
        //{ 
            // sesion.close(); 
        //  

        //return usr; 
    //}
    
    public List<TbGasto> listAll() throws HibernateException 
    { 
        List<TbGasto> listaGastos = null;  

        try 
        { 
            iniciarOperacion(); 
            listaGastos = sesion.createQuery("from TbGasto").list(); 
        } finally 
        { 
            sesion.close(); 
        }  

        return listaGastos; 
    } 
   
    //public boolean existe(String usr, String pw) throws HibernateException 
    //{ 
        //boolean rta = false;
        //try 
        //{ 
            //iniciarOperacion(); 
            //String cadena = "from TbUsuario where usPassword = md5('" + pw +"')"; 
            //List<TbUsuario> lista = sesion.createQuery(cadena).list();             
           // for(TbUsuario u: lista){
                //if (u.getUsUsuario().equals(usr))
                  //  rta = true;
           // }
           
            
        //}catch (HibernateException he) 
        //{ 
           // manejarExcepcion(he); 
           // throw he; 
        //} finally 
        //{ 
           //sesion.close(); 
        //}  

        //return rta; 
    //} 
    
    private void iniciarOperacion() throws HibernateException 
    { 
        sesion = HibernateUtil.getSessionFactory().openSession(); 
        tx = sesion.beginTransaction(); 
    }  

    private void manejarExcepcion(HibernateException he) throws HibernateException 
    { 
        tx.rollback(); 
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he); 
    } 

    private void auditoriaGuardar(TbGasto usr) {
        HttpSession session = Util.getSession();
        String usuario = (String) session.getAttribute("username");
        usr.setGaUserInsert(usuario);
        
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        usr.setGaFechaInsert(date);        
        auditoriaActualizar(usr);
        
    }
    
    private void auditoriaActualizar(TbGasto usr) {
        HttpSession session = Util.getSession();
        String usuario = (String) session.getAttribute("username");
        usr.setGaUserUpdate(usuario);
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        usr.setGaFechaUpdate(date);
        
    }
    



}

