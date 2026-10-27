// 面向对象的方式解决养猫问题
/*
# 类与对象

类和对象的区别和联系

1.类是抽象的，概念的，代表一类事物,比如人类,猫类...即它是数据类型.  
2.对象是具体的，实际的，代表一个具体事物，即是实例  
3.类是对象的模板，对象是类的一个个体，对应一个实例

属性/成员变量

从概念或叫法上看:成员变量=属性=field字段 (即 成员变量是用来表示属性的，授课中，统一叫属性)

属性是类的一个组成部分，一般是基本数据类型,也可是引用类型(对象，数组)。比如我们前面定义猫类的int age就是属性
*/ 
public class Object01 { 
    public static void main(String[] args) {
      //使用00P面向对象解决
      //实例化一只猫[创建一只猫对象]!
      Cat cat1 = new Cat();
      cat1.name = "小白";
      cat1.age = 1;
      cat1.color = "黄色";

      Cat cat2 = new Cat();
      cat2.name = "小黑";
      cat2.age = 2;
      cat2.color = "黑色";

      // //怎么访问对象的属性呢
      System.out.println("第一只猫信息" + cat1.name +" " + cat1.age + " " + cat1.color);
      System.out.println("第二只猫信息" + cat2.name +" " + cat2.age + " " + cat2.color);
    }
}

class Cat {
  // 属性
  String name;
  int age;
  String color;
}
