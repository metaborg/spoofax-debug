package inputs;
// parse-java -i Foo.java | pp-aterm > foo.parsed
public class Foo
{
  public static void main(String[] ps)
  {
    if(ps.length == 0)
      System.err.println("No arguments");
    else
      System.err.println(ps.length + " arguments");
  }
}
