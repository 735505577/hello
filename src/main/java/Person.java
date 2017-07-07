import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by cshaoshao on 2017/7/7.
 */
 class Person {
     private String name;

    // TODO: 2017/7/7 //程序先运行静态代码块-->构造代码块-->构造函数   
     static
     {
         System.out.println("静态构造代码块");
     }
    {
        System.out.println("构造代码块");// TODO: 2017/7/7 构造代码快可执行多次。每new 了一个对象，都会执行一次 
    }
    Person()
    {
        System.out.println("这是一个空的构造函数");
    }
    Person(String name) {
        {
            this.name=name;
            System.out.println("这是一个构造函数");
        }

    }
}
