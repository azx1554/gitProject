package Xi.DesignPattern.VisitorPattern;

/**
 * Requirement:
 *  Sunny软件公司欲为某银行开发一套OA系统，在该OA系统中包含一个员工信息管理子系统，该银行员工包括正式员工和临时工，每周人力资源部和财务部等部门需要对员工数据进行汇总，汇总数据包括员工工作时间、员工工资等。该公司基本制度如下：

 (1) 正式员工(Full time  Employee)每周工作时间为40小时，不同级别、不同部门的员工每周基本工资不同；如果超过40小时，超出部分按照100元/小时作为加班费；如果少于40小时，所缺时间按照请假处理，请假所扣工资以80元/小时计算，直到基本工资扣除到零为止。除了记录实际工作时间外，人力资源部需记录加班时长或请假时长，作为员工平时表现的一项依据。

 (2) 临时工(Part time  Employee)每周工作时间不固定，基本工资按小时计算，不同岗位的临时工小时工资不同。人力资源部只需记录实际工作时间。

 人力资源部和财务部工作人员可以根据各自的需要对员工数据进行汇总处理，人力资源部负责汇总每周员工工作时间，而财务部负责计算每周员工工资。
 */

/**
 * 访问者模式是一种较为复杂的行为型设计模式，它包含访问者和被访问元素两个主要组成部分，这些被访问的元素通常具有不同的类型，且不同的访问者可以对它们进行不同的访问操作。
 * 访问者模式:提供一个作用于某对象结构中的各元素的操作表示，它使我们可以在不改变各元素的类的前提下定义作用于这些元素的新操作。访问者模式是一种对象行为型模式。
 * 在使用访问者模式时，被访问元素通常不是单独存在的，它们存储在一个集合中，这个集合被称为“对象结构”，访问者通过遍历对象结构实现对其中存储的元素的逐个操作。
 */

/**
 * 在具体元素类ConcreteElementA的accept()方法中，通过调用Visitor类的visit()方法实现对元素的访问，并以当前对象作为visit()方法的参数。其具体执行过程如下：

 (1) 调用具体元素类的accept(Visitor visitor)方法，并将Visitor子类对象作为其参数；

 (2) 在具体元素类accept(Visitor visitor)方法内部调用传入的Visitor对象的visit()方法，如visit(ConcreteElementA elementA)，将当前具体元素类对象(this)作为参数，如visitor.visit(this)；

 (3) 执行Visitor对象的visit()方法，在其中还可以调用具体元素对象的业务方法。

 这种调用机制也称为“双重分派”，正因为使用了双重分派机制，使得增加新的访问者无须修改现有类库代码，只需将新的访问者对象作为参数传入具体元素对象的accept()方法，程序运行时将回调在新增Visitor类中定义的visit()方法，从而增加新的元素访问方式。
 */


public class VisitorPatternTest {
}