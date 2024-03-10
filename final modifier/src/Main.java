public class Main{
    final float pi=3.14f;
    public void Area(int rad){
        System.out.println("Area of "+(pi*rad*rad));
        //pi=3.15f;
    }
    public static void main(String[] args) {
        Main c1=new Main();
        c1.Area(12);
    }
}