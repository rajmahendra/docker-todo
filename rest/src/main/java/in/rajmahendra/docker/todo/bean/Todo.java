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
public class Todo {
    
    private String userName;
    private String message;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ToDoBean{" + "userName=" + userName + ", message=" + message + '}';
    }
    
        
}
