
//Add your package
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>(); // Make listner interface

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        // TODO: Implement this method
    }

    public void unsubscribe(String eventType, EventListener listener) {
        // TODO: Implement this method
    }

    public void notify(String eventType, File file) {
        // TODO: Implement this method
    }
}