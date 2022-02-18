package com.dmitriy.maven.test;


public class Point {

    int x;
    int y;

    int circleX;
    int circleY;
    int circleRadius;

    public void  PointXYCircle (int circleX, int circleY, int circleRadius) {
        this.circleX = circleX;
        this.circleY = circleY;
        this.circleRadius = circleRadius;
    }

    public int getCircleX() {

        return circleX;
    }

    public void setCircleX(int circleX) {
        this.circleX = circleX;
    }

    public int getCircleY() {
        return circleY;
    }

    public void setCircleY(int circleY) {
        this.circleY = circleY;
    }

    public int getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(int circleRadius) {
        this.circleRadius = circleRadius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void  PointXY(int x, int y) {
        this.x = x;
        this.y = y;




    }


}
