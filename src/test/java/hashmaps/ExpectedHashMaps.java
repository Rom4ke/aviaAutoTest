package hashmaps;

import java.util.HashMap;
import java.util.Map;

public class ExpectedHashMaps {
    HashKeys hashKeys = new HashKeys();
    public Map<String, Object> expectedValueHeader() {
        return new HashMap<String, Object>() {{
            put(hashKeys.pageHeader, "Поиск дешёвых авиабилетов");
        }};
    }
}
