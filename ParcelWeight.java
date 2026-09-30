import java.util.Scanner;
public class ParcelWeight{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter parcel weight:");
            double weight = Double.parseDouble(sc.nextLine());
            if(weight <0)
        System.out.println("Enter positive number: " );
    else if(weight > 50){
        System.out.println("Insufficent weight");
    }else{
        System.out.println("Weight: "+ weight+"kg");
    }
        }
        catch(NumberFormatException e){
            System.out.println("Invalid weight :" + "Please enter a number");
        }
        finally{
            System.out.println("Weight checking is completed ");

        }
        }
    }
    
