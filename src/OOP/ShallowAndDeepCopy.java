package OOP;

public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        Student s1 = new Student("Akshay",20);
        s1.Pssword="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=200;
        Student s2 = new Student(s1);
        s2.Pssword="xyz";
        s1.marks[1]=100; //change is made in s1 object after copying into s2
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.Pssword);
        for(int i=0;i<s2.marks.length;i++){
            System.out.print(s2.marks[i]+" ");
        }
    }
}

class Student {
    String name;
    int age;
    String Pssword;
    int marks[];

    // parameterized constructor
    Student(String name,int age) {
        this.marks=new int[3];
        this.name = name;
        this.age = age;
    }

    // Shallow Copy Constructor

//    Student(Student s1) {
//        this.marks= s1.marks;
//        this.name = s1.name;
//        this.age = s1.age;
//    }

    // Deep Copy Constructor

    Student(Student s1){
        this.marks=new int[3]; // new array is created here
        this.name= s1.name;
        this.age= s1.age;
        for(int i=0;i< marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
}

