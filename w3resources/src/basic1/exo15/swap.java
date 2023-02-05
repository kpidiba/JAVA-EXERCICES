package basic1.exo15;


/*
 * Write a Java program to swap two variables.
 */
public class swap {

    //passage par valeur
    public static void swap_variable(int[] a ,int[] b){
        int[] c ={0};
        c[0] =a[0];
        a[0]=b[0];
        b[0]=c[0];
    }
    public static void main(String[] args) {
        int[]  a ={1};
        int[] b ={12};
        System.out.println("==========before swap=========");
        System.out.println("a: "+a[0]);
        System.out.println("b: "+b[0]);
        System.out.println("============== after swap =============");
        //swap variables
        swap_variable(a,b);
        System.out.println("a: "+a[0]);
        System.out.println("b: "+b[0]);
    }
}
