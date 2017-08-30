package com.nc.rnd.duplicate;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

/**
 * Created by nirk0816 on 8/23/2017.
 */
public class RemoveDuplicateArrayElements
{
    public static void main(String[] args)
    {
        int a[] = {1, 2, 2, 3, 4, 5, 6, 7, 7, 9};
        RemoveDuplicateArrayElements removeDuplicateArrayElements = new RemoveDuplicateArrayElements();
        int[] removedDuplicate = removeDuplicateArrayElements.removeDuplicate(a);
        for (int i : removedDuplicate)
        {
            System.out.println(i);
        }
    }

    private int[] removeDuplicate(int a[])
    {
        if (a.length < 2)
            return a;

        int j = 0;
        int i = 1;

        while (i < a.length) {
            if (a[i] == a[j]) {
                i++;
            } else {
                j++;
                a[j] = a[i];
                i++;
            }
        }

        int[] B = Arrays.copyOf(a, j + 1);

        return B;
    }
}
