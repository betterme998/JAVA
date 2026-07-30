//编码 javac -encoding UTF-8 Char01.java
//运行 java Char01

/*
# 字符类型(char)

基本介绍  
字符类型可以表示单个字符,字符类型是char，char是两个字节(可以存放汉字)多个字符我们用字符串String(我们后面详细讲解String)

字符类型使用细节
1.字符常量是用单引号('')括起来的单个字符。例如:
char c1 = 'a'; char c2 = '中'; char c3 = '9'

2.Java中还允许使用转义字符 八’来将其后的字符转变为特殊字符型常量。
例如:char c3 = '\n’;//'\n'表示 换行符

3.在java中，char的本质是一个整数，在输出时，是unicode码对应的字符。
http://tool.chinaz.com/Tools/Unicode.aspx

4.可以直接给char赋一个整数，然后输出时，会按照对应的unicode 字符输出[97]

5.char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码
*/ 
public class Char01 {
  public static void main(String[] args) {
    char c1 = 'a';
    char c2 = '\t';
    char c3 = '将';
    char c4 = 97; //说明：字符类型可以直接存放一个数字
    System.out.println(c1);//a
    System.out.println(c2);// 
    System.out.println(c3);//将
    System.out.println(c4);//a 当输出c4时候，会输出97表示的字符 => 编码的概念

    // //在java中，char的本质是一个整数，在输出时，是unicode码对应的字符
    //要输出对应的数字，可以(int)字符
    char c5 = 97;
    System.out.println(c5); // a

    char c6 = 'a'; //输出'a' 对应的数字
    System.out.println((int)c6);//97
    char c7 = '将';
    System.out.println((int)c7); //23558
    char c8 = 23558;
    System.out.println(c8);//将

    // //char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码.
    System.out.println('a' + 10); //107

    //课堂小测试
    char c9 = 'b' + 1;
    System.out.println((int)c9); //98 + 1==> 99
    System.out.println(c9);//出现99=>对应的字符=>编码表ASCII(规定好的) c
  }
}
/*
# 编码

字符类型本质探讨

1.字符型 存储到 计算机中，需要将字符对应的码值(整数)找出来，比如'a'  
存储:'a' ==>码值 97 ==>二进制(110 0001) ==>存储  
读取:二进制(110 0001) =>97 ===>'a' => 显示

2.字符和码值的对应关系是通过字符编码表决定的(是规定好)

.介绍一下字符编码表[sublime测试]  
ASCII (ASCII 编码表 一个字节表示:，一个128个字符,实际上一个字节可以表示256个字符,只用128个)  
Unicode (Unicode 编码表 固定大小的编码 使用两个字节来表示字符，字母和汉字统一都是占用两个字节，这样浪费空间)  
utf-8(编码表，大小可变的编码 字母使用1个字节，汉字使用3个字节)  
gbk(可以表示汉字，而且范围广，字母使用1个字节，汉字2个字节)  
gb2312(可以表示汉字，gb2312<gbk)  
big5 码(繁体中文, 台湾，香港)

ASCI 码介绍(了解)
1.ASCII码:上世纪60年代，美国制定了一套字符编码（使用一个字节），对英语字符与二进制位之间的关系，做了统一规定。这被称为ASCII码。ASCII码一共规定了128个字符的编码，只占用了一个字节的后面7位，最前面的1位统一规定为0.特别提示：一个字节可以表示256个字符，ASCII码只用了128个字符

2.看一个完整的ASCII码表

3.缺点：不能表示所有字符

Unicode编码介绍(了解)
1.Unicode的好处:一种编码，将世界上所有的符号都纳入其中。每一个符号都给予一个独一无二的编码，使用 Unicode 没有乱码的问题。  
2.Unicode 的缺点:一个英文字母和一个汉字都占用2个字节，这对于存储空间来说是浪费。

3.2的16次方是 65536，所以最多编码是65536个字符。  
编码0-127的字符是与ASCI的编码一样.比如'a'在ASCII码是 0x61,在 unicode码是  
ox0061,都对应97.因此 Unicode码兼容 ASCII码.

UTF-8编码介绍(了解)
1.UTF-8 是在互联网上使用最广的一种 Unicode 的实现方式 (改进)
2.UTF-8 是一种变长的编码方式。它可以使用 1-6 个字节表示一个符号，根据不同的符号而变化字节长度。  
3.使用 大小可变的编码 字母占1个字节，汉字占3个字节
*/ 