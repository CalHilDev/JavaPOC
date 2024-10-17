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
        //can be called to use the list
        for(int i = 0; i < namesA.size(); i++){
            System.out.println(namesA.get(i));
        }
        return namesA;
    }

    public List<String> returnNamesB(){
        //can be called to use the list
        for(int i = 0; i < namesB.size(); i++){
            System.out.println(namesB.get(i));
        }
        return namesB;
    }

    public void sendToANDList(){
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

    public void sendToORList(){
        namesOR.addAll(namesA);
        namesOR.addAll(namesB);
        for(int i = 0; i < namesA.size(); i++){
            for(int j = 0; j < namesB.size(); j++){
                if(namesA.get(i).equals(namesB.get(j))){
                    namesOR.remove(namesA.get(i));
                }
            }
        }
        for(int i = 0; i < namesB.size(); i++){
            for(int j = 0; j < namesA.size(); j++){
                if(namesB.get(i).equals(namesA.get(j))){
                    namesOR.remove(namesB.get(i));
                }
            }
        }
    }

    public List<String> getNamesAND() {
        //can be called to use the list
        for(int i = 0; i < namesAND.size(); i++){
            System.out.println(namesAND.get(i));
        }
        return namesAND;
    }

    public List<String> getNamesOR() {
        //can be called to use the list
        for(int i = 0; i < namesOR.size(); i++){
            System.out.println(namesOR.get(i));
        }
        return namesOR;
    }
}
