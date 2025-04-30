package operatorsInIjava;

public class Test {

    public void relationalOperator(){

        int a=10;
        int b=20;

        System.out.println(a==b);

        System.out.println(a!=b);

        System.out.println(a>b);

        System.out.println(a<b);


        System.out.println(a<=b);

        System.out.println(a>=b);
    }

    public void logicalOperators(){

        int a=10;
        int b=20;
        int c=30;


        System.out.println(a>=b && a>=c); //false
        System.out.println(b>=a && b>=c); //false
        System.out.println(c>=a && c>=b); //true


        System.out.println(a>=b || a>=c); // false
        System.out.println(b>=a || b>=c); // true
        System.out.println(!(c>=a || c>=b)); // true , now it is false


    }

    public void assignmentOperator(){

        int a=20;
        int b=10;

        a+=10;
        System.out.println(a); //30


    }

    public static void main(String[] args) {
        Test obj=new Test();
//        obj.relationalOperator();
//        obj.logicalOperators();
        obj.assignmentOperator();
    }
}
