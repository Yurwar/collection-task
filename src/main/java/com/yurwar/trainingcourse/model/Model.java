package com.yurwar.trainingcourse.model;

import java.util.*;

public class Model {
    List<Integer> firstList;

    public Model() {
        firstList = new ArrayList<>();
        firstList.add(4);
        firstList.add(5);
        firstList.add(-6);
        firstList.add(4);
        firstList.add(5);
        firstList.add(3);
        firstList.add(4);
        firstList.add(2);
        firstList.add(4);
        firstList.add(5);
        firstList.add(7);
    }

    public Model(List<Integer> list) {
        firstList = new ArrayList<>(list);
    }

    public Model(int[] array) {
        firstList = new ArrayList<>();
        Arrays.stream(array)
                .forEach(firstList::add);
    }

    public HashMap<Integer, Integer> getRepeatableNumberMap() {
        HashMap<Integer, Integer> repeatableNumberMap = new HashMap<>();

        for (Integer number : firstList) {
            if (!repeatableNumberMap.containsKey(number)) {
                repeatableNumberMap.put(number, 1);
            } else {
                int currentRepeats = repeatableNumberMap.get(number);
                repeatableNumberMap.put(number, ++currentRepeats);
            }
        }

        return repeatableNumberMap;
    }

}
