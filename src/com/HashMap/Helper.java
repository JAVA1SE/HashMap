package com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Helper
{

    public static void HashBasic()
    {
        HashMap<Integer, String> hm = new HashMap();
        hm.put(101, "HM Value One");
        hm.put(102, "HM Value Two");
        hm.put(103, "HM Value Three");
        for (Map.Entry m : hm.entrySet())
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    public static void HashRemove()
    {
        HashMap<Integer, String> map = new HashMap();
        map.put(101,"Let us C");
        map.put(102, "Operating System");
        map.put(103, "Data Communication and Networking");
        System.out.println("Values before remove: "+ map);

        //Remove value for key 102
        map.remove(102);
        System.out.println("Values after remove: "+ map);
    }


    public static void BookExm() {
        //Creating map of Books
        Map<Integer,Book> map=new HashMap<Integer,Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to map
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);

        //Traversing map
        for(Map.Entry<Integer, Book> entry:map.entrySet()){
            int key=entry.getKey();
            Book b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }


}
