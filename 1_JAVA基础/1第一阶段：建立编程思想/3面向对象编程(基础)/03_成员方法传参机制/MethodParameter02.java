/*
代码内存分析：从------下面开始分析内存
栈
1.Preson p = new Preson()主方法main创建一个对象p，存储堆里面对象的地址，
2. b.test200(p); 会在栈当中创建test200对象，这个对象的p指向了堆里面对象A的地址，(现在主方法当中的p和test200里面的p指向的是同一个堆里面对象的地址，所以会影响到主方法当中的对象属性)

如果test现在执行：p = new Preson();会在堆里创建一个新的对象B，然后原来指向对象A的联系切断，p指向了对象B的地址，后续修改的都是B对象的属性

堆
1.Preson p = new Preson()堆里面创建一个对象，会在栈里面存储堆里面对象A的地址，
p.name = "张三"; 对象当中有字符串常量池里面的地址（这个张三是放到方法区的，堆里面对象的字符串属性指向的是方法区的字符串常量池里面的地址，）
p.age = 18;在堆的对象里

*/ 

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

    // -----------------------------------------
    Preson p = new Preson();//会在栈里面创建一个对象，会在堆里面创建一个对象，会在栈里面存储堆里面对象的地址
    p.name = "张三";
    p.age = 18;

    // 调用test200方法会在栈里创建一个对象，这个参数p是在test200方法里面的，也指向了堆里面对象的地址，当在test200里面p = null时，只是切断了test200里面的p指向堆里的对象的
    b.test200(p);////引用类型传递的是地址(传递也是值，但是值是地址)，可以通过形参影响实参!
    System.out.println("main方法中对象属性为："+p.name+" "+p.age); //main方法中对象属性为：张三 100

    //测试题,如果 test200 执行的是 p = null ,上面的结果是 //main方法中对象属性为：张三 100
    //测试题,如果 test200 执行的是 p = new Preson();... ,上面的结果是  //main方法中对象属性为：张三 100
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

    // 思考
    // p = null; // 切断了test200里面的p指向堆里的对象的联系，但是堆里的对象还是存在的，只是没有被引用了，主方法中的p依旧指向堆里的对象

    // 思考
    p = new Preson(); // 
    p.age = 100;
    p.name = "李四";
    System.out.println("mtest200方法中对象属性为："+p.name+" "+p.age); //main方法中对象属性为：张三 100

  }
}

class Preson {
  String name;
  int age;
}