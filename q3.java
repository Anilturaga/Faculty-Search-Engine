class E0 extends Exception{}
class E1 extends E0{}

class Q3{
    public static void main(String args[]){
        try{
            throw new E1();
        }
        catch(E0 e0){
            System.out.println("yay");
        }
        catch(Exception e){
            System.out.println("as");
        }
    }
}
