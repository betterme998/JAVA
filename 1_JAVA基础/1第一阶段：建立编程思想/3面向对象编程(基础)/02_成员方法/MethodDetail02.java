
/*
方法调用细节说明  
1.同一个类中的方法调用:直接调用即可。比如print(参数);

2.跨类中的方法A类调用B类方法:需要通过对象名调用。比如对象名.方法名(参数);案例演示:B类 sayHello调用print()

3.特别说明一下:跨类的方法调用和方法的访问修饰符相关，先暂时这么提一下，后面我们讲到访问修饰符时，还要再细说。
*/ 
public class MethodDetail02 {
  public static void main(String[] args) {
    A a = new A();
    a.sayOk();
    a.m1();
  }
}

class A {
  // 同一个类中的方法调用:直接调用即可
  public void  print(int n) {
    System.out.println("print()方法被调用 n=" + n);
  }

  public void sayOk() { //sayOk调用 print
    print(10);
  }

  public void  m1() {
    B b = new B(); // 创建了B类的对象
    b.hi(); // 跨类中的方法调用:需要通过对象名调用

  }
}
// 跨类中的方法A类调用B类方法:需要通过对象名调用
class B {
  public void hi() {
    System.out.println("B类中的hi()被执行");
  }
}