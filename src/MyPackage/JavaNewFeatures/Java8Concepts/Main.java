package MyPackage.JavaNewFeatures.Java8Concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

interface MyFunc{
    double method1(int input);
    default  void method2(){
        System.out.println("This is default method of functional Interface");
    }
    static void method3(){
        System.out.println("This is static method of functional Interface");
    }
}
public class Main {

    interface f1{
        int operation(int a,int b);
    }
    interface f2{
        void saySomething(String msg);
    }
    private int operate(int a,int b, f1 obj){
        return obj.operation(a,b);
    }
    public static void main(String[] args) {
//        final MyFunc helloAnonymous = new MyFunc() {
//            @Override
//            public void method1() {
//                System.out.println("hello anonymous");
//            }
//        };
//        helloAnonymous.method1();
//
//        int number = 10;
//        MyFunc f= (radius)-> {
//            System.out.println("hello");
////            number++;
//           return 3.14 * radius * radius;
//        };
//        number =11;
//        final double v = f.method1(5);
//        System.out.println(v);

        List<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
//        arrL.forEach(e->{
//            if(e%2==0)
//                System.out.println(e);
//        });
        arrL.stream().filter(e->e%2==0).forEach(s-> System.out.println(s));
//        f1 obj1 = (a,b)->a+b;
//        f1 obj2 = (a,b)->a*b;
//        Main m = new Main();
//        System.out.println(m.operate(3,5,obj1));
//        System.out.println(m.operate(3,5,obj2));
//        f2 obj3 = (str)-> System.out.println(str);
//        obj3.saySomething("Hello welcome to world of functional programming");


        Consumer<Integer> cons =  value-> System.out.println(value);
        BiConsumer<Integer,Integer> biConsumer = (v1, v2)-> System.out.println(v1+""+v2);
        cons.accept(15);
        biConsumer.accept(20,30);

        Predicate predicate = (value) -> value != null;
        System.out.println(predicate.test(null));

    }
}
