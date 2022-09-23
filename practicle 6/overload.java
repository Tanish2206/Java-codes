class overloademo{
    void test(){
        System.out.println("no parameter");


    }
    void test(int a){
        System.out.println("a:"+a);

    }
    void test(int a, int b){
        System.out.println("a: b:" +a +" " +b);
    }
    double test(double a){
        System.out.println("a:"+a);
        return a;
    }
    void test(String a, String b){
        String s;
        s=a+b;
        System.out.println("string is:"+s);
        
    }
}
class overload{
    public static void main(String[] args )
    {
     overloademo d=new overloademo();
     double result;
     d.test();
     d.test(10);
     d.test(10,20);
     result = d.test(123.2);
     System.out.println("result of double "+result);
     d.test("tanish","jain");
    } 
}

