/**
 * Created by cshaoshao on 2017/7/6.
 */
public class Main {
    static
    {
        System.out.println("主函数的静态代码块");
    }
    public static void main(String[] args) {
        System.out.println("main函数开始执行");
            Person p1=new Person("zhangsan");
            Person p2=new Person();
        System.out.println("main函数结束");// TODO: 2017/7/7 函数的静态代码块优先执行，随着类的加载而加载，在整个程序当中只执行一次 

    }







}



