import java.util.*;

public class lab_3 {

    static String details_arr[][] = new String[1024][5];
    static String names_arr[] = new String[1024];
    static int counter =  0;
    static int indexVal=0;

static void add_student(){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter follwing details of the student: ");
        System.out.println("Name: ");
        String name = scan.nextLine();
        System.out.println("Register number: ");
        String reg = scan.nextLine();
        System.out.println("Email: ");
        String mail = scan.nextLine();
        System.out.println("Class: ");
        String cls = scan.nextLine();
        System.out.println("Department: ");
        String dpt = scan.nextLine();
        
        int j=0;
            details_arr[counter][j]  = name;
            details_arr[counter][j+1]  = reg;
            details_arr[counter][j+2]  = mail;
            details_arr[counter][j+3]  = cls;
            details_arr[counter][j+4]  = dpt;
            
            
            
            names_arr[counter] = name;
            counter+=1;
          
             }
        
        
static void display_student(){
        
       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter the name you want details of :  ");
       String s_name = scan.nextLine();
       for(int i=0;i<names_arr.length;i++){
          if(names_arr[i].equalsIgnoreCase(s_name)){
               indexVal = i;
               System.out.println("Details of "+s_name+" : ");

                for(int y=0;y<5;y++){
                   System.out.println(details_arr[indexVal][y]);}
              break;
              
          } 
             else{
                System.out.println("Name not found !!!!!");
                break;
            }
}   
    

    
    }
    static void search_student(){
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter the name you want to search for :  ");
      String s_name = scan.nextLine();
      for(int i=0;i<names_arr.length;i++){
         if(names_arr[i].equalsIgnoreCase(s_name)){
              indexVal = i;
              System.out.println("Details of "+s_name+" : ");

               for(int y=0;y<5;y++){
                  System.out.println(details_arr[indexVal][y]);}
             break;
             
         } 
            else{
               System.out.println("Name not found !!!!!");
               break;
           }
}   

    }

    
    public static void main(String args[]){
        System.out.println("Welcome to the student portal\nPress 1: Add the details of the student\nPress 2: Display the details of the student\nPress 3: Search the details of the student\nPress 4: exit");

        Scanner scan = new Scanner(System.in);
        Boolean f = false;
  
        do{

            f = true;
            System.out.println("_____________________________________________________");
            System.out.println("Please Enter your choice: ");
            int choice = scan.nextInt();
            
       
        

        switch(choice){
            case 1:
            System.out.println("_________________________________________________________");
            add_student();
            break;
            case 2:
            System.out.println("_________________________________________________________");
            display_student();
            break;
            case 3:
            System.out.println("_________________________________________________________");
            search_student();
            break;
            case 4:
                System.out.println("Thanks for visiting !");
                f=false;
                break;
        

         }

       }while(f);
    }
}   

    

