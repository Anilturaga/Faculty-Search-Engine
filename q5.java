class Q5{
    int i = 9;
    Q5(){
        System.out.println("Super");
        this.inc();
    }
    void inc(){
        System.out.println(i);
    }
}
class Q51 extends Q5{
    
    Q51(){
        super();
        System.out.println("Sub");
        i=60;
        this.inc();
        
    }
    void inc(){
        System.out.println(i);
    }
    public static void main(String[] args) {
        Q5 k = new Q51();
    }
}