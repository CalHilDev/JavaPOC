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
        //send in test data, does the start up needed for all tests
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
        //tests the items with isVisible = true
        List<String> result = menu.getVisibleItems();
        assertEquals("New", result.get(0), "The list should say New");
    }
    @Test
    public void testGetTitles(){
        //gets the titles of each menu map
        List<String> result = menu.getTitles();
        assertEquals("New", result.get(0), "The list should say New");
    }
    @Test
    public void testVisibleItemsSet(){
        //returns the set with items that isVisible = true
        Set<String> result = menu.visibleItemsSet();
        assertEquals("New, Open, Save As", result, "The set should be New");
    }
    @Test
    public void testGetMapLength(){
        //gets the length of the map
        int result = menu.getMapLength();
        assertEquals(4, result, "The length should be 4");
    }
}
