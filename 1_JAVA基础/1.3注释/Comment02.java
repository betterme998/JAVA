/*
//编码 javac -encoding UTF-8 Comment02.java
//运行 java Comment02
3.文档注释:  
文档注释:注释内容可以被JDK提供的工具iavadoc所解析，生成一套以网页文件形式体现的该程序的说明文档,一般写在类

javadoc -d 文件夹名(放到那个目录) -xx -yy （要生成的javadoc标签） Demo3.java 
javadoc -encoding UTF-8 -d D:\代码\JAVA\1_JAVA基础\1.3注释\temp -author -version Comment02.java

基本格式  
如何生成对应的文档注释  
应用实例
@author       标识一个类的作者                 @author description
@deprecated   指名一个过期的类或成员            @deprecated description
{@docRoot}    指明当前文档根目录的路径          Directory Path
@exception    标志一个类抛出的异常             @exception exception-name explanation
{@inheritDoc} 从直接父类维承的注释             Inherits a comment from the immediate surperclass
{@link}       插入一个到另一个主题的链接       {@link name text}
{@linkplain}  插入一个到另一个主题的链接，但是该链接显示纯文木字体  Inserts an in-line link to another topic.
@param        说明一个方法的参数               @param parameter.name explanation
@return       说明返回值类型                   @return explanation
@see          指定一个到另一个主题的链接        @see anchor
@serial       说明一个序列化属性               @serial description
@serialData   说明通过writeObject()和 writeExternal()方法写的数据  @serialData description
@serialField  说明一个ObjectstreamField 组件   @serialField name type description
@since        标记当引入一个特定的变化时        @since release
@throws       和 @exception 标签一样.          The @throws tag has the same meaning as the @exception tag.
{@value)      显示常量的值，该常最必须是static 属性。  Displays the value of a constant, which must be a static field.
@version      指定类的版本                     @version info
*/ 

/**
 * @author 徐强
 * @version 1.0
 * **/ 

public class Comment02 {
  // 编写一个main方法
  public static void main(String[] args) {

  }
  
}
