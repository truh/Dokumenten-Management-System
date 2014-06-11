package controllers;

import models.User;
import play.data.*;
import play.mvc.*;
import views.html.*;

/**
 * Entry point of the Application
 *
 * @author Andreas Willinger
 * @version 11.06.2014
 */
public class Application extends Controller
{
    static Form<Login> loginForm = Form.form(Login.class);

    @Security.Authenticated(Secured.class)
    public static Result index() {
        return ok(index.render(session().get("username")));
    }

    public static Result register(String username, String password)
    {
        if(!User.createUser(username, password))
            return badRequest("error");
        return ok("user created");
    }

    public static Result login()
    {
        return ok(
                login.render(loginForm)
        );
    }

    public static Result authenticate()
    {
        Form<Login> filledForm = loginForm.bindFromRequest();

        if (filledForm.hasGlobalErrors()) {
            return badRequest(login.render(filledForm));
        } else {
            session().clear();
            session("username", filledForm.get().username);

            return redirect(
                    routes.Application.index()
            );
        }
    }
    public static Result logout()
    {
        session().clear();
        flash("success", "You've been logged out");

        return redirect(
                routes.Application.login()
        );
    }

    /**
     * The Login Form, required by Play to read/set form data.
     */
    public static class Login
    {
        public String username = "";
        public String password = "";

        /**
         * Do a validation against the Database
         *
         * @return null on success, a string containing a message on failure
         */
        public String validate()
        {
            if(User.doLogin(username, password)) return null;
            return "Invalid username/password combination.";
        }
    }
}
