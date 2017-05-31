/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.rajmahendra.docker.todo.db;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
@Singleton
@Startup
public class TodoDbAccess {

    MongoClient mongoClient = new MongoClient();
    MongoDatabase db = mongoClient.getDatabase("todo");
    MongoCollection col = db.getCollection("users");
    
    
    
    public void getAllTodos(){}
    
    public void getAllTodosFor(String userName){}
    
    public void addTodoFor(String username, String message){}
    
    public void deleteTodo(String username, String message) {}
    
    
    
    @PostConstruct
    public void init() {
    
    }
    
    @PreDestroy
    public void destroy() {
    
    }

}
