package com.java8.newfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by zwshao on 9/28/15.
 */
public class ListStream {

    public static void parallel() {
        System.out.println("in parallel");

        List<String> list = init();

        double result = list.parallelStream().filter(element -> element.length() > 5).mapToDouble(element -> element.length()).sum();

        System.out.println(result);

        System.out.println("out parallel");
    }

    public static void NotParallel() {
        System.out.println("In list stream not parallel");
        List<String> list = init();

        List<String> listFilter = list.stream().filter(element -> element.length() > 4).collect(Collectors.toList());

        System.out.println(listFilter.size());

        System.out.println(list.size());

        System.out.println("Out list stream not parallel");
    }

    public static void flatten() {
        List<List<Integer>> list = new ArrayList();
        List<Integer> subList1 = IntStream.range(9, 100).boxed().collect(Collectors.toList());

        List<Integer> subList2 = IntStream.range(101, 200).boxed().collect(Collectors.toList());

        list.add(subList1);
        list.add(subList2);

        System.out.println(list.parallelStream().flatMap(element -> element.stream().map(ele -> ele > 10 && ele < 150)).collect(Collectors.toList()).size());

    }

    private static List<String> init() {
        List<String> list = new ArrayList();

        list.add("fist");
        list.add("second");

        return list;
    }

}
