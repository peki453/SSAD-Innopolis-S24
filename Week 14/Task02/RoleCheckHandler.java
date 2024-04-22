
public class RoleCheckHandler extends AbstractHandler {
    @Override
    public boolean handle(String request) {
        if ("admin".equals(request)) {
            System.out.println("Hello, admin!");
            return true;
        } else {
            System.out.println("Hello, user!");
            return handleNext(request);
        }
    }
}

public class AuthenticationHandler extends AbstractHandler {
    @Override
    public boolean handle(String request) {
        if ("valid".equals(request)) {
            System.out.println("User authenticated.");
            return handleNext(request);
        } else {
            System.out.println("Authentication failed.");
            return false;
        }
    }
}
