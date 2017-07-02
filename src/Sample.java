
   class Sample {
	
	public int c;
	
	public void samp()
	{
		System.out.println("first");
	}
	
	public void add(int a, int b)
	{
		
		c=a+b;
		System.out.println(c);
	}

	
	public static class Exe
	{
		public static void main(String[] args) {
		
			Sample obj=new Sample();
			obj.samp();
			obj.add(10, 40);
		}
	}
	
	
	
	
}
