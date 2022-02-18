package com.dmitriy.maven.test;

import java.util.Scanner;

public class ScannerPoint {

    int x;
    int y;
    int choice = 1;

    int circleX;
    int circleY;
    int circleRadius;

    int i;

    public void Scan() {

        PointList pointList = new PointList();



        Scanner scan = new Scanner(System.in);
        if (choice == 1) {
            for (int i = 0; choice != 2; i++) {
                System.out.print("Введите координаты точки \nX:");
                x = scan.nextInt();
                System.out.print("Введите координаты точки \nY:");
                y = scan.nextInt();
                System.out.println("Желаете добавить еще? (1-да 2- нет)");
                choice = scan.nextInt();
                if (choice == 1) {
                    System.out.println("\nВаш выбор: " + choice);
                    i = 1;
                }
                if (choice == 2) {
                    i = 3;
                    System.out.println("\nВаш выбор: " + choice);
                }


                /// передача точек в поинт
                Point point = new Point();
                point.PointXY(x, y);

                // добавление точек в поинт лист
                pointList.addPoint(point);


            }



            // Точка центра круга и радиус
            if (choice == 2) {
                System.out.print("Введите координаты центра \nX:");
                circleX = scan.nextInt();

                System.out.print("Введите координаты центра \nY:");
                circleY = scan.nextInt();

                System.out.print("Введите радиус окружности \nR:");
                circleRadius = scan.nextInt();

                // добавление точек центра круга и радиуса в поинт лист
                Point point1 = new Point();
                point1.PointXYCircle(circleX, circleY,circleRadius);

                pointList.addPointCircle(point1);

                pointList.Result();

                //закрытие потока
                scan.close();

            }

        }



    }




}


