package in.rajmahendra.docker.todo.app;

import in.rajmahendra.docker.todo.resource.LoginResource;
import in.rajmahendra.docker.todo.resource.TodoResource;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
@ApplicationPath("resources")
public class ToDoRestApplication extends Application {

    final Set<Class<?>> classes = new HashSet<>();

    @Override
    public Set<Class<?>> getClasses() {
        classes.add(LoginResource.class);
        classes.add(TodoResource.class);
        return Collections.unmodifiableSet(classes);
    }

}
