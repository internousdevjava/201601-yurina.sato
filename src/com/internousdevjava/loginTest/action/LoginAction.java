package com.internousdevjava.loginTest.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevjava.loginTest.dao.loginDAO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author internous
 *
 */
public class LoginAction extends ActionSupport implements SessionAware{
    /* ID */
    public String id;
    public String password;
    private Map<String,Object>session;

    public String execute(){
        loginDAO dao = new loginDAO();
        boolean res = dao.select(id,password);

        if(!res){
            return ERROR;
        }


        session.put("id",id);

        return SUCCESS;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getPass(){
        return password;
    }

    public void setPass(String password){
        this.password = password;
    }

    public Map<String, Object> getSession(){
        return session;
    }

    public void setSession(Map<String, Object> session){
        this.session = session;
    }
}