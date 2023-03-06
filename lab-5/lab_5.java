import java.util.*;
class lab_5{

    static String encrypt(String str){     // receiving string to encrypt
        String temp="";     // initialising a null string
        for(int i=0;i<str.length();i++){   // looping over string to get character at every place(index value)
            char ch=str.charAt(i);
            if(ch==' '){      // if char at index is null
                temp=temp+ch;         // it will be kept as it it

            }
            else{     // else it will get encrypted is following way
                int a=(int)ch;     // getting ascii value of character
                if(a<=67){        // if that is lesser than or equals to 67
                    a=(a-2)+25;      // we will subtract 2 from ascii value and than the whole will get subtracted from 25(the difference )
                }
                else {a=a-3;}    // if the character has ascii value greater than 67, simply we will subtract 3 from its ascii value
                temp=temp + (char)(a);        // and add the whole string (encrypted string) in temp string(null one)
            }

           
    }

    return temp;
    }

    static String decrypt(String s){      // receiving string value
        String temp="";
        for(int i=0;i<s.length();i++){ 
            char ch=s.charAt(i);
            if(ch==' '){     // if character is null , we will keep it as it is
                temp=temp+ch;

            }
            else{
                int a=(int)ch;         // else will perform opposite of the encrypt function
                if(a>=88){
                    a=a-23;
                }
                else {a=a+3;}
                temp=temp + (char)(a);
            }

           
    }

    return temp;}




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);                           // initialising scanner class object sc
        int choice;
        boolean flag=false;
        do{                                                          // this whole do block will execute till value of flag variable is true
            System.out.println("WELCOME TO OUR PORTAL!");
            System.out.println("1.To Encrypt a message");
            System.out.println("2.To Decrypt a message");
            System.out.println("_____________________________________________________________________");
            System.out.print("Please enter your choice: ");
            choice=Integer.parseInt(sc.nextLine());                         // taking input/choice of user
            System.out.println("\n-----------------------------------------------");
            if (choice==1){                 // if user selects 1 , this block will get executed(encryption)
                flag=true;
                System.out.println("Please enter a string to encrypt : ");
                String s=sc.nextLine();    // taking user input of a string
                String str= encrypt(s);    // sending it to encrypt function
                System.out.println(str);

            }
            else if(choice==2){       // if user wants to decrypt a string , selects 2
                    flag=true;
                    System.out.println("Please enter a string to decrypt : ");    // taking user input
                    String s=sc.nextLine();
                    String str= decrypt(s);   // sending that to decrypt function
                    System.out.println(str);
    
                }
            else flag=false;      // else the program will end


        
    }while(flag ==true);
}

}



