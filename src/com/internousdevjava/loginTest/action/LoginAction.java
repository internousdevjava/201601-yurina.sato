package com.internousdevjava.loginTest.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevjava.loginTest.dao.loginDAO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * ログインするために値を持ってくるアクションクラス
 * @author yurina sato
 * @version1.0
 * @since1.0
 *
 */
public class LoginAction extends ActionSupport implements SessionAware{

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


    /**
     *idを取得するメソッド
     * @return id 値を返します。
     */
    public String getId(){
        return id;
    }

    /**
     * idを設定するメソッド
     * @param id
     */
    public void setId(String id){
        this.id = id;
    }

    /**
     * パスワードを取得するメソッド
     * @return password 値を返します。
     */
    public String getPass(){
        return password;
    }

    /**
     * パスワードを設定するメソッド
     * @param password
     */
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