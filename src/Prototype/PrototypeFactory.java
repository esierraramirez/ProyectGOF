
package Prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static Map<String, Prototype> prototypes = new HashMap<>();

    public static void addPrototype(String key, Prototype prototype) {
        prototypes.put(key, prototype);
    }

    public static Prototype getPrototype(String key) {
        return prototypes.get(key).clone();
    }
}