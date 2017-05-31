/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.rajmahendra.docker.todo.resource;

import in.rajmahendra.docker.todo.bean.Todo;
import in.rajmahendra.docker.todo.db.TodoDbAccess;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
@Path("todo")
public class TodoResource {
    
    @Inject
    TodoDbAccess dbAccess;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{userName}")
    public List<Todo> getAllToDos(@PathParam("userName") String userName) {
        List<Todo> todos = new ArrayList<Todo>();
        return todos;
    }

    @DELETE
    @Path("{userName}")
    public void deleteToDo(@PathParam("userName") String userName) {
    }

    @POST
    @Path("{userName}")
    public List<Todo> getToDosFor(@PathParam("userName") String userName) {
        return null;
    }

}
