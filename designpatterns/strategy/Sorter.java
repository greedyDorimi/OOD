package designpatterns.strategy;

import java.util.ArrayList;

public class Sorter {
    public void sortNumbers(ArrayList<Integer> nums, Sort sort) {
        sort.apply(nums);
    }
}
