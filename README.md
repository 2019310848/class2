# class2
学生选课系统

## 实验目的
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
掌握面向对象的类设计方法（属性、方法）；
掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

## 实验方法
1.编辑学生、老师、课程信息
2.分类分别编写student teacher  lesson people 等这些类
3.调试并修改

## 实验过程
1.编辑学生、老师、课程信息
2.分别创建student类，把学生的信息用变量输入并赋值
3.然后按照第二步依次把teacher  lesson people 等这些类输入并赋值
4.检查对错并运行结果

## 核心方法
```
class People{
		    public People(){

		    }
		    public People(String name,int age,int number,String sex){
		        this.name = name;
		        this.age = age;
		        this.number = number;
		        this.sex = sex;
		    }
class Student extends People{
		    public Student(){

		    }
		    public Student(String name,int age,int number,String sex){
		        super(name, age, number, sex);
		    }
		}
class Teacher extends People{
		    public Teacher(){

		    }
		    public Teacher(String name,int age,int number,String sex){
		        super(name, age, number, sex);
		    }
class Lesson{
		    public Lesson(){

		    }
		    public Lesson(String name,String time,int number,String place){
		        this.name = name;
		        this.time = time;
		        this.number = number;
		        this.place = place;
		    }
```

## 实验结果
******************学生信息*********************
学生姓名:啦啦啦
学生年龄:19
学生编号:111111
学生性别:男
******************老师信息*********************
授课老师:张三
教师年龄:58
教师编号:222222
教师性别:男
******************课程信息*********************
课程名称：高数
上课时间：双周周1 上午13:30-15:05
课程编号：454647
教课地点：教207

******************课程详情*********************
选课成功

## 实验感想
这次的学生模拟选课实验不仅仅是训练了我如何使用java来编辑一个程序，也是对我在编辑过程中逻辑运用的提高，这次的实验里要用到学生与老师身份上的信息，要有逻辑性的一层一层地罗列出来，
就比如学生和老师信息模块，还有课程相关信息模块。学会使用super()，用于实例化子类，掌握类的继承用法等，把刚刚学到的知识应用到实际实验中，给我的印象还是很深刻的。
