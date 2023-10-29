package edu.hw3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    private Task3() {
    }

    public static Map<Object, Integer> freqDict(List<?> list) {
        Map<Object, Integer> freqDictionary = new HashMap<>();
        for (Object str : list) {
            freqDictionary.put(str, freqDictionary.getOrDefault(str, 0) + 1);
        }
        return freqDictionary;
    }
}
