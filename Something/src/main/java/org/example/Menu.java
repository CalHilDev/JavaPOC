package org.example;

import java.util.HashMap;
import java.util.Map;

public class Menu {
   /* String placeholder;*/
    Map<Boolean, MenuDetails> menu = new HashMap<Boolean, MenuDetails>();
    List<String> isTrue = new ArrayList<String>();

    public static void setVisibleItems(Boolean isMenuTitle, Boolean isIconLocation, Boolean isHelpText) {
        if (isMenuTitle) {
            menu.put(true, menuTitle);
        }
        if (isIconLocation) {
            menu.put(true, iconLocation);
        }
        if (isHelpText) {
            menu.put(true, helpText);
        }
    }

    public static void getVisibleItems(){
        for(Boolean i : menu.keySet()){
            if(i = true){
                isTrue.add(menu.get(i));
            }
        }
        getTitles();
    }

    public static List getTitles(){
        return isTrue;
    }
}
