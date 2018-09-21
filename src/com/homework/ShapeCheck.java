package com.homework;
import com.homework.Triangle;

public class ShapeCheck {
    boolean isRightTriangle (Triangle triangle1){

        if( triangle1.sideA()* triangle1.sideA() + triangle1.sideB() * triangle1.sideB() == triangle1.getSideC() * triangle1.getSideC() ){
            return true;
        } else {
            return false;
        }
    }
}
