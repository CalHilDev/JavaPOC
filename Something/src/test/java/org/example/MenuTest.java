package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuTest {
    Menu menu;
    @BeforeEach
    public void setUp() {
        menu = new Menu();
        Map<String, MenuDetails> menuMap = menu.getMenu();
        MenuDetails menuDetails = new MenuDetails("File_New", "New", "file/image.png", "Creates something new", true);
        menuMap.put(menuDetails.getKey(), menuDetails);
        menuDetails = new MenuDetails("File_Open", "Open", "file/open.png", "Opens a file", true);
        menuMap.put(menuDetails.getKey(), menuDetails);
        menuDetails = new MenuDetails("File_Save", "Save", "file/save.png", "Saves an existing file", false);
        menuMap.put(menuDetails.getKey(), menuDetails);
        menuDetails = new MenuDetails("File_SaveAs", "Save As", "file/saveAs.png", "Saves a new file", true);
        menuMap.put(menuDetails.getKey(), menuDetails);
    }
    @Test
    public void testGetVisibleItems(){
        List<String> result = menu.getVisibleItems();
        assertEquals("New", result.get(0), "The list should say New");
    }
    @Test
    public void testGetTitles(){
        List<String> result = menu.getTitles();
        assertEquals("New", result.get(0), "The list should say New");
    }
    @Test
    public void testVisibleItemsSet(){
        Set<String> result = menu.visibleItemsSet();
        assertEquals("New, Open, Save As", result, "The set should be New");
    }
}
