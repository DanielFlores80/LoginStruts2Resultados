/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Struts2/Action.java to edit this template
 */
package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 *
 * @author grenn
 */
public class LoginAction extends ActionSupport{
    Logger log = LogManager.getLogger(LoginAction.class);
    private String usuario;
    private String password; 

    
    @Override
    public String execute() throws Exception {
        if ("admin".equals(usuario)) {
            return SUCCESS;//Retorna un "success" en caso de que el usuario ingresado sea "admin"
            
        }else{
            return INPUT;//Retorna un "input" en caso de que no lo sea y redirecciona el archivo struts.xml
        }
    }
    //Setters y Getters sin logica para obtener las variables desde la vista "bienvenido.jsp"
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
