package progmatic;

import java.util.Map;

public class MyEntry {
    Object key;
    Object value;

    public MyEntry(Object key, Map<Object,Object> map) {
        this.key = key;
        this.value = map.get(key);
    }

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
