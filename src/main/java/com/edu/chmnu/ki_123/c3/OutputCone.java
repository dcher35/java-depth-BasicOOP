package com.edu.chmnu.ki_123.c3;

public class OutputCone {
    public static void main(String[] args) {
        Cone cone = new Cone(10, 5);

        double height = cone.getHeight();
        double radius = cone.getRadius();

        System.out.printf("Lateral Surface Area: %.3f%n", cone.calculateLateralSurfaceArea());

        System.out.printf("Volume: %.3f%n", cone.calculateVolume());
        
        System.out.printf("Height: %.3f, Radius: %.3f%n", height, radius);
    }
}