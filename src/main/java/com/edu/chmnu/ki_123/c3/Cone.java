package com.edu.chmnu.ki_123.c3;

import lombok.Getter;

@Getter
public class Cone {
    private double height;
    private double radius;

    public Cone(double height, double radius) {
        if (height < 0 || radius < 0) {
            throw new IllegalArgumentException("Height and radius must be positive values.");
        }
        this.height = height;
        this.radius = radius;
    }

    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height must be positive values.");
        }
        this.height = height;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be positive values.");
        }
        this.radius = radius;
    }

    public double calculateLateralSurfaceArea() {
        double l = Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2));
        return Math.PI * radius * l;
    }

    public double calculateVolume() {
        return (Math.PI * Math.pow(radius, 2) * height) / 3.0;
    }
}