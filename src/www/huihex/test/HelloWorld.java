package www.huihex.test;

/*
 * @author llx
 * @date 2020/6/3-5:00
 */
public class HelloWorld {


    public static void main(String[] args) {
        System.out.println("hello world ！！！");
        method1();
    }
    /**
     * 测试方法
     */
    public static void method1(){
        int[] array={1,22,33};
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
        for (int ii : array) {
            System.out.println(ii);
        }
    }
}
