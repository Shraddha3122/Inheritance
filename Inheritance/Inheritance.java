class person
{
	void show()
	{
		System.out.print("Class Person");
	}
}
class student extends person
{
	void disp()
	{
		System.out.print("Class Student");
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		student obj=new student();
		obj.show();
		obj.disp();
	}
}