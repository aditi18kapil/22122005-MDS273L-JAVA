import java.util.*;


public class lab_4 {
    
     static String acc_holder_name;
     static double acc_bal;
     static long acc_num;

     static int deposit_money(double arr1[],String arr2[],int i){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit : ");
        double dep_amount = Double.parseDouble(scan.nextLine());
        arr1[i] = dep_amount;
        arr2[i] = "deposit";
        acc_bal = acc_bal + dep_amount;
        System.out.println("Thankyou for depositing money...");
        i+=1;
        return i;
     }


     static int withdraw_money(double arr1[],String arr2[],int i){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount you wanna withdraw: ");
        double with_amount = Double.parseDouble(scan.nextLine());
        if(with_amount <= acc_bal){
            arr1[i] = with_amount;
            arr2[i] = "withdraw";
            acc_bal = acc_bal - with_amount;
            i+=1;
           
            System.out.println("Money Withdrawl successfully done....");
        }else{
            System.out.println("Insufficient Balance....");
        }
      return i;    
    }



     static void print_trans(double arr1[],String arr2[],int i){
      for(int y=0;y<i;y++){
        System.out.println(arr1[y]+": "+arr2[y]);
        
        
      }
            
     }


     static void print_summary(){
            System.out.println("ACCOUNT DETAILS:");
            System.out.println("Account holder name: "+ acc_holder_name);
            System.out.println("Account number: "+ acc_num);
            System.out.println("Account Balance: "+acc_bal );
     }

    


     static void customer_create (){
       Scanner scan = new Scanner(System.in);
       System.out.println("Full name : ");
       acc_holder_name = scan.nextLine();
       System.out.println("Account number : ");
       acc_num =scan.nextInt();

       
       // menu

       System.out.println(" THANKYOU FOR REGISTERING . ");
       System.out.println(" ----------------------------------CUSTOMER PORTAL---------------------------- : ");

       
      
       
       
    }
     public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
       double arr1[] = new double[3095];
       String arr2[] = new String[3095];
       int i=0;
      
        boolean f=false;
        System.out.println("WELCOME TO ONLINE HDFC PORTAL ! ");
        System.out.println("_______________________REGISTER YOURSELF NOW______________________________- ");
        customer_create();


        do{
            
        System.out.println(" 1. Deposit money\n 2.Withdraw money \n 3.Print Transactions \n 4.Print account summary");

        System.out.println("Enter your choice: ");

        int choice = scan.nextInt();
        


        if(choice == 1){
            f=true;
            i = deposit_money(arr1,arr2,i);
             System.out.println("_______________________________________________________________________________________________");
           }else if(choice == 2){
            f=true;
            i = withdraw_money(arr1,arr2,i);
            System.out.println("_______________________________________________________________________________________________");
           }else if(choice == 3){
            f=true;
             print_trans(arr1,arr2,i);
             System.out.println("_______________________________________________________________________________________________");
           }else if(choice == 4 ){
            f=true;
            print_summary();
            System.out.println("_______________________________________________________________________________________________");
           }else{
            f=false;
            System.out.println("_______________________________________________________________________________________________");
            System.out.println("Wrong input ! LOGGING OUT............ ");
           }
        }while(f);


        scan.close();
     }
}
