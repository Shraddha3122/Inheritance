interface printable
{
	void print();
}
interface showable
{
	void show();
}
class Multiple implements printable,showable
{
	public void print()
	{
		System.out.println("Printable");
	}
	public void show()
	{
		System.out.println("Showable");
	}
	public static void main(String args[])
	{
	Multiple obj=new Multiple();
	obj.print();
	obj.show();
	}
}