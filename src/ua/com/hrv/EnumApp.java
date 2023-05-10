package ua.com.hrv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EnumApp {
    public static void main(String[] args) {

        List<Months> ms = new ArrayList<>();
        ms.add(Months.JUNE);
        ms.add(Months.APRIL);
        ms.add(Months.AUGUST);
        ms.add(Months.DECEMBER);
        ms.add(Months.FEBRUARY);
        ms.add(Months.JANUARY);
        ms.add(Months.JULY);
        ms.add(Months.MARCH);
        ms.add(Months.MAY);
        ms.add(Months.NOVEMBER);
        ms.add(Months.OCTOBER);
        ms.add(Months.SEPTEMBER);
        System.out.println(ms);
        List<Season> sea = new ArrayList<>();
        sea.add(Season.AUTUMN);
        sea.add(Season.SPRING);
        sea.add(Season.SUMMER);
        sea.add(Season.WINTER);
//        Season[] sea = Season.values();
        Scanner sc = new Scanner(System.in);


        while (true) {
            menu();
//
            switch (sc.nextInt()) {

                case 1: {
                    System.out.println("Напишіть місяць");
                    sc = new Scanner(System.in);
                    String month = sc.next().toUpperCase();

                    boolean flag = false;
                    for (int i = 0; i < ms.size(); i++) {
                        if (ms.get(i).name().equals(month)) {
                            System.out.println("Місяць " + month + " знайдено");
                            flag = true;
                        }
                        if (!flag) {
                            String er = "Місяць не знайдено";
                        }

                    }
                    break;
                }


                case 2: {
                    System.out.println("Напишіть пору року");
                    sc = new Scanner(System.in);
                    String season = sc.next().toUpperCase();

                    boolean flag = false;

                    for (Months months : ms) {
                        if (months.getSeason().name().equalsIgnoreCase(season)) {
                            flag = true;

                        }
                    }

                    if (flag) {
                        Season seas = Season.valueOf(season);
                        for (Months months : ms) {
                            if (months.season.name().equals(season)) {
                                System.out.println(months);
                            }
                        }
                    }
                    if (!flag) {
                        System.out.println("Пори року не знайдено");
                    }
                    break;
                }

                case 3: {
                    System.out.println("Напишіть місяць");
                    sc = new Scanner(System.in);
                    String day = sc.next().toUpperCase();
                    boolean flag = false;
                    for (Months months : ms) {
                        if (months.name().equalsIgnoreCase(day)) {
                            flag = true;
                        }
                    }
                    if (flag) {
                        Months months3 = Months.valueOf(day);
                        int dayOf = months3.getDays();
                        for (Months months : ms) {
                            if (months.days == dayOf) {
                                System.out.println(months);
                            }
                        }
                    }
                    if (!flag) {
                        System.out.println("Місяців не знайдено");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Напишіть місяць");
                    sc = new Scanner(System.in);
                    String day = sc.next().toUpperCase();
                    boolean flag = false;
                    for (Months months : ms) {
                        if (months.name().equals(day)) {
                            flag = true;
                        }
                    }
                    if (flag) {
                        Months months4 = Months.valueOf(day);
                        int dayOf = months4.getDays();
                        for (Months months : ms) {
                            if (months.days < dayOf) {
                                System.out.println(months);
                            }
                        }
                    }
                    if (!flag) {
                        System.out.println("Місяців не знайдено");
                    }
                    break;
                }

                case 5: {
                    System.out.println("Напишіть місяць");
                    sc = new Scanner(System.in);
                    String day = sc.next().toUpperCase();
                    boolean flag = false;
                    for (Months months : ms) {
                        if (months.name().equals(day)) {
                            flag = true;
                        }
                    }
                    if (flag) {
                        Months months4 = Months.valueOf(day);
                        int dayOf = months4.getDays();
                        for (Months months : ms) {
                            if (months.days > dayOf) {
                                System.out.println(months);
                            }
                        }
                    }
                    if (!flag) {
                        System.out.println("Місяців не знайдено");
                    }
                    break;
                }

                case 6: {
                    System.out.println("Напишіть пору року");
                    sc = new Scanner(System.in);
                    String season = sc.next().toUpperCase();

                    boolean flag = false;

                    for (Season season1 : sea) {
                        if (season1.name().equalsIgnoreCase(season)) {
                            flag = true;
                        }
                    }

                    if (flag) {
                        Season seaso = Season.valueOf(season);
                        int ord = seaso.ordinal();

                        if (ord == (sea.size() - 1)) {
                            ord = 0;
                            System.out.println(sea.get(ord));
                        } else {
                            System.out.println(sea.get(ord + 1));
                        }
                    }
                    if (!flag) {
                        System.out.println("Пору року не знайдено");
                    }
                    break;
                }

                case 7: {
                    System.out.println("Напишіть пору року");
                    sc = new Scanner(System.in);
                    String season = sc.next().toUpperCase();

                    boolean flag = false;
                    for (int i = 0; i < sea.size(); i++) {
                        if (sea.get(i).name().equals(season)){
                            flag = true;
                        }

                    }
                    if (flag) {
                        Season seaso = Season.valueOf(season);
                        int ord = seaso.ordinal();
                        if (ord == (sea.size() - 1)) {
                            ord = 0;
                            System.out.println(sea.get(ord));
                        } else {
                            System.out.println(sea.get(ord - 1));
                        }
                    }
                    if (!flag) {
                        System.out.println("Пору року не знайдено");
                    }
                    break;
                }

                case 8: {
                    for (Months months : ms) {
                        if (months.days % 2 == 0) {
                            System.out.println(months);
                        }
                    }
                }

                case 9: {
                    for (Months months : ms) {
                        if (months.days % 2 == 1) {
                            System.out.println(months);
                        }
                    }
                    break;
                }
                case 10: {
                    System.out.println("Напишіть місяць");
                    sc = new Scanner(System.in);
                    String month = sc.next().toUpperCase();
                    boolean flag = false;
                    for (Months months : ms) {
                        if (months.name().equals(month)) {
                            if (months.days % 2 == 0) {
                                System.out.println("Місяць " + month + " знайдено");
                                System.out.println("Парний");
                            } else {
                                System.out.println("Не парний");
                            }
                            flag = true;
                        }
                    }
                    if (!flag) {
                        System.out.println("Місяць не знайдено");
                    }
                    break;
                }
            }

        }
    }



    public static void menu() {
        System.out.println("Натисніть 1 Перевірити чи є такий місяць");
        System.out.println("Натисніть 2 Вивести всі місяці з такою ж порою року");
        System.out.println("Натисніть 3 Вивести всі місяці які мають таку саму кількість днів");
        System.out.println("Натисніть 4 Вивести на екран всі місяці які мають меншу кількість днів");
        System.out.println("Натисніть 5 Вивести на екран всі місяці які мають більшу кількість днів");
        System.out.println("Натисніть 6 Вивести на екран наступну пору року");
        System.out.println("Натисніть 7 Вивести на екран попередню пору року");
        System.out.println("Натисніть 8 Вивести на екран всі місяці які мають парну кількість днів");
        System.out.println("Натисніть 9 Вивести на екран всі місяці які мають непарну кількість днів");
        System.out.println("Натисніть 10 Вивести на екран чи введений з консолі місяць має парну кількість днів");
    }

}
