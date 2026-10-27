/*
注意事项和细节说明  
1.属性的定义语法同变量 示例:访问修饰符 属性类型 属性名;  
访问修饰符:public,private,protected,default

2.属性的定义类型可以为任意类型，包含基本类型或引用类型  
3.属性如果不赋值，有默认值，规则和数组一致。
int 0,short 0,long 0L,byte 0,float 0.0f,double 0.0,char \u0000(空字符),boolean false,String为null   

*/ 
public class PropertiesDetail {
  public static void main(String[] args) { 
    // 创建对象
    //p1是对象名(对象引用)
    //new Person()创建的对象空间(数据)才是真正的对象
    Person p1 = new Person();

    //对象的属性默认值，遵守数组规则:
    System.out.println("\n当前对象p1.age的默认值为:");

    System.out.println("age="+p1.age + " " + "name="+p1.name + " " + "sal="+p1.sal + " " + "isPsss="+p1.isPsss);
  }  
}

class Person {
  // 四个属性
  int age;
  String name;
  double sal;
  boolean isPsss;
}
