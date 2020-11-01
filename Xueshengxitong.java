package ljf;

public class Xueshengxitong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        System.out.println("******************学生信息*********************");
		        Student la = new Student();
		        la.setName("啦啦啦");
		        la.setAge(19);
		        la.setNumber(111111);
		        la.setSex("男");
		        System.out.println("学生姓名:" + la.getName());
		        System.out.println("学生年龄:" + la.getAge());
		        System.out.println("学生编号:" + la.getNumber());
		        System.out.println("学生性别:" + la.getSex());

		        System.out.println("******************老师信息*********************");
		        Teacher zs = new Teacher();
		        zs.setName("张三");
		        zs.setAge(58);
		        zs.setNumber(222222);
		        zs.setSex("男");
		        zs.setLesson_1("高数");
		        System.out.println("授课老师:" + zs.getName());
		        System.out.println("教师年龄:" + zs.getAge());
		        System.out.println("教师编号:" + zs.getNumber());
		        System.out.println("教师性别:" + zs .getSex());

		        System.out.println("******************课程信息*********************");
		        Lesson_1 gs = new Lesson_1();
		        gs.setName("高数");
		        gs.setTime("双周周1 上午13:30-15:05");
		        gs.setNumber(454647);
		        gs.setPlace("教207");
		        System.out.println(gs.toString());

		        System.out.println("******************课程详情*********************");
		        System.out.println("选课成功");

		    }

		}


		class People{
		    public People(){

		    }
		    public People(String name,int age,int number,String sex){
		        this.name = name;
		        this.age = age;
		        this.number = number;
		        this.sex = sex;
		    }

		    private String name;
		    private int age;
		    private int number;
		    private String sex;

		    public String getName() {
		        return name;
		    }
		    public int getAge() {
		        return age;
		    }
		    public String getSex() {
		        return sex;
		    }
		    public int getNumber() {
		        return number;
		    }
		    public void setName(String name) {
		        this.name = name;
		    }
		    public void setAge(int age) {
		            this.age = age;
		    }
		    public void setNumber(int number) {
		        this.number = number;
		    }
		    public void setSex(String sex) {
		        this.sex = sex;
		    }

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
		    String lesson_1;
		    public String getLesson_1() {
		        return lesson_1;
		    }
		    public void setLesson_1(String lesson_1) {
		        this.lesson_1 = lesson_1;
		    }


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

		    private String name;
		    private String time;
		    private int number;
		    private String place;


		    public String getName() {
		        return name;
		    }
		    public String getTime() {
		        return time;
		    }

		    public String getPlace() {
		        return place;
		    }
		    public int getNumber() {
		        return number;
		    }
		    public void setName(String name) {
		        this.name = name;
		    }
		    public void setTime(String time) {
		        this.time = time;
		    }
		    public void setNumber(int number) {
		        this.number = number;
		    }
		    public void setPlace(String place) {
		        this.place = place;
		    }

		}


		class Lesson_1 extends Lesson{
		    public Lesson_1(){

		    }
		    public Lesson_1(String name,String time,int number,String place){
		        super(name, time, number, place);
		    }
		    public String toString() {
		        return "课程名称：" + getName()+ "\n" + "上课时间：" + getTime() + "\n" + "课程编号：" + getNumber()+ "\n" + "教课地点：" + getPlace()+ "\n";
		    }
	    

}


