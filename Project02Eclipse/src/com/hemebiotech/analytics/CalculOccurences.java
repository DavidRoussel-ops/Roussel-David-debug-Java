package com.hemebiotech.analytics;

import java.util.*;

public class calculOccurences {


    public void countSymptoms(Map<String, Integer> map) {

        map.forEach((key, value) -> {
            if (map.containsKey(key)) {
                value += 1;
            }
        });



    }


}
