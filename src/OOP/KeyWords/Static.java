package OOP.KeyWords;

public class Static {
    public static void main(String[] args) {
        School s1=new School();
        s1.SchoolName="XYZ";

        School s2=new School();
        System.out.println(s2.SchoolName);

        School s3=new School();
        s3.SchoolName="ABC";
        System.out.println(s3.SchoolName);

        System.out.print(s2.SchoolName); // Changed
    }
}

class School{
    String name;
    static String SchoolName;
}
