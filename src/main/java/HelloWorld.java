

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Response;


/**
 * @author navinpai
 * @created 18/12/18
 */
@Path("/")
public class HelloWorld {

    private static final CacheControl NO_CACHE;
    static {
        NO_CACHE = new CacheControl();
        NO_CACHE.setNoCache(true);
        NO_CACHE.setNoStore(true);
        NO_CACHE.setMaxAge(0);
        NO_CACHE.setPrivate(true);
    }

    @GET
    @Path("hello")
    public Response helloWorld(){
        return Response.ok("Hello World")
                       .cacheControl(NO_CACHE)
                       .build();

    }
    
}
