package org.example;

import java.util.*;

public class Menu {
    Map<String, MenuDetails> menuMap = new LinkedHashMap<String, MenuDetails>();
    List<String> isTrue = new ArrayList<>();

    public Map<String, MenuDetails> getMenu() {
        return menuMap;
    }

    public void setMenu(Map<String, MenuDetails> menu) {
        this.menuMap = menu;
    }

    public List<String> getVisibleItems(){
        //Checks what items isVisible = true and returns them
        List<String> visibleItems = new ArrayList<>();
        for(MenuDetails i : menuMap.values()){
            if(i.getVisible()){
                visibleItems.add(i.getMenuTitle());
            }
        }
        return visibleItems;
    }

    public List<String> getTitles(){
        //returns the MenuTitle of each menuMap
        List<String> titles = new ArrayList<>();
        for(MenuDetails i : menuMap.values()){
            titles.add(i.toString());
        }
        return titles;
    }

    public Set<String> visibleItemsSet(){
        //stores the visible items in a set
        Set<String> visibleItems = new HashSet<>();
        for(MenuDetails i : menuMap.values()){
            if(i.getVisible()){
                visibleItems.add(i.getMenuTitle());
            }
        }
        return visibleItems;
    }

    public int getMapLength(){
        //returns length of the map
        int mapLength = menuMap.size();
        return mapLength;
    }
}
