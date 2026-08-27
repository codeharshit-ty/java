class calc{
    public static void main (String[] args){
        int a = 10;
        int b = 5;
        int sum = a+b;
        int diff = a-b;
        int mult = a*b;
        int div = a/b;
        String magic = "=============Magic=============";
        System.out.println("===========Method 1 ============");
        System.out.println("addition of a&b:"+sum);
        System.out.println("subtraction of a&b:"+diff);
        System.out.println("multiplication of a&b:"+mult);
        System.out.println("divison of a&b:"+div); 
        System.out.println("=======Method 2 =============");
        System.out.println("addition of a&b:"+(a+b));
        System.out.println("subtraction of a&b:"+(a-b));
        System.out.println("multiplication of a&b:"+(a*b));
        System.out.println("remainde:r"+(a%b)); 
        System.out.println(magic);
        System.out.println("addition"+(a+b)+"subtraction:"+(a-b)+"multiplication:"+(a*b)+"division"+(a/b));
    }
     
} 