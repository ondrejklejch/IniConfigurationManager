
package iniconfigurationmanager;

import iniconfigurationmanager.items.ConfigItem;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Ondrej Klejch <ondrej.klejch@gmail.com>
 */
public class ConfigSection {

    private String name;

    private Map< String, ConfigItem > items;
    
    public ConfigSection( String name ) {
        this.name = name;
        this.items = new LinkedHashMap<String, ConfigItem>();
    }

    public void addItem( String name, ConfigItem item ) {
        items.put( name, item );
    }

    public boolean hasItem( String name ) {
        return items.containsKey( name );
    }

    public ConfigItem getItem( String name ) {
        return items.get( name );
    }

}