public class MethodExercise02 {
  public static void main(String[] args) {
    // 编写类MyTools类，编写一个方法可以打印二维数组的数据。
    MyTools ArrayUtil = new MyTools();
    int[][] arr = {{1, 2, 3}, {4, 5, 6}};
    ArrayUtil.printArray(arr);






    // 2)编写一个方法copyPerson，可以复制一个Person对象，返回复制的对象。克隆对象，注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
    Person p1 = new Person();
    p1.name = "张三";
    p1.age = 18;
    Person p2 = ArrayUtil.copyPerson(p1);
    p2.name = "张三丰";
    p2.age = 20;
    System.out.println("p1:" + p1.name + "\t" + p1.age);
    System.out.println("p2:" + p2.name + "\t" + p2.age);
    System.out.println(p1 == p2);
  }
}

class MyTools {
  public void printArray(int[][] arr) {
    for (int[] row : arr) {
      for (int data : row) {
        System.out.print(data + "\t");
      }
      System.out.println();
    }
  }

  public Person copyPerson(Person p) {
    Person p2 = new Person();
    p2.name = p.name;
    p2.age = p.age;
    return p2;
  }
}

class Person {
  String name;
  int age;
}