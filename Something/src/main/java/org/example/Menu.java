package org.example;

import java.util.*;

public class Menu {
   /* String placeholder;*/
    Map<String, MenuDetails> menuMap = new LinkedHashMap<String, MenuDetails>();
    List<String> isTrue = new ArrayList<>();

    public Map<String, MenuDetails> getMenu() {
        return menuMap;
    }

    public void setMenu(Map<String, MenuDetails> menu) {
        this.menuMap = menu;
    }

    public List<String> getVisibleItems(){
        List<String> visibleItems = new ArrayList<>();
        for(MenuDetails i : menuMap.values()){
            if(i.getVisible()){
                System.out.println(i.getMenuTitle());
                visibleItems.add(i.getMenuTitle());
            }
        }
        return visibleItems;
    }

    public List<String> getTitles(){
        List<String> titles = new ArrayList<>();
        for(MenuDetails i : menuMap.values()){
            titles.add(i.toString());
        }
        return titles;
    }

    public Set<String> visibleItemsSet(){
        Set<String> visibleItems = new HashSet<>();
        for(MenuDetails i : menuMap.values()){
            if(i.getVisible()){
                visibleItems.add(i.getMenuTitle());
            }
        }
        return visibleItems;
    }
}
