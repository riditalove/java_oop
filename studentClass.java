class Student
{
    String name;
    int rollNo;
}

public class studentClass {
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.name="Ridita";
        s1.rollNo = 25;

        Student s2 = new Student();
        s2.name="Rodela";
        s2.rollNo = 17;

        Student s3 = new Student();
        s3.name="Fabiha";
        s3.rollNo = 170;

        Student [] studentList = new Student[3];
        studentList[0] = s1;
        studentList[1] = s2;
        studentList[2] = s3;

        for(int i=0;i<3;i++)
        {
            System.out.println(studentList[i].name + ": "+studentList[i].rollNo);
        }

        for(Student s : studentList)
        {
            System.out.println(s.name + " : "+s.rollNo);
        }



    }
}