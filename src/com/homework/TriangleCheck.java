package com.homework;

import com.homework.ShapeCheck;
import com.homework.Triangle;

public class TriangleCheck {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(6,6,7);
        ShapeCheck shape1 = new ShapeCheck();
        System.out.println(shape1.isRightTriangle(triangle1));
    }
}
