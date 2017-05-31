/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.rajmahendra.docker.todo.bean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
@XmlRootElement
public class Login {
    
    private String id;
    private String userName;
    private String password;

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Login{" + "id=" + id + ", userName=" + userName + ", password=" + password + '}';
    }

    
    
}
