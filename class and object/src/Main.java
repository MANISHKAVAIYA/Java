import java.util.*;
class a{
    int id;
    String name;
}
class b{
    public static void main(String[] args) {

        a date=new a();
        a date2=new a();
        date.id=1;
        date.name="Krishna";
        date2.id=2;
        date2.name="Ram";
        System.out.println(date.id+" "+date.name);
        System.out.println(date2.id+" "+date2.name);
    }
}