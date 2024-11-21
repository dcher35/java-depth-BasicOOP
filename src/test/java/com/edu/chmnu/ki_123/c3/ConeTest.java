package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConeTest {
    // Тест для перевірки коректності обчислення площі бічної поверхні
    @Test
    void testCalculateLateralSurfaceArea() {
        Cone cone = new Cone(10, 5);

        double expectedLateralSurfaceArea = Math.PI * 5 * Math.sqrt(Math.pow(10, 2) + Math.pow(5, 2));
        double actualLateralSurfaceArea = cone.calculateLateralSurfaceArea();

        assertEquals(expectedLateralSurfaceArea, actualLateralSurfaceArea, 0.001, "Lateral surface area should be calculated correctly.");
    }

    // Тест для перевірки коректності обчислення об'єму
    @Test
    void testCalculateVolume() {
        Cone cone = new Cone(10, 5);

        double expectedVolume = (Math.PI * Math.pow(5, 2) * 10) / 3.0;
        double actualVolume = cone.calculateVolume();

        assertEquals(expectedVolume, actualVolume, 0.001, "Volume should be calculated correctly.");
    }

    // Тест для перевірки некоректних значень висоти та радіусу
    @Test
    void testInvalidHeightAndRadius() {
        assertThrows(IllegalArgumentException.class, () -> new Cone(-10, 5), "Height must be positive values.");

        assertThrows(IllegalArgumentException.class, () -> new Cone(10, -5), "Radius must be positive values.");

        assertThrows(IllegalArgumentException.class, () -> new Cone(-10, -5), "Height and radius must be positive values.");
    }
}