public class The_quadratic_equation{
    double a,b,c;
    public The_quadratic_equation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void calculate() throws no_answer{
        double x1,x2;
        if(this.a!=0) {
            if (Math.pow(this.b, 2) - (4 * this.a * this.c) < 0) {
                throw new no_answer("this equation has no answer");
            }
            x1 = -b + Math.pow(Math.pow(this.b, 2) - (4 * this.a * this.c), 1 / 2) / 2 * a;
            x2 = -b - Math.pow(Math.pow(this.b, 2) - (4 * this.a * this.c), 1 / 2) / (2 * a);
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);

        }
        else{
            System.out.println("this is not quadratic equation");
        }

}}
