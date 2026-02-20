import java.util.Scanner;
public class elseif{
    public static void main(String args[]){

        boolean kfc = true;
        boolean chicken = true;
        boolean pepsi = false;

        if(kfc){
            System.out.println("enter into kfc");

            if(chicken){
                System.out.println("eat chicken");

                if(pepsi){
                    System.out.println("drinking");
                }else{
                    System.out.println("not drinkinng");
                }
            }else{
                System.out.println("not eat");
            } 
        }else{
            System.out.println("not entered kfc");
        }
    }
}