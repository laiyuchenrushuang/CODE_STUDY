package com.study.lambda;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import com.study.lambda.CollectorTest.Cust;

public class CollectorTest {

    public class Cust {
        int id;
        String name;

        public Cust() {
        }

        public Cust(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cust [id=" + id + ", name=" + name + "]";
        }

    }

    public interface Inner {
        public void doSomething();
    }

    @Test
    public void test1() {
        Cust cust = new Cust(1, "A,h");
        Cust cust2 = new Cust(5, "Cm");
        Cust cust3 = new Cust(3, "F");
        Cust cust4 = new Cust(8, "K");
        Cust cust5 = new Cust(8, "L");
        Cust cust6 = new Cust(333, "L");
        List<Cust> list = new ArrayList<>();
        list.add(cust);
        list.add(cust2);
        list.add(cust3);
        list.add(cust4);
        list.add(cust5);
        list.add(cust6);
        // 映射
        // List<Stream<String>> collect = list.stream().map(a ->
        // a.getName().split(",")).map(Arrays::stream).collect(Collectors.toList());
        /*
         * List<String> collect =
         * list.stream().map(Cust::getName).collect(Collectors.toList());
         * System.out.println(collect);
         */
        //Collectors为Stream.collect()方法打造的工具类
        // System.out.println(collect.size());

        Optional<Integer> reduce = list.stream().map(Cust::getId).reduce(Integer::min);
        System.out.println(reduce.get());
        // 分组分区 在筛选的基础上把整个流里面的数据分为不同的组

        // 二次分组
        Map<String, Map<Integer, List<Cust>>> collect = list.stream()
                .collect(Collectors.groupingBy(Cust::getName, Collectors.groupingBy(Cust::getId)));
        Set<String> keySet = collect.keySet();
        keySet.forEach(key -> {
            System.out.println(collect.get(key));
        });

        Map<String, List<Cust>> collect2 = list.stream().collect(Collectors.groupingBy(cus -> {
            if (cus.getId() > 3) {
                return "大于";
            }
            return "不大于";
        }));
        System.out.println(collect2);
        // 使用collectingAndThen() 在分组的基础上再进行最大值最小值分配
        // 对获取到前一个进行分组 然后从分组中获取最大值 并且 将返回值从流中获取到
        Map<String, Cust> collect3 = list.stream().collect(Collectors.groupingBy(Cust::getName,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Cust::getId)), Optional::get)));
        System.out.println(collect3);
        // 分区 只是特殊的分组 固定将流中的数据分为两组
        Map<String, Map<Boolean, List<Cust>>> collect4 = list.stream()
                .collect(Collectors.groupingBy(Cust::getName, Collectors.partitioningBy(cu -> {
                    return cu.getId() > 10;
                }, Collectors.toList())));
        System.out.println(collect4);
        
        Map<Cust, String> collect5 = list.stream().collect(Collectors.toMap(Function.identity(), Cust::getName));
        System.out.println(collect5);
        
        ArrayList<Cust> collect6 = list.parallelStream().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(collect6);
        
        ArrayList<Cust> collect7 = list.stream().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(collect7);
    }

    @Test
    public void test2() {
        int length = 4;
    }

    @Test
    public void method() {
        int number = 1;
        System.out.println(number);
        Inner inner = new Inner() {
            @Override
            public void doSomething() {
                System.out.println(number);
            }
        };
        inner.doSomething();
        System.out.println(number);
    }
    
    @Test
    public void method2() {
        //Stream<String> stream = Stream.of("I", "love", "you", "too");
        //List<String> collect = stream.collect(Collectors.toList());
        //使用toCollection()选择指定归约容器类型
//        List<String> collect2 = stream.collect(Collectors.toCollection(ArrayList::new));
        //String collect = stream.collect(Collectors.joining());
        List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //需要使用同步锁 先进行同步
        List<Integer> synchronizedList = Collections.synchronizedList(asList);
        //多线程流 parallerStream
        synchronizedList.parallelStream().forEach(a -> System.out.print(a + ", "));
        //System.out.println(collect);
        //红黑树
        
        Map<String, Object> map = new HashMap<>();
        map.put(null, nullValue());
        Set<String> keySet = map.keySet();
        String str = "ssss";
        int a = 0;
        System.out.println(str.hashCode());
        
        keySet.forEach(key -> {
            System.out.println(map.get(key));
        });
    }
}