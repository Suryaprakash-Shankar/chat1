//public class surya{
//    public String Name = "Surya";
//    public String Age = "20";
//
//    public void details() {
//        System.out.println("Name :" + Name);
//        System.out.println("Age :" + Age);
//    }
//    public static void main(String args[]){
//
//        surya s = new surya();
//        s.details();
//
//
//    }
//
//}

public class surya{
    public String name;
    public int age;
public  surya(String name,int age){
    this.name = name;
    this.age = age;
}

public void display(){
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
}

public static void main(String args[]){
    surya s1 = new surya("surya",20);
    s1.display();
}
}