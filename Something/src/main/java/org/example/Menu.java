package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Menu {
   /* String placeholder;*/
    Map<String, MenuDetails> menu = new HashMap<String, MenuDetails>();
    List isTrue = new List();

    /*public static void setVisibleItems(Boolean isMenuTitle, Boolean isIconLocation, Boolean isHelpText) {
        if (isMenuTitle) {
            menu.put(true, menuTitle);
        }
        if (isIconLocation) {
            menu.put(true, iconLocation);
        }
        if (isHelpText) {
            menu.put(true, helpText);
        }
    }*/

    public static void getVisibleItems(){
        /*for(Boolean i : menu.keySet()){
            if(i = true){
                isTrue.add(menu.get(i));
            }
        }*/
        menu.get(key);
        //run check for isVisible
        //if true get item, else ignore
    }

    public static List getTitles(){
        List titles = new List();
        for(MenuDetails i : menu.values()){
            titles.add(i);
        }
        return titles;
    }
}
