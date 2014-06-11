

package controllers;

import play.mvc.Controller;
import play.mvc.Security;

@Security.Authenticated(Secured.class)
public class Projects extends Controller {

    public static Result add() {
        Project newProject = Project.create(
                "New project",
                form().bindFromRequest().get("group"),
                request().username()
        );
        return ok(item.render(newProject));
    }

    public static boolean isMember(Long project, String user) {
        return find.where()
                .eq("members.email", user)
                .eq("id", project)
                .findRowCount() > 0;
    }

    public static String rename(Long projectId, String newName) {
        Project project = find.ref(projectId);
        project.name = newName;
        project.update();
        return newName;
    }

    public static Result rename(Long project) {
        if (Secured.isMemberOf(project)) {
            return ok(
                    Project.rename(
                            project,
                            form().bindFromRequest().get("name")
                    )
            );
        } else {
            return forbidden();
        }
    }

    public static Result delete(Long project) {
        if(Secured.isMemberOf(project)) {
            Project.find.ref(project).delete();
            return ok();
        } else {
            return forbidden();
        }
    }

    public static Result addGroup() {
        return ok(
                group.render("New group", new ArrayList<Project>())
        );
    }
}