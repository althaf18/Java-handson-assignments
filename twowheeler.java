class wheeler {
    void latest() {
        System.out.println("Latest models"); }
}

class bike extends wheeler{
    void ride() { System.out.println("exclusive bikes");}
}
class honda extends bike{
    void milage(){System.out.println("Honda speed bikes");}
}
public class twowheeler {
    public static void main(String[]args){
        honda bike1=new honda();
        bike1.milage();
        bike1.ride();
        bike1.latest();
    }
}
