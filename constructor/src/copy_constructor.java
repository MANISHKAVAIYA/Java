class copy_constructor {
    int id;
    String name;

    copy_constructor(int i,String n){
        id=i;
        name=n;
    }
    copy_constructor(copy_constructor c){
        id=c.id;
        name=c.name;
    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        copy_constructor s1=new copy_constructor(1,"Krishna");
        copy_constructor s2=new copy_constructor(s1);
        s1.display();
        s2.display();
    }
}
