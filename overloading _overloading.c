class overl
	{
		int area;
		public void calarea(int r)
		{
			float result=(float) 3.14 * r * r;
			System.out.println(result);

		}
		public void calarea(int l,int w)
		{
			int ans= l * w;
			System.out.println(ans);
		}
		
		public static void main(String args[])
		{
			overl s1=new overl();
			s1.calarea(3);
			
		}
	}