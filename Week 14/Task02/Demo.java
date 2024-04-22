
public class Demo {
    public static void main(String[] args) {
        Handler roleCheck = new RoleCheckHandler();
        Handler auth = new AuthenticationHandler();

        auth.setNext(roleCheck); // Set the chain: auth -> roleCheck

        processRequest("valid", auth);
        processRequest("invalid", auth);
    }

    private static void processRequest(String request, Handler handler) {
        System.out.println("Processing: " + request);
        if (!handler.handle(request)) {
            System.out.println("Request denied.\n");
        } else {
            System.out.println("Request approved.\n");
        }
    }
}
