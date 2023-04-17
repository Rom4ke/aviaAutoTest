package hashmaps;

import pages.AviaMainPage;

import java.util.HashMap;
import java.util.Map;

public class ActualHashMaps {

    HashKeys hashKeys = new HashKeys();
    AviaMainPage aviaMainPage = new AviaMainPage();
    public Map<String, Object> actualValueHeader() {
        return new HashMap<String, Object>() {{
            put(hashKeys.pageHeader, aviaMainPage.pageTitle());
        }};
    }
}
