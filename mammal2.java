class Animal{
    void eat(){
        System.out.println("eating...Animal class....roar method");
    }
}
class lion extends Animal{
    void roar(){
        System.out.println("roar....lion class....roar method");
    }
}
class babylion extends lion{
    void weep(){
        System.out.println("weeping....babylion class...weep method");
    }
}
class mammal2{
    public static void main(String[] args) {
    babylion obj = new  babylion();
    obj.weep();
    obj.roar();
    obj.eat();
    }
}
