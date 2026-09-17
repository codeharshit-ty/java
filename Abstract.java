Abstract class objects{
    abstract void showShape();
    public void Shape(){
        System.out.println("I'm form abstract class");
    }
}
class sphere extends objects {
    void showShape() {
        System.out.println("Object type is Sphere.");
    }
}
class Cuboid extends Objects {

    void showShape() {
        System.out.println("Object type is Cuboid.");
    }
}
class Prism extends Objects {

    void showShape() {
        System.out.println("Object type is Prism.");
    }
}
public class Abstract{
    public static void main(String args[]){
        Objects obj = new Sphere();
        obj.showShape();
        obj = new Cuboid();
        obj.showShape();
        obj = new Prism();
        obj.showShape();
        obj.Shape();
    }
}
