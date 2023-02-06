import java.util.*;

public class lab2 {
    public static void main(String args[]){
        System.out.println("How can we help you! ");
        System.out.println("1. Register a name ");
        System.out.println("2. Search for a name ");
        System.out.println("3. Remove a name ");
        System.out.println("--------------------------------------------------------------------");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Kindly enter your choice: ");
        System.out.println("--------------------------------------------------------------------");
        int choice = scan.nextInt();
        String names_arr[] = new String[1024];

//------------------------------------------------------------------------------------------------------
        switch(choice){
            case 1:
            System.out.println("How many names you wanna enter: ");
            int times = scan.nextInt();
            int i = 0;
            do{
              System.out.println("Enter name:");
              String new_name = scan.next();
              names_arr[i] = new_name;
              i++;
            }while(i<times);
             System.out.println("you wanna go ahead(type 1/2)");
             int check = scan.nextInt();
             if(check==2){
                break;}
//--------------------------------------------------------------------------------------------------
            case 2:
            System.out.println("Enter the name you want to search for: ");
            String find_name = scan.next();
            for(int j=0;j<names_arr.length;j++){
                if(names_arr[j].equalsIgnoreCase(find_name)){
                    System.out.println("This name is present "+"at index number: "+j);
                    System.out.println("you wanna go ahead(type 1/2)");
                    int check2 = scan.nextInt();
                    if(check2==2){
                     break;}
                }else{
                       System.out.println("This name is not present! ");
                }
                
                }
            
             
//----------------------------------------------------------------------------------------------------             
            case 3:
            System.out.println("Enter the name you wanna remove" );
            String remove_name = scan.next();
           // System.out.println(remove_name);

            for(int r=0;r<names_arr.length;r++){
                if(names_arr[r].equalsIgnoreCase(remove_name)){
                    int indexVal = r;
                    //System.out.println(indexVal);
                    for (int k = indexVal; k < names_arr.length - 1; k++) {
                        names_arr[k] = names_arr[k + 1];
                    }
                    break;
                }else{
                    System.out.println("This name is not present.");
                    break;
                }
            }

            
//------------------------------------------------------------------------------------------------------

             default:
             System.out.println("Oops! Wrong input :(");

        }

        scan.close();

    }
}
