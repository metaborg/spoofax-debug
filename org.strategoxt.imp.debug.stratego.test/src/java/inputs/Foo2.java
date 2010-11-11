package inputs;
// parse-java -i Foo2.java | pp-aterm > foo2.parsed
class Foo2
{
	static
	{
		boolean x = true;
		if(x) 
			foo();

		if(x)
		{
			foo();
		}
	}
	
	static void foo() {}
  
}