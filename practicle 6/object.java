class Test{
    int a,b;
    Test(int i,int j){
       a=i;
       b=j;

    }
    boolean equal(Test o){
        if(o.a==this.a&&o.b==this.b){
            return true;
        }
        else {
            return false;
        }
    }

}
public class object{
    public static void main(String[] args){
        Test obj1=new Test(100,20);
        Test obj2=new Test(100,20);
        Test obj3=new Test(-1,-1);

        System.out.println("obj1==obj2:"+obj1.equal(obj2));
        System.out.println("obj1==obj3:"+obj1.equal(obj3));
    }
}
