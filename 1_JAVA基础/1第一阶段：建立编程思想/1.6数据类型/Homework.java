
// 程序阅读题,看看输出什么?
public class Homework {
  public static void main(String[] args) {
    int n1;
    n1 = 13;
    int n2;
    n2 = 17;
    int n3;
    n3 = n1 + n2;
    System.out.println("n3 = " + n3); //30
    int n4 = 38;
    int n5 = n4 - n3;
    System.out.println("n5 = " + n5);//8

    // 2.使用char类型，分别保存\n\t\r \\ 1 2 3等字符，并打印输出
    char c1 = '\n';//换行
    char c2 = '\t';//制表位
    char c3 = '\r';//回车
    char c4 = '\\';//输出\
    char c5 = '1';//1
    char c6 = '2';//2
    char c7 = '3';//3
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println(c6);
    System.out.println(c7);

    //3.编程，保存两本书名，用+拼接，看效果。保存两个性别，用加号拼接，看效果。保存两本书价格，用加号拼接，看效果
    String bookString1 = "《Java》";
    String bookString2 = "《Python》";
    char sex1 = '男';
    char sex2 = '女';
    double price1 = 89.9;
    double price2 = 59.9;
    System.out.println(bookString1 + bookString2);//《Java》《Python》
    System.out.println(sex1 + sex2);//52906
    System.out.println(price1 + price2);//149.8

    // 4.编程实现如下效果
    // 姓名 年龄 成绩 性别 爱好
    // xx   xx  xx   xx   xx

    // 要求:
    // 1)用变量将姓名、年龄、成绩、性别、爱好存储
    // 2)使用+
    // 3)添加适当的注释
    // 4)添加转义字符,使用一条语句输出
    String name = "张三";
    int age = 18;
    double score = 90.0;
    char sex = '男';
    String hobby = "篮球";
    System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n" + name +"\t"+age+"\t"+score+"\t"+sex+"\t"+hobby);
  }
}
