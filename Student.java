package workshops7;


public class Student {
private final String name;
private final int age;

public Student(String name, int age){
this.name = name;
this.age = age;
}
public String getName(){
return name;
}
public int getAge(){
return age;
}
public void displayStudent(){
System.out.println("Name: "+name);
System.out.println("Age: "+age);
}
}
