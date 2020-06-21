package com.example.gofp.head_first.sol.behavioral.observer.classes;

import com.example.gofp.binding.Systems;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class Utils {
    private static final Random rand = new Random();
    private static final int CIRCULAR_SIZE = 10;
    private static final float EMPTY_VALUE = -200;

    public static float max(float[] array) {
        float max = Integer.MIN_VALUE;
        for (float value : array) {
            if (value == EMPTY_VALUE) {
                continue;
            }
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static float min(float[] array) {
        float min = Integer.MAX_VALUE;
        for (float value : array) {
            if (value == EMPTY_VALUE) {
                continue;
            }
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static String format(float value) {
        if (!isValid(value)) {
            return "-";
        } else {
            return String.format(Locale.ENGLISH, "%.1f", value);
        }
    }

    public static boolean isValid(float value) {
        return !(value == EMPTY_VALUE || value == Integer.MAX_VALUE || value == Integer.MIN_VALUE);
    }

    public static float average(float[] array) {
        float sum = 0;
        int count = 0;
        for (float value : array) {
            if (value == EMPTY_VALUE) {
                return count == 0 ? EMPTY_VALUE : sum / count;
            }
            sum += value;
            count++;
        }
        return sum / count;
    }

    public static void shift(float[] array, float value) {
        System.arraycopy(array, 0, array, 1, array.length - 1);
        array[0] = value;
    }

    public static float[] create() {
        float[] array = new float[CIRCULAR_SIZE];
        Arrays.fill(array, EMPTY_VALUE);
        return array;
    }

    public static void display(String label, float value) {
        String s = String.format(Locale.ENGLISH, "%s: %.2f", label, value);
        Systems.out.println(s);
    }


    public static float getTemperature() {
        return rand.nextFloat() * 40 + 5;
    }

    public static float getHumidity() {
        return rand.nextFloat() * 50 + 50;
    }

    public static float getPressure() {
        return rand.nextFloat() * 50 + 720;
    }

}
