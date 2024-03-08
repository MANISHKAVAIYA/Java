//parameterized constructor :
class A{
    int roll;
    A(int r){
        roll=r;
    }
    void display(){
        System.out.println(roll);
    }
}
class B{
    public static void main(String[] args) {
        A a1=new A(10);
        a1.display();
    }
}