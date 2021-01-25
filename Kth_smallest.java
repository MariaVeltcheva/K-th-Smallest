//package com.company;

import java.util.*;

public class Kth_smallest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int k = Integer.parseInt(s.nextLine());

        //ArrayList<Integer> arr1 = new ArrayList<Integer>();
        //ArrayList<Integer> arr2 = new ArrayList<Integer>();

        String input1 = s.nextLine();
        String[] temp1 = input1.split(" ");
        int[] arr1 = new int[temp1.length];
        int i =0;
        for(String str: temp1){
            //arr1.add(Integer.valueOf(str));
            arr1[i] = Integer.parseInt(str);
            i++;
        }

        String input2 = s.nextLine();
        String[] temp2 = input2.split(" ");
        int[] arr2 = new int[temp2.length];
        int j =0;
        for(String str: temp2){
            //arr2.add(Integer.valueOf(str));
            arr2[j] = Integer.parseInt(str);
            j++;
        }

        //ArrayList<Integer> arr3 = new ArrayList<Integer>(mergeList(arr1,arr2));

        int res[]=new int[arr1.length + arr2.length];
        System.arraycopy(arr1,0, res, 0, arr1.length);
        System.arraycopy(arr2,0,res,arr1.length, arr2.length);
        Arrays.sort(res);


        int smallest = res[k-1];
        System.out.println(smallest);
        //System.out.println(Arrays.toString(res));
        //System.out.println(Arrays.toString(arr1.toArray()));
        //System.out.println(Arrays.toString(arr2.toArray()));

    }

    public static ArrayList<Integer> mergeList(ArrayList<Integer> list1, ArrayList<Integer> list2){
        if (list1.size() == 0)
            return list2;
        if (list2.size() == 0)
            return list1;

        ArrayList result = new ArrayList<Integer>();

        if (list1.get(0) <= list2.get(0))
            result.add(list1.remove(0));
        else
            result.add(list2.remove(0));

        result.addAll(mergeList(list1, list2));


        return result;

    }

    /*public static void mergeList(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n1,
                     int n2, ArrayList<Integer> arr3)
    {
        int i = 0, j = 0, k = 0;

        while (i<n1 && j <n2)
        {
            if (arr1.get(i) < arr2.get(i))
                arr3.set(k++,arr1.get(i++));
            else
                arr3.set(k++,arr2.get(j++));
        }

        // Store remaining elements of first array
        while (i < n1)
            arr3.set(k++,arr1.get(i++));

        // Store remaining elements of second array
        while (j < n2)
            arr3.set(k++,arr2.get(j++));
    }*/

    /*public static ArrayList<Integer> mergeList(ArrayList<Integer> list1,
                                 ArrayList<Integer> list2)
    {
        if (list1.size() == 0)
            return list2;
        if (list2.size() == 0)
            return list1;

        ArrayList result = new ArrayList<Integer>();

        if (list1.get(0) < list2.get(0))
            result.add(list1.remove(0));
        else
            result.add(list2.remove(0));

        result.addAll(mergeList(list1, list2));

        return result;
    }*/
}
