public class simpleinterest {
    static double calculate(double p,double r,float t)
    {
        double simpleinterest=(p*r*t)/100;
        return simpleinterest;
    }
    public static void main(String[] args) {
        System.out.println("simple interest is "+calculate(5000,10,3));
    }
    
}
