package pl.rockwell.basics.zoo;

import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        AnimalsName name1 = new AnimalsName(1, "Tyciusz");
        AnimalsName name2 = new AnimalsName(2, "Elmo");
        AnimalsName name3 = new AnimalsName(3, "Gryzelda");
        AnimalsName name4 = new AnimalsName(4, "Edmund");
        AnimalsName name5 = new AnimalsName(5, "Poli");

        Set<AnimalsName> names = new HashSet<>();
        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);
        names.add(name5);

        System.out.println(name1.equals(name2));
        System.out.println(name3.hashCode());
        System.out.println(name2.hashCode());
    }
}
