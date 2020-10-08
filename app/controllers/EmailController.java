package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import static play.libs.Scala.asScala;
import javax.inject.Inject;

import java.util.LinkedList;
import java.util.List;
import services.Email.Menu;
import views.html.Email.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class EmailController extends Controller {

    private final Menu menu;

    @Inject
    public EmailController(Menu menu) {
        this.menu = menu;
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(email.render(asScala(this.menu.menus())));
    }

}
