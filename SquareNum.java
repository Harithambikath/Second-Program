class SquareNum
{
	public double num;
	public SquareNum(double n)
	{ num=n;
	}
	public void display()
	{
		System.out.println("Square of the number is "+(num*num));
}

	public static void main(String args[])
	{
SquareNum sq=new SquareNum(3.9);
sq.display();
}
}
