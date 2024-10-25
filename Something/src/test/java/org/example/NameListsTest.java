package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;*/

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
    public void testGetNamesA(){
        nameLists.getNamesA();
    }
    @Test
    public void testGetNamesB(){
        nameLists.getNamesB();
    }
    @Test
    public void testGetNamesAAndNamesB() {
        nameLists.getNamesAAndNamesB();
        nameLists.getNamesAND();
        /*result = nameLists.getNamesAND();
        assertThat(result, hasSize(1));*/
    }
    @Test
    public void testGetNamesOR() {
        nameLists.sendToORList();
        nameLists.getNamesOR();
    }
}
