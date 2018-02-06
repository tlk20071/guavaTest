package com.tlk.collections;

/**
 * Created by tanlk on 2018/2/5 17:25.
 */
public class Person {
    private String name;
    private Integer age;
    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
