package com.rockwell.basics.zoo;

import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        AnimalsName name1 = new AnimalsName(1, "Tyciusz", PlaceOfBirth.CHORZOWSKIEZOO);
        AnimalsName name2 = new AnimalsName(2, "Elmo", PlaceOfBirth.GDANSKIEZOO);
        AnimalsName name3 = new AnimalsName(3, "Gryzelda", PlaceOfBirth.WARSZAWSKIEZOO);
        AnimalsName name4 = new AnimalsName(4, "Edmund", PlaceOfBirth.COLCHESTERZOO);
        AnimalsName name5 = new AnimalsName(5, "Poli", PlaceOfBirth.GDANSKIEZOO);

        Set<AnimalsName> names = new HashSet<>();
        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);
        names.add(name5);


        for (Object e:names) {
            System.out.println((((AnimalsName)e).name)+" "+"miejsce urodzenia"+" "+((AnimalsName) e).placeOfBirth);
        }
    }
}
