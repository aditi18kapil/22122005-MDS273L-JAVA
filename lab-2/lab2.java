import java.util.Scanner;

class lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = new String[1024];
        Boolean f = false;
        int i = 0;
        do {

            f = true;
            System.out.println("Welcome ! You have the following choices to choose from :  ");
            System.out.println(" 1. Enter the name:    ");
            System.out.println(" 2. Search for a name: ");
            System.out.println(" 3. Remove a name:    ");
            System.out.println(" 4. Print the name list ");
            System.out.println(" 5. Quit ");
            System.out.println("_____________________________________________________________________");
            System.out.println("PLease Enter your choice: ");
            int input = Integer.parseInt(scan.nextLine());
//------------------------------------------------------------------------------------------------
            switch (input) {
                case 1: {
                    int j;
                    System.out.print(" Please Enter your name: ");
                    String temp=scan.nextLine();
                    for ( j=0; j < names.length; j++) {
                        if (temp.equals(names[j])){
                            System.out.println("This name already exists. ");
                            break;

                        }
                        else{
                            names[i] = temp;
                            i++;
                            break;
                        }
                        
                    }
                    
                    
                    break;

                }

                //-----------------------------------------------------------------------------------
                case 2:{
                    int j;
                    System.out.println("Which name your are searching?.");
                    String sch = scan.nextLine();
                    for ( j=0; j < names.length; j++) {
                        if (sch.equals(names[j])){
                            System.out.println("Name is found at position "+(j+1));
                            break;

                        }
                        
                    }
                    break;
                }

//-------------------------------------------------------------------------------------------------                
                case 3:{
                    int j;
                    System.out.println("Which name you want to delete. :");
                    String ntemp = scan.nextLine();
                    for ( j=0; j < names.length; j++) {
                        if (ntemp.equals(names[j])){
                            for (; j < names.length-1; j++) {
                                names[j]=names[j+1];
                                
                            }

                        }
                        
                    }
                    break;


                }
                //---------------------------------------------------------------------------
                case 4:{
                    System.out.println("Your list are: ");
                    for (String a:names){
                        if(a!=null){
                            System.out.print(a+",");
                        }
                       
                    }
                    System.out.println();
                    break;
                }

                //--------------------------------------------------------------------------------
                case 5:{

                    System.out.println("Program will now wxit in 3.2.1..");
                    f=false;
                    break;
                }


            }

        } while (f);
scan.close();
}
}
