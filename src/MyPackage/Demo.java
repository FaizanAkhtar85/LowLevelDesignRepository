package MyPackage;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

//        final Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("bye");
//            }
//        };
////        runnable.run();
//        Thread t1 = new Thread(runnable);
//        t1.start();
//
//        //before java 8
//        final Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("I ran.");
//            }
//        });
//        thread.start();

        //after java 8 lambda expression which is concise...
        //Lambda expressions enable the concise representation of anonymous functions (functional interfaces) in Java
//        new Thread(()-> System.out.println("I ran")).start();
//        MyFunctionalInterface myFunctionalInterface =
//                ()-> "Hello";
//        final MyFunctionalInterface myFunctionalInterface1 = new MyFunctionalInterface() {
//            @Override
//            public String method1() {
//                return "Hi from functional interface";
//            }
//        };
//        System.out.println(myFunctionalInterface.method1());

//        Arrays.asList("Apple","Banana","Chequ","dry-fruits").stream()
//                .filter(s->s.length()>5).forEach(System.out::println);
//        String[] words = new String[10];
//        words[5] = "GFG";
//        Optional<String> word = Optional.ofNullable(words[9]);
//        System.out.println(word);
//        if(word.isPresent())
//            System.out.println("word is present and word is "+word.get().toLowerCase());
//        else
//            System.out.println("word is not present");
//        final Optional<String> word1 = Optional.of(words[3]);
//        System.out.println(word1);
//        final Optional<String> word1 = Optional.ofNullable(words[1]);
//        word1.ifPresentOrElse(val-> System.out.println(val),
//                ()-> System.out.println("value not present"));
//        System.out.println(word1);

//        List<Integer>  listOfNumbers =  List.of(2,6,4,4,5,79,14,15);
//        Predicate<Integer> evenNumbers = num -> num % 2 == 0;
//        final Predicate<Object> predicate = new Predicate<>() {
//            @Override
//            public boolean test(Object o) {
//                return false;
//            }
//        };
//    final List<Integer> collect = listOfNumbers.stream().filter(
//                number-> number %2 ==0
//        ).collect(Collectors.toList());
//        System.out.println(collect);
//
//        System.out.println(listOfNumbers.stream().map(new Function<Integer, Object>() {
//            @Override
//            public Object apply(Integer integer) {
//                return integer *2;
//            }
//        }).collect(Collectors.toList()));

//        System.out.println(predicate.test(15));
//        final List<Integer> listOfEvenNumbers = listOfNumbers.stream().filter(evenNumbers).collect(Collectors.toList());
//        System.out.println(listOfEvenNumbers);

//        Supplier<Double> randomNumber =  ()->Math.random();
//        System.out.println(randomNumber.get());

        List<String> words = Arrays.asList("Hello", "World");
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(Arrays.stream(arr).flatMapToInt(val -> Arrays.stream(val)).collect(Collectors.toList()));
//        System.out.println(words.stream().flatMap(word->Arrays.stream(word.split(""))).collect(Collectors.toList()));



















    }
}
