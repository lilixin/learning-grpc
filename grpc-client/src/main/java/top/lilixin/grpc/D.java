package top.lilixin.grpc;

/**
 * @Description TODO
 * @Author lilixin
 * @Date 2021/1/25 10:10 上午
 **/
public class D {
    public static void main(String[] args) {
        System.out.println(i);
    }

    static {
        i = 6;
        System.out.println("D : 静态代码块2");
    }
    static {
        i = 2;
        System.out.println("D : 静态代码块1");
    }
    static int i;
}
