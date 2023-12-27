package MyPackage;

@FunctionalInterface
public interface MyFunctionalInterface {

    public abstract String method1();
//    public abstract String method2();

    public static String method3() {
        return null;
    }

    public default String method4() {
        return null;
    }
}
