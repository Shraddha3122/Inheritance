class room
{
	int len;
	int bre;
	room(int l,int b)
	{
		len=l;
		bre=b;
	}
	void area()
	{
		System.out.print(len*bre);
	}
}
class bedroom extends room
{
	int hei;
	bedroom(int x,int y,int z)
	{
		super(x,y);
		hei=z;
	}
	void volume()
	{
		System.out.print(len*bre*hei);
	}
}
class SingleInheritance
{
	public static void main(String args[])
	{
		bedroom obj=new bedroom(2,3,4);
		obj.area();
		obj.volume();
	}
}