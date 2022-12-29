import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        buildArray(new int[]{1, 2, 3});
    }


    @Contract("_ -> param1")
    public static int[] buildArray(int[] nums) {
        int[] newarr = new int[2* nums.length];

        for(int i = 0; i < nums.length; i++)
        {
            newarr[i] = nums[i];
        }
        int j = 0;
        for(int i = nums.length; i < 2 * nums.length; i++)
        {
            newarr[i] = nums[j++];
        }
        System.out.println(Arrays.stream(newarr).toArray());
        return newarr;

    }
}