// 1.public class Hello 表示Hello是一个类，是一个public共有的类
// 2.Hello{} 表示一个类的开始和结束
// 3.public static void main(String[] args)表示一个主方法，即我们程序的入口
// 4.main() {} 表示方法的开始和结束
// 5. System.out.println("Hello, world!");表示输出“hello，world"到屏幕
// 6.;表示语句结束

// 编码：javac -encoding UTF-8 Hello.java
// 运行：java Hello

// 什么是运行

// 1.有了可执行的java（Hello.class字节码文件）
// 2.通过运行工具java.exe 对字节码文件进行执行，本质就是.class装载到jvm机执行
// 

// Java程序开发注意事项
// 对修改后的Hello.java源文件需要重新编译，生成新的class文件后，再执行才能生效
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world2!");
    }
}