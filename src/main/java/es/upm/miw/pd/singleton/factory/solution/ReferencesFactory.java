package es.upm.miw.pd.singleton.factory.solution;

import java.util.HashMap;
import java.util.Map;

public class ReferencesFactory {
    
    private static ReferencesFactory SINGLETON = new ReferencesFactory();
    
    private Map<String, Integer> references = new HashMap<String, Integer>();

    private int reference = 0;

    private ReferencesFactory() {
    }

    public static ReferencesFactory getFactory() {
        return SINGLETON;
    }
    
    public int getReference(String key) {
        Integer result = this.references.get(key);
        if (result == null) {
            this.references.put(key, this.reference);
            result = this.reference;
            reference++;
        }
        return result;
    }

    public void removeReference(String key) {
        this.references.remove(key);
    }

}
