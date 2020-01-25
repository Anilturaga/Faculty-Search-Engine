import java.lang.String;
class Emp
{
    Emp()
    {}
    public String toString()
        {
            Emp e = new Emp();
            String s2=String.valueOf(e);
            return s2;
        //return null;
        }
        public static void main(String ...args)
        {
            System.out.println(new Emp());
        }
 
}