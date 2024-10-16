package org.example;

import java.util.ArrayList;
import java.util.List;

public class NameLists {
    List<String> namesA = new ArrayList<>();
    List<String> namesB = new ArrayList<>();
    List<String> namesAND = new ArrayList<>();
    List<String> namesOR = new ArrayList<>();

    public void setNamesA(String name) {
        namesA.add(name);
    }

    public void setNamesB(String name) {
        namesB.add(name);
    }

    public List<String> returnNamesA(){
        for(int i = 0; i < namesA.size(); i++){
            System.out.println(namesA.get(i));
        }
        return namesA;
    }

    public List<String> returnNamesB(){
        for(int i = 0; i < namesB.size(); i++){
            System.out.println(namesB.get(i));
        }
        return namesB;
    }

    public void sendToList(){
        for(int i = 0; i < namesA.size(); i++){
            for(int j = 0; j < namesB.size(); j++){
                if(namesA.get(i).equals(namesB.get(j))){
                    namesAND.add(namesA.get(i));
                }
                else{
                    namesOR.add(namesA.get(i));
                }
            }
        }
    }
}
