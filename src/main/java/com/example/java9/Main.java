package com.example.java9;

import java.io.ObjectStreamField;

public class Main {
    // TODO: 04.05.2022 Скопировал строку из String для пробы
    static final long serialVersionUID = -6849794470754667710L;
    static int serialVersion =6849;
    // TODO: 04.05.2022 Ещё одна
    static final ObjectStreamField[] serialPersistentFields =
            new ObjectStreamField[0];

    static void Java(){
        System.out.println("Java Programming language");
    }
    public static void main(String[] args) {
        // TODO: 05.05.2022 поиграл с random
        for(int i = 0; i<5; i++)
            System.out.println(Math.round(Math.random()*10));
        // Создал обЬект 1
        Computer Computer1 = new Computer("6", 8, 512, 4, 2);
        // Создал обЬект 2
        Computer Computer2 = new Computer("4", 16, 256, 10, 1);
        // TODO: 22.04.2022 Создал обЬект 3
        Computer Computer3 = new Computer("8", 4, 1024, 2, 4);
        // TODO: 23.04.2022 обЬект 4
        Computer Computer4 = new Computer();

        System.out.println(Computer1.toString());
        System.out.println(Computer2.toString("10"));
        System.out.println(Computer3.toString());
        System.out.println(Computer4.toString());
        System.out.println(serialVersionUID);
        System.out.println(serialPersistentFields);
        Computer4.srtr();
        System.out.println(serialVersion);
        Java();
    }
}
