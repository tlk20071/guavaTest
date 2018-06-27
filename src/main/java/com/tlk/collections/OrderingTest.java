package com.tlk.collections;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Ordering 学习
 * Created by tanlk on 2018/2/5 15:57.
 */
public class OrderingTest {
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        List<String> list = Lists.newArrayList();

        list.add("aa");
        list.add("cc");
        list.add("bb");
        list.add("zz");
        list.add("ff");

        System.out.println("list:" + list);

        Ordering<String> naturalOrdering = Ordering.natural();
        Ordering<Object> usingToStringOrdering = Ordering.usingToString();
        Ordering<Object> arbitaryOrdering = Ordering.arbitrary();

        System.out.println("naturalOrdering:" + naturalOrdering.sortedCopy(list));
        System.out.println("naturalOrdering reverse:" + naturalOrdering.reverse().sortedCopy(list));
        System.out.println("usingToStringOrdering:" + usingToStringOrdering.sortedCopy(list));
        System.out.println("arbitaryOrdering:" + arbitaryOrdering.sortedCopy(list));

        //有空值的list 需要用nullsList 或者 nullsLast
        List<Integer> nullList = Lists.newArrayList(1,5,null,7,5,2);

        System.out.println("naturalOrdering nullsFirst:" + Ordering.natural().nullsFirst().sortedCopy(nullList));
        System.out.println("naturalOrdering nullsLast:" + Ordering.natural().nullsLast().sortedCopy(nullList));


        List<Person> personList = Lists.newArrayList();
        personList.add(new Person("李雷",13));
        personList.add(new Person("苍老师",34));
        personList.add(new Person("韩梅梅",14));
        personList.add(new Person("张三",18));

        System.out.println(personList);

        Ordering<Person> personOrdering = new Ordering<Person>() {
            @Override
            public int compare(@Nullable Person p1, @Nullable Person p2) {
                return  p1.getAge()-p2.getAge();
            }
        };
        System.out.println("按年龄排序：" + personOrdering.sortedCopy(personList));
        System.out.println("按年龄排序：" + personOrdering.reverse().sortedCopy(personList));

    }
}
