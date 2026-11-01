

public class MethodParameter02 {
  public static void main(String[] args) {
    // 测试
    B b = new B();
    int[] arr = {1,2,3};
    b.test100(arr);
    System.out.println("main方法中数组元素为：");
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + "\t");//引用类型传递的是地址(传递也是值，但是值是地址)，可以通过形参影响实参!
    }
    System.out.println();
    // main方法中数组元素为：
    // 200     2       3

    Preson p = new Preson();
    p.name = "张三";
    p.age = 18;

    b.test200(p);////引用类型传递的是地址(传递也是值，但是值是地址)，可以通过形参影响实参!
    System.out.println("main方法中对象属性为："+p.name+" "+p.age); //main方法中对象属性为：张三 100
  }
}

class B {
  //B类中编写一个方法test100，
 //可以接收一个数组，在方法中修改该数组，看看原来的数组是否变化
 public void test100(int[] arr) {
   arr[0] = 200;
  //  遍历数组
  System.out.println("test100方法中数组元素为：");

  for(int i = 0; i < arr.length; i++){
    System.out.print(arr[i] + "\t");
  }
  System.out.println();
  // test100方法中数组元素为：
  // 200     2       3
 }

  // B类中编写一个方法test200，可以接收一个Person(age,sal)对象，在方法中修
  // 改该对象属性，看看原来的对象是否变化?
  public void test200(Preson p) {
    p.age = 100; //修改对象属性
  }
}

class Preson {
  String name;
  int age;
}