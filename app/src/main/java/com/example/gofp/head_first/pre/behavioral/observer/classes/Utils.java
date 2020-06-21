package com.example.gofp.head_first.pre.behavioral.observer.classes;

import com.example.gofp.binding.Systems;

import java.util.Arrays;
import java.util.Locale;

public class Utils {
    private static final int CIRCULAR_SIZE = 10;
    private static final float EMPTY_VALUE = -200;

    public static float average(float[] array) {
        float sum = 0;
        int count = 0;
        for (float value : array) {
            if (value <= EMPTY_VALUE) {
                return count == 0 ? 0 : sum / count;
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
}
