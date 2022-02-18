package com.dmitriy.maven.test;


import java.util.LinkedList;

public class PointList {

    int circleX;
    int circleY;

    int circleRadius;
    double PointCircle;


    LinkedList<Point> pointsLinkedList = new LinkedList<Point>();


    public void addPointCircle(Point point1) {
        this.circleX = point1.circleX;
        this.circleY = point1.circleY;
        this.circleRadius = point1.circleRadius;
    }


    public void addPoint(Point point) {
        pointsLinkedList.add(point);
    }



    public void Result() {


        //расстояние между точками
        for (int q = 0; q < pointsLinkedList.size(); q++) {

            double x = pointsLinkedList.get(q).getX();
            double y = pointsLinkedList.get(q).getY();

            PointCircle = Math.sqrt(Math.pow(circleX - x, 2) +Math.pow(circleY - y, 2));

            if(PointCircle < circleRadius) {
                System.out.println("Точка: "+"X: " +x+ "  Y: " +y+  " -- Вписываются в окружность");


            }

        }




    }


}
