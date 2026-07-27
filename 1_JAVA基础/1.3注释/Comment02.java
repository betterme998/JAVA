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
    //选中，然后输入 tab 整体右移
    //选中，然后输入 shift+tab 整体左移
    int n1 = 1 + 2;
    int n2 = 5 + 10;
  }
  
}

/*
# 代码规范

1.类、方法的注释，要以javadoc的方式来写。  
2.非Java Doc的注释，往往是给代码的维护者看的，着重告述读者为什么这样写如何修改，注意什么问题等  
3.使用tab操作，实现缩进,默认整体向右边移动，时候用shift+tab整体向左移  
4.运算符和 = 两边习惯性各加一个空格。比如:2+4\*5+345-89的  
5.源文件使用utf-8编码  
6.行宽度不要超过80字符  
7.代码编写次行风格和行尾风格

1.1.4 骆驼法则  
Java中，除了包名，静态常量等特殊情况，大部分情况下标识符使用骆驼法则，即单词之间不使用特殊符号分割，而是通过首字母大写来分割。比如: supplierName, addNewContract，而不是 supplier_name, add_new_contract。

1.2 包名  
使用小写字母如 com.xxx.settlment，不要 com.xxx.Settlement  
单词间不要用字符隔开，比如 com.xxx.settlment.jsfutil，而不要com.xxx.settlement.jsf_util

1.3.2 后缀  
类名往往用不同的后缀表达额外的意思，如下表：  
后缀名 -----意义 ----------------------- ----------- ----------- ---- 举例  
Service 表明这个类是个服务类，里面包含了给其他类提同业务服务的方法 PaymentOrderService  
Impl 这个类是一个实现类，而不是接口 PaymentOrderServiceImpl  
Inter 这个类是一个接口 LifeCycleInter  
Dao 这个类封装了数据访问方法 PaymentOrderDao  
Action 直接处理页面请求，管理页面逻辑了类 UpdateOrderListAction  
Listener 响应某种事件的类 PaymentSuccessListener  
Event 这个类代表了某种事件 PaymentSuccessEvent  
Servlet 一个Servlet PaymentCallbackServlet  
Factory 生成某种对象工厂的类 PaymentOrderFactory  
Adapter 用来连接某种以前不被支持的对象的类 DatabaseLogAdapter  
Job 某种按时间运行的任务 PaymentOrderCancelJob  
Wrapper 这是一个包装类，为了给某个类提供没有的能力 SelectableOrderListWrapper  
Bean 这是一个POJO MenuStateBean

1.4 方法名
首字母小写，如 addOrder() 不要 AddOrder()  
动词在前，如 addOrder()，不要orderAdd()  
动词前缀往往表达特定的含义，如下表：  
前缀名 意义 举例  
create 创建 createOrder()  
delete 删除 deleteOrder()  
add 创建，暗示新创建的对象属于某个集合 addPaidOrder()  
remove 删除 removeOrder()  
init或则initialize 初始化，暗示会做些诸如获取资源等特殊动作 initializeObjectPool  
destroy 销毁，暗示会做些诸如释放资源的特殊动作 destroyObjectPool  
open 打开 openConnection()  
close 关闭 closeConnection()<  
read 读取 readUserName()  
write 写入 writeUserName()  
get 获得 getName()  
set 设置 setName()  
prepare 准备 prepareOrderList()  
copy 复制 copyCustomerList()  
modity 修改 modifyActualTotalAmount()  
calculate 数值计算 calculateCommission()  
do 执行某个过程或流程 doOrderCancelJob()  
dispatch 判断程序流程转向 dispatchUserRequest()  
start 开始 startOrderProcessing()  
stop 结束 stopOrderProcessing()  
send 发送某个消息或事件 sendOrderPaidMessage()  
receive 接受消息或时间 receiveOrderPaidMessgae()  
respond 响应用户动作 responseOrderListItemClicked()  
find 查找对象 findNewSupplier()  
update 更新对象 updateCommission()

1.5 域（field）名  
1.5.1 静态常量  
全大写用下划线分割，如  
public static find String ORDER_PAID_EVENT = “ORDER_PAID_EVENT”;

1.5.2 枚举  
全大写，用下划线分割，如  
public enum Events {  
ORDER_PAID,  
ORDER_CREATED  
}

1.5.3 其他  
首字母小写，骆驼法则，如：  
public String orderName;  
1.6 局部变量名  
参数和局部变量名首字母小写，骆驼法则。尽量不要和域冲突，尽量表达这个变量在方法中的意义。  
2. 代码格式  
用空格字符缩进源代码，不要用tab，每个缩进4个空格。  
2.1 源文件编码  
源文件使用utf-8编码，结尾用unix n 分格。  
2.2 行宽  
行宽度不要超过80。Eclipse标准  
2.3 包的导入  
删除不用的导入，尽量不要使用整个包的导入。在eclipse下经常使用快捷键 ctrl+shift+o 修正导入。  
2.4 类格式  
2.5 域格式  
每行只能声明一个域。  
域的声明用空行隔开。

*/ 
