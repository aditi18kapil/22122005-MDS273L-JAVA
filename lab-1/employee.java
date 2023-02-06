import java.util.*;
public class employee{
    public static void main(String args[]){

        // TAKING EMPLOYEE DETAILS (USER INPUT)
        System.out.println("_______WELCOME TO EMPLOYEE's PORTAL________ ");
        System.out.println("###################(Please fill in the following details)####################################### ");
        System.out.println("                                            ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scan.nextLine();
        System.out.println("Age: ");
        int age = Integer.parseInt(scan.nextLine());
        System.out.println("Gender: ");
        char gender = scan.nextLine().charAt(0);
        System.out.println("State: ");
        String state = scan.nextLine();
        System.out.println("Name of company worked in: ");
        String work = scan.nextLine();
        System.out.println("Thanks for filling up your details.");
        System.out.println("___________________________________________________________________________");

        // DISPLAYING DETAILS BASED ON CERTAIN CONDITIONS
       System.out.println("Hi "+name+" ! "+"Please check your details below: ");
       System.out.println("                                                                  ");
        System.out.println("Employee's Name: "+name);
        System.out.println("Employee's Age: "+age);

        if(gender=='f'||gender=='F'){
            System.out.println("Employee's Gender: Female");
        }else{
            System.out.println("Employee's Gender: Male");
        }
                                // if user enters : f/F : female    else   m/M : male will get printed
        switch(state){
            case "Rajasthan":
            case "Uttar pradesh":
            case "Himachal pradesh":
            case "Uttarakhand":
            case "Punjab":
            case "Haryana":
            case "Jammu and kashmir":
            case "Delhi":
            case "Chandigarh":
               System.out.println("The Employee is from the northern states of India. Preferable work location is in "+state);            // if user will be from above mentioned states , this statement will get printed
               break;
            case "Maharashtra":
            case "Gujarat":
            case "Goa":
               System.out.println("The Employee is from the western states of India. Preferable work location is in "+state); 
               // if user will be from above mentioned states , this statement will get printed
               break;
            case "Andhra pradesh":
            case "Karnataka":
            case "Tamil nadu":
            case "Telangana":
            case "Kerela":
               System.out.println("The Employee is from the southern states of India. Preferable work location is in "+state); 
               // if user will be from above mentioned states , this statement will get printed
               break;
            case "Odisha":
            case "Bihar":
            case "West bengal":
            case "Arunachal pradesh":
            case "Assam":
            case "Meghalaya":
            case "Manipur":
            case "Mizoram":
            case "Nagaland":
            case "Tripura":
            case "Sikkim":
               System.out.println("The Employee is from the eastern states of India. Preferable work location is in "+state); 
               // if user will be from above mentioned states , this statement will get printed
               break;
            case "Madhya pradesh":
            case "Chattisgarh":
               System.out.println("The Employee is from the central states of India. Preferable work location is in "+state); 
               // if user will be from above mentioned states , this statement will get printed
               break;
            default:
            System.out.println("The Employee is from the Union Territories of India. Preferable work location is in "+state);
            // if user will be from above mentioned states , this statement will get printed
            break;
        }

        if(work.equalsIgnoreCase("Facebook")|| work.equalsIgnoreCase("Google")|| work.equalsIgnoreCase("Samsung")|| work.equalsIgnoreCase("IBM")|| work.equalsIgnoreCase("apple")|| work.equalsIgnoreCase("microsoft")){
            System.out.println("Company worked in: The employee is working in Top MNC Companies("+work+")");
        }else{
            System.out.println("Company worked in:"+work);
        }
                       // here we are just checking if user has worked in mentioned top MNC's or not , if yes the statement will get printed or else nothing

        
        System.out.println("##### THANKS FOR VISITING THE PORTAL ######");
        scan.close();

    }
}