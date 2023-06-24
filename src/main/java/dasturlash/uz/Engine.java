package dasturlash.uz;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String type = "BestType";

    @Override
    public String toString() {
        return "Engine{" + "type='" + type + '\'' + '}';
    }
}
