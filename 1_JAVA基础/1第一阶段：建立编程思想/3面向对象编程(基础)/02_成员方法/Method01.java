/*
成员方法  
在某些情况下，我们要需要定义成员方法(简称方法)。比如人类:除了有一些属性外(年龄，  
姓名..),我们人类还有一些行为比如:可以说话、跑步..通过学习，还可以做算术题。这时就  
要用成员方法才能完成。现在要求对Person类完善。

添加speak成员方法,输出残是一个好人
添加cal01 成员方法,可以计算从1+..+1000的结果添加getSum成员方法,可以计算两个数的和
添加cal02成员方法,该方法可以接收一个数n，计算从1+..+n的结果

方法调用小结  
1.当程序执行到方法时，就会开辟一个独立的空间(栈空间)  
2.当方法执行完毕，或者执行到return语句时，就会返回，  
3.3.返回到调用方法的地方  
4.4.返回后，继续执行方法后面的代码
*/ 
public class Method01 {
  // 编写一个main方法
  public static void main(String[] args) {
    //1.方法写好后，如果不去调用，不会输出
    Person p1 = new Person();
    p1.speak();//调用方法
    p1.cal01();
    p1.cal02(100);
    int sum = p1.getSum(10, 20);
    System.out.println("结果是：" + sum);
  }
}

class Person {
  String name;
  int age;

  //方法
  //添加speak 成员方法，输出我是一个好人
  //1.public 访问修饰符 表示方法是公开
  //2.void 表示该方法没有返回值
  //3.speak 方法名 方法的名称要和调用的方法一致，首字母小写
  //4.() 方法参数列表 没有参数就用空括号表示
  //5.{} 方法体 大括号里面是执行的方法逻辑代码

  // 添加speak成员方法,输出残是一个好人
  public  void speak() {
    System.out.println("我是一个好人");
  }

  // 添加cal01 成员方法,可以计算从1+..+1000的结果添加getSum成员方法,可以计算两个数的和
  public void cal01() {
    int res = 0;
    for(int i = 1; i <= 1000; i++){
      res += i;
    }
    System.out.println("结果是：" + res);
  }

  // 添加cal02成员方法,该方法可以接收一个数n，计算从1+..+n的结果
  // (int n) 形参列表，表示当前有一个形参?可以接收用户输入
  public void cal02(int n) {
  int res = 0;
  for(int i = 1; i <= n; i++){
    res += i;
  }
  System.out.println("结果是：" + res);
  }

  // //添加getSum成员方法，可以计算两个数的和
  public int getSum(int a, int b) {
    int res = a + b;
    return res;
  }
}
  
