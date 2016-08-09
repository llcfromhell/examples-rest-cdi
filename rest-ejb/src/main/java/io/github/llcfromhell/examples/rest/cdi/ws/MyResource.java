
package io.github.llcfromhell.examples.rest.cdi.ws;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import io.github.llcfromhell.examples.rest.cdi.service.MyService;



/** Example resource class hosted at the URI path "/myresource"
 */
@Path("myresource")
@RequestScoped
public class MyResource {
    
	@Inject
	MyService myService;
	
	
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET 
    @Produces("text/plain")
    public String getIt() {
        return "Hi there! " + myService.getPrvtAttr();
    }
    
    
}
