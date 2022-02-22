package com.dmitriy.test3;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        int r = 0;
        int choice = 0;

        int x = 0;
        int y = 0;


        LinkedList<Point> linkedlist = new LinkedList();
        Scan scan = new Scan();


        for (int i = 0; i < (i + 1); i++) {
            System.out.print("Введите координаты точки \nX:");
            x = scan.scanner.nextInt();

            System.out.print("Y:");
            y = scan.scanner.nextInt();

            Point point = new Point();
            point.point(x, y);
            linkedlist.add(i, point);


            System.out.println("\nЖелаете добавить еще одну точку? (1 - да, 2 - нет)");
            choice = scan.scanner.nextInt();

            if (choice != 2) {
                System.out.println("Ваш выбор 1");
            }

            if (choice == 2) {
                System.out.println("Ваш выбор 2");

                System.out.println("\nВведите точку центра окружности");

                System.out.print("X:");
                x = scan.scanner.nextInt();

                System.out.print("Y:");
                y = scan.scanner.nextInt();

                System.out.println("Введите радиус окружности");
                System.out.print("R: ");
                r = scan.scanner.nextInt();

                linkedlist.add(i+1, point);



            }
            if (choice == 2 && r != 0) {
                break;
            }
        }


        for (int q = 0; q < linkedlist.size()-1; q++) {

            Point point = new Point();
            int distanse =   point.pointDiatance(linkedlist.get(q).x, linkedlist.get(q).y, x,  y);

            Circle circle = new Circle();
            circle.circle(distanse, r);

            if(circle.result() == 1) {
                System.out.println("Точка: " + "X: " + linkedlist.get(q).x + " Y: " + linkedlist.get(q).y + " находится в окружности: ");

            }
        }

        scan.scanner.close();

    }
}
