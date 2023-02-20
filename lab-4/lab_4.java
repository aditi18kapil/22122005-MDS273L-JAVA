import java.util.*;


public class lab_4 {
    
     static String acc_holder_name;
     static double acc_bal;
     static long acc_num;

     static void deposit_money(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit : ");
        double dep_amount = Double.parseDouble(scan.nextLine());
        acc_bal = acc_bal + dep_amount;
        System.out.println("Thankyou for depositing money...");
     }


     static int withdraw_money(int counter){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount you wanna withdraw: ");
        double with_amount = Double.parseDouble(scan.nextLine());
        if(with_amount <= acc_bal){
            counter+=1;
            acc_bal = acc_bal - with_amount;
            System.out.println("Money Withdrawl successfully done....");
        }else{
            System.out.println("Insufficient Balance....");
        }
        return counter;
    }


     static void print_trans(int i,int j){
            System.out.println("Number of times money has been deposited : "+ i);
            System.out.println("Number of times money has been withdrawl : "+ j);
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
        int i=0;
        int j=0;
        int c=0;
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
            deposit_money();
             i+=1;
           }else if(choice == 2){
            f=true;
            j=withdraw_money(c);
           }else if(choice == 3){
            f=true;
             print_trans(i,j);
           }else if(choice == 4 ){
            f=true;
            print_summary();
           }else{
            f=false;
            System.out.println("Wrong input ! LOGGING OUT............ ");
           }
        }while(f);


        scan.close();
     }
}
