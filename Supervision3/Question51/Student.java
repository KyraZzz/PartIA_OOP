package Question51;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Student {
    Map<String, Double> map = new TreeMap<>();

    Student() {

    }

    class SortByPercentUp implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (map.get(o1) < map.get(o2)) {
                return 1;
            } else if (map.get(o1) > map.get(o2)) {
                return -1;
            }
            return 0;
        }
    }

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
        Comparator<String> cmp = new SortByPercentUp();
        Map<String, Double> sortByValue = new TreeMap<>(cmp);
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
        Comparator<String> cmp = new SortByPercentUp();
        Map<String, Double> sortByValue = new TreeMap<>(cmp);
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

}
