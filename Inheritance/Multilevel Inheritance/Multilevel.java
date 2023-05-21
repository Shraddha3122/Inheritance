class person
{
	String name;
	int age;
	void get(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void disp()
	{
		System.out.print(name);
		System.out.print(age);
	}
}
class student extends person
{
	int roll;
	void set(int roll)
	{
		this.roll=roll;
	}
	void show()
	{
		System.out.print(roll);
	}
}
class result extends student
{
	int per;
	void input(int per)
	{
		this.per=per;
	}
	void out()
	{
		System.out.print(per);
	}
}
class Multilevel
{
	public static void main(String args[])
	{
		result s=new result();
		s.get("Raj",23);
		s.disp();
		s.set(101);
		s.show();
		s.input(57);
		s.out();
	}
}