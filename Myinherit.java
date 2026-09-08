class parent {

    int age,id;
    String name;
    void naming(String name)
    {
        System.out.println("Name:"+name);
    }
}
class Child extends parent
{
    void ageN(int age)
    {
        System.out.println("age of the student is:"+age);
    }
}
class Myinherit
{
    public static void main(String[]er)
    {
        Child s  =new Child();
        s.naming("Aashish");
        s.ageN(14);
    }
}