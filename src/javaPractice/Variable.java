package javaPractice;

	/**
	 * [ access modifier] [non access modifiers] <data type> <name><;>
	 * Variables are of two types 
	 * 1)instance variable or non static variable
	 * e.g. int age;,int id;
	 * 2)static variable
	 * e.g.static int age;,static int id;
	 *
	 */
	public class Variable {
	public int age= 15;
	public static final int a=10;
	static int id=10;
	static public char section='A';
	String name= "Riya";
	
	public  void main(String[] args) {
		//access static variable
		System.out.println(Variable.a);
		System.out.println(Variable.id);
//		System.out.println(Variable.age);
		//access instance variable.you must create an object to access instance variable
		Variable v=new Variable();
		System.out.println(v.age);
		System.out.println(v.name);
		System.out.println(v.section);
		System.out.println(Variable.section);

	}
}