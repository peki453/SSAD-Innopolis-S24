
public abstract class AbstractHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public boolean handle(String request) {
        if (next != null) {
            return next.handle(request);
        }
        return false;
    }
}
