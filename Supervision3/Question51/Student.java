package Question51;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Student implements Comparator<Double> {
    Map<String, Double> map = new TreeMap<>();

    Student() {

    }

    Comparator<String> SortByPercentUp = (s1, s2) -> compare(map.get(s1), map.get(s2));

    public void addPair(String name, double percent) {
        map.put(name, percent);
    }

    public List<String> alphabetSort() {
        List<String> res = new ArrayList<String>();
        Set<String> s = map.keySet();
        for (String item : s) {
            res.add(item);
        }
        return res;
    }

    public List<String> topPName(int P) {
        Map<String, Double> sortByValue = new TreeMap<>(SortByPercentUp);
        sortByValue.putAll(map);
        List<String> res = new ArrayList<String>();
        Set<String> s = sortByValue.keySet();
        int count = (int) (s.size() * P * 0.01);
        int index = 0;
        for (String item : s) {
            if (index < count) {
                res.add(item);
            } else {
                break;
            }
            index++;
        }
        return res;
    }

    public double getMedian() {
        double res = 0;
        int index = 0;
        int count1, count2 = 0;
        Map<String, Double> sortByValue = new TreeMap<>(SortByPercentUp);
        sortByValue.putAll(map);
        Set<String> s = sortByValue.keySet();
        if (s.size() % 2 == 0) {
            count1 = s.size() / 2 - 1;
            count2 = s.size() / 2;
        } else {
            count1 = s.size() / 2;
            count2 = count1;
        }
        for (String item : s) {
            if (index == count1) {
                res += map.get(item);
            }
            if (index == count2) {
                res += map.get(item);
            }
            index++;
        }
        return res / 2;
    }

    @Override
    public String toString() {
        return map.toString();
    }

    @Override
    public int compare(Double double1, Double double2) {
        return double2.compareTo(double1);
    }

}
