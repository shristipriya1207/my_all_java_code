class addition <T extends Number>
{
    T num1;
    T num2;
    public addition(T ob, T ob1){
        num1=ob;
        num2=ob1;

    }

    public T addy(){
        if(num1 instanceof Integer){
            return (T)(Integer)(num1.intValue()+num2.intValue());

        }
        else if(num1 instanceof Double){
            return (T)(Double)(num1.doubleValue()+num2.doubleValue());
        }
        else{
            return null;
        }
    }
}
class add{
public static void main(String args[]){
addition<Integer> add1 = new addition<Integer>(23,45);
addition<Double> add2 = new addition<Double>(23.9,45.0);
int a = add1.addy();
double d = add2.addy();
System.out.println("integer sum :"+ a);
System.out.println("double sum :"+ d);


}
}