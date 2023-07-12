package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> res = new HashMap<>();

        for (Map.Entry<String, Integer> e: sourceMap.entrySet()) {
            Set<String> keys = new HashSet<>();

            if (res.containsKey(e.getKey().length())) {
                keys.addAll(res.get(e.getKey().length()));
                keys.add(e.getKey());


                res.replace(e.getKey().length(), keys);
            }
            else {
                System.out.println(e.getKey());
                keys.add(e.getKey());
                res.put(e.getKey().length(), keys);
            }
        }

        return res;
    }
}
