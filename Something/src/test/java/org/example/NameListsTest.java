package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NameListsTest {
    NameLists nameLists;
    @BeforeEach
    public void setUp(){
        nameLists = new NameLists();
        nameLists.setNamesA("John");
        nameLists.setNamesA("Brian");
        nameLists.setNamesA("Steve");

        nameLists.setNamesB("Brian");
        nameLists.setNamesB("Barry");
        nameLists.setNamesB("Tyrone");
        nameLists.setNamesB("Hector");
        nameLists.setNamesB("Jimmy");
    }
    @Test
    public void testReturnNamesA(){
        nameLists.returnNamesA();
    }
    @Test
    public void testReturnNamesB(){
        nameLists.returnNamesB();
    }
    @Test
    public void testGetNamesAND() {
        nameLists.sendToANDList();
        nameLists.getNamesAND();
    }
    @Test
    public void testGetNamesOR() {
        nameLists.sendToORList();
        nameLists.getNamesOR();
    }
}
