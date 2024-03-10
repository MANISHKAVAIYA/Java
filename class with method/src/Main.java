class abc{
    int id;
    String name;
    float salary;
    void setData(int i,String n,float s){
        id=i;
        name=n;
        salary=s;
    }
    void getData(){
        System.out.println(id+" "+name+" "+salary);
    }
}
public class Main {
    public static void main(String[] args) {
        abc a1=new abc();
        abc a2=new abc();
        a1.setData(1,"Krishna",2000);
        a2.setData(2,"Shiv",3000);
        a1.getData();
        a2.getData();
    }
}