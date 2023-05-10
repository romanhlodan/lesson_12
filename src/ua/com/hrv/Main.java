package ua.com.hrv;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(randomNumber(1, 500));
        arrayList1.add(randomNumber(1, 500));
        arrayList1.add(randomNumber(1, 500));
        arrayList1.add(randomNumber(1, 500));
        arrayList1.add(randomNumber(1, 500));
        arrayList1.add(randomNumber(1, 500));
        arrayList1.add(randomNumber(1, 500));
        arrayList1.add(randomNumber(1, 500));
        System.out.println(arrayList1);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            switch (scanner.nextInt()) {

                case 1: {
                    ArrayList<Car> arrayList = new ArrayList<>();
                    arrayList.add(new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(14, 17), "алькантара"), new Engine(randomEng(3, 12))));
                    arrayList.add(new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(14, 17), "алькантара"), new Engine(randomEng(3, 12))));
                    arrayList.add(new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(14, 17), "алькантара"), new Engine(randomEng(3, 12))));
                    arrayList.add(new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(14, 17), "алькантара"), new Engine(randomEng(3, 12))));
                    arrayList.add(new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(14, 17), "алькантара"), new Engine(randomEng(3, 12))));
                    arrayList.add(new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(14, 17), "алькантара"), new Engine(randomEng(3, 12))));
                    arrayList.add(new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(14, 17), "алькантара"), new Engine(randomEng(3, 12))));
                    arrayList.add(new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(14, 17), "алькантара"), new Engine(randomEng(3, 12))));
                    System.out.println(arrayList);
                    break;
                }
                case 2: {
                    ArrayList<Car> arrayList2 = new ArrayList<>();
                    arrayList2.add(new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(14, 17), "алькантара"), new Engine(randomEng(3, 12))));
                    arrayList2.add(new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(14, 17), "алькантара"), new Engine(randomEng(3, 12))));
                    arrayList2.add(new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(14, 17), "алькантара"), new Engine(randomEng(3, 12))));
                    arrayList2.add(new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(14, 17), "алькантара"), new Engine(randomEng(3, 12))));
                    arrayList2.add(new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(14, 17), "алькантара"), new Engine(randomEng(3, 12))));
                    arrayList2.add(new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(14, 17), "алькантара"), new Engine(randomEng(3, 12))));
                    arrayList2.add(new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(14, 17), "алькантара"), new Engine(randomEng(3, 12))));
                    arrayList2.add(new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(14, 17), "алькантара"), new Engine(randomEng(3, 12))));
                    ArrayList<Car> awq = new ArrayList<>(Collections.nCopies(arrayList2.size(),new Car(110, 2014, new Helm(15, "алькантара"), new Engine(4))));
                    System.out.println(awq);
                    break;
                }
            }
        }

        }


    public static int randomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static int randomEng(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static int randomHelm(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static int randomHP(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static int randomYear(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void menu() {
        System.out.println("1 - Вивести масив");
        System.out.println("2 - Задати статичні значення");
    }

}
