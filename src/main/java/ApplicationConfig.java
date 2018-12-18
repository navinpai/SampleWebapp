import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

/**
 * @author navinpai
 * @created 18/12/18
 */
@ApplicationPath("/")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        Set<Class<?>> resourcesSet = new java.util.HashSet<>();
        addClasses(resourcesSet );
        return resourcesSet;

    }

    private void addClasses(Set<Class<?>> resources ) {
        resources.add( HelloWorld.class);
    }

}