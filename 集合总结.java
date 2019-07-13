ArrayList:
	底层数据结构:数组
	
	public class ArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable
	实现了List，Random Access，Serializable,Cloneable,
	元素可为空   可重复    可随机访问 可序列化  可以克隆

	
	两个集合的交集retainAll          并集addAll                 差集remove   


LinkedList:
	底层数据结构 双向链表

	public class LinkedList<E> extends AbstractSequentialList<E>
    implements List<E>, Deque<E>, Cloneable, java.io.Serializable   

    实现List，Deque，Cloneable，Serializable
    元素可为空  可重复  可克隆 可序列化  可以当队列使用(Deque)      


    LinkedList 和 ArrayList区别：
    （1） LinkedList底层数据结构是双向链表  ArrayList底层数据结构 数组
    （2）LinkedList不需要扩容 new个node就行       ArrayList需要扩容
    （3）ArrayList 更适合随机访问  底层是数组 用下标就能访问
    （4）LinkedList更适合随机插入或删除 只需要修改prev和next 就行   数组需要移动
    （5）构造方法不同

    相同点：List可重复 可为空    Cloneable克隆   Serializable可序列化


 Vector：
 	实现的接口和ArrayList实现的接口一样 List Cloneable Serializable RandomAccess
 	底层数据结构:数组
 	初始容量
 	扩容
 	线程安全  

 	Vector 和 ArrayList 的区别:
 	(1)Vector是线程安全的
   （2）Vector默认容量是10     ArrayList默认容量为0
   （3）Vector默认2倍扩容 	ArrayList默认1.5倍扩容
   （4）Vector可以指定扩容倍数
   （5）Vector是线程安全的 synchronized

   
    Stack 栈   底层是vector


Map: <key,value>键值对存储


HashMap：
	hashmap存放  
		先算hashCode 散列码
		再除以长度减一
		扰动处理 

		哈希冲突：

	解决Hash冲突的方法:
		1.开放地址法：
			（1）线性探测 index+1，index+2.。。。。
			（2）随机探测法 随机一组数据 2,3,6,1,9.。。
			（3）二次探测再散列 index+1^2  ,index+1^2....
		2.链地址法：		？？？？				最佳的情况下HashMap的查找效率 O(1)   
		3.公共溢出区法：重复的值存在一个新的空间下
		4.再哈希：定义多个计算公式（哈希算法）


	HashMap 和 Hashtable 的区别
		（1）遍历方式比 HashMap 多一种
		（2）Hashtable 父类 Dictionary  HashMap 父类 AbstractMap
		（3）Hashtable 初始大小11  HashMap 初始大小16
		对数组初始化时机不同 Hashtable 构造函数       HashMap  增加第一个元素
		（4）Hashtable 没有进行扰动处理 计算index的时候 HashMap &    hashTable %
		（5）扩容方式  Hashtable *2+1   HashMap*2
		（6）Hashtable 是线程安全的集合
		 
    

TreeMap
	navigableMap:说明了 TreeMap 内部的元素是有序的

	