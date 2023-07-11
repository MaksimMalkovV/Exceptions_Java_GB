package HomeWork_3;
import HomeWork_3.controller.UserController;
import HomeWork_3.model.User;
import HomeWork_3.view.View;



public class Main {
    public static void main(String[] args) {
        User model = new User();
        View view = new View();
        UserController controller = new UserController(model, view);
        controller.CreateUser();
    }
}
