package ua.com.hrv.max;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<java.io.Serializable> arrayList = new MyArrayList<>();

        arrayList.add("Hello");
        arrayList.add("world");
        arrayList.add("Skoda");
        arrayList.add("Octavia");
        arrayList.add(1.6);
        arrayList.add(2014);
        arrayList.add(110);
        arrayList.add(17);
        arrayList.add("4x4");
        arrayList.add("turbo");

        System.out.println(arrayList);
        arrayList.delete(2);
        System.out.println(arrayList);
        arrayList.delete(6);
        System.out.println(arrayList);


        ArrayList<String> arrayList1 = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            arrayList1.add("Hello");
            arrayList1.add(String.valueOf(15));
        }
        for (String s : arrayList1) {
            System.out.println(s);
        }
    }
}
