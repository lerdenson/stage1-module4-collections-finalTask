package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectNames = new ArrayList<>();
        for (Map.Entry<String, Set<String>> e : projects.entrySet()) {
            if (e.getValue().contains(developer)) projectNames.add(e.getKey());
        }

        projectNames.sort(new projectComparator());
        return projectNames;
    }

    class projectComparator implements Comparator<String> {

        public int compare(String str1, String str2) {

            if (str1.length() == str2.length()) return str2.compareTo(str1);
            else return str2.length() - str1.length();
        }
    }

}
