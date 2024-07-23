import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a operator from menu. a=Additon , b=multiplication , c=Subtration , d=Division , e=Modulo. ");
        String oper = sc.next();
        System.out.println("Give value of 'p' to add: ");
        float p = sc.nextFloat();
        System.out.println("Give value of 'q' to add: ");
        float q = sc.nextFloat();
        
        switch (oper) {
            case "a" : System.out.println("Result:" + (p+q));
                     break;
            case "b" : System.out.println("Result:" + (p*q));
                     break;
            case "c" : System.out.println("Result:" + (p-q));
                     break;
            case "d" : System.out.println("Result:" + (p/q));
                     break;
            case "e" : System.out.println("Result:" + (p%q));
                     break;
        }
    }
    
}
