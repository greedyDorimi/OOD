package designpatterns.strategy;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort implements Sort{
    public void apply(ArrayList<Integer> nums) {
        Collections.sort(nums);
        System.out.println("BubbleSort" + nums);
    }
}
