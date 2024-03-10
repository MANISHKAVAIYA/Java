class Student{
    int id;
    String name;
    int age;

    Student(int i,String n){
        id=i;
        name=n;
    }
    Student(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        Student stud=new Student(1,"Krishna");
        Student stud1=new Student(2,"Ram",22);
        stud.display();
        stud1.display();
    }
}