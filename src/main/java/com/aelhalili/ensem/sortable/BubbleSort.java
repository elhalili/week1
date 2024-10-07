package com.aelhalili.ensem.sortable;

import java.util.List;

public class BubbleSort {
    public static void sort(List<Sortable> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).getId() > list.get(j + 1).getId()) {
                    Sortable sortable = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, sortable);
                }
            }
        }
    }
}
