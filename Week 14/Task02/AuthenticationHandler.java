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