// javac encoding UTF-8 Array01.java
// java Array01
/*
数组可以存放多个同一类型的数据。数组也是一种数据类型，是引用类型。  
即:数组就是一组数据

数组的使用1：动态初始化
数据类型[] 数组名=new 数据类型[大小]  
int[] a = new int[5]://创建了一个数组.名字a.存放5个int

先声明数组  
语法:数据类型 数组名[];也可以 数据类型[] 数组名;  
int a[];或者int[] a;

数组的使用1：静态初始化  
语法:数据类型数组名[]={元素值,元素值...}  
int[] a = {1,2,3,4,5};//创建了一个数组.名字a.存放5个int

数组使用注意事项和细节  
1.数组是多个相同类型数据的组合，实现对这些数据的统一管理  
2.数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用。  
3.数组创建后如果没有赋值，有默认值。int 0,short 0,long 0L,byte 0,float 0.0f,double 0.0,char \u0000(空字符),boolean false,String为null  
4.使用数组的步骤1.声明数组并开辟空间2给数组各个元素赋值3使用数组  
5.数组的下标是从0开始的。  
6.数组下标必须在指定范围内使用，否则报:下标越界异常，比如int [] arr=new int[5];则有效下标为 0-4  
7.数组属引用类型，数组型数据是对象(object)
*/ 
public class Array01 {
  public static  void main(String[] args) {
    /*
    它们的体重分别是3kg,5kg,1kg,3.4kg,2kg,50kg请问这六只鸡的总体重是多少?平均体重是多少?
    思路分析
    1.定义六个变量 double 求和 得到总体重
    2.平均体重=总体重/6
    */ 
  //  double hen1 = 3;
  //  double hen2 = 4;
  //  double hen3 = 56;
  //  double hen4 = 7;
  //  double hen5 = 8;
  //  double hen6 = 90;
  //  double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
  //  double avgWeight = totalWeight / 6;
  //  System.out.println("总体重为:" + totalWeight);
  //  System.out.println("平均体重为:" + avgWeight);

  // 比如，我们可以用数组来解决上一个问题
  double[] hans = {3, 6, 1, 3.4, 2, 50};
  double totalWeight = 0;
  double avgWeight = 0;
  for(int i = 0; i < hans.length; i++) {
    totalWeight += hans[i];
  }
  avgWeight = totalWeight / 6;
  System.out.println("总体重为:" + totalWeight);
  System.out.println("平均体重为:" + avgWeight);

  } 
}
