# LAB-3

# QUESTION:
Create a java program, that stores the details of a student (Name, Register Number, Email, Class, Department).
You can use a two-dimensional array to store the details.
HINT: String arr[] = {{"Alwin","1847207","alwin@christ.in","MCA","Computer Science"},{"Balagangadhar","2011204","bala@christ.in","MDS","Data Science"}}

You need to have functions to:
Collect the details of the student
Display the details of the student
Search the details of the student
With the help of a menu-driven main function, you need to access these functions inside your class and perform the operations.

Whenever you are entering the details of a student, you need to enter the value into a static global string array, that stores the names that the user has entered. Searching this array will help you to find if the details of the student are already entered into the program.

You will have a function to perform this search operation, which can be used to implement two functionality in the code
To check if the name is already entered
While searching for a name, you can identify the index of the two-dimensional array to print the details directly.
In the end, you will have
Four functions inside your lab program class including your main class
One static String array storing the names (note the program can store up to 1024 students)
One two-dimensional string array storing the details of up to 1024 students
A menu-driven main method implementing the functions and functionality
Plan your program with a flow chart before starting with coding.
Since you are using functions, plan what should be the returning values and how to implement them.

# OUTPUT:
PS C:\Users\Aditi\OneDrive\Desktop\sem2\Java> javac  lab_3.java
PS C:\Users\Aditi\OneDrive\Desktop\sem2\Java> java lab_3       
Welcome to the student portal
Press 1: Add the details of the student
Press 2: Display the details of the student
Press 3: Search the details of the student
Press 4: exit
_____________________________________________________
Please Enter your choice: 
1
_________________________________________________________
Please enter follwing details of the student: 
Name: 
aditi
Register number: 
22122005
Email: 
aditik@gmail.com
Class: 
2msc-a
Department: 
ds
_____________________________________________________
Please Enter your choice: 
2
_________________________________________________________
Please enter the name you want details of :  
aditi
Details of aditi : 
aditi
22122005
aditik@gmail.com
2msc-a
ds
_____________________________________________________
Please Enter your choice: 
3
_________________________________________________________
Please enter the name you want to search for :
seema
Name not found !!!!!
_____________________________________________________
Please Enter your choice:
4
Thanks for visiting !
PS C:\Users\Aditi\OneDrive\Desktop\sem2\Java> 






# FLOWCHART

![lab-3 flowchart](url "https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1&title=flow_lab-3_fnl.png#R7VxZd6M2FP41fswcISHAj9nbmWlPeqZtOk85spFtGoxckJO4v35YxCbhNbaUMLEfYl2EAH33u5tEBuhy%2FnIbk8XsN%2BbTcACB%2FzJAVwMIoWW56Z9MsioklmvDQjKNA1%2FIasG34H8qhEBIl4FPk1ZHzljIg0VbOGZRRMe8JSNxzJ7b3SYsbF91QaZUEXwbk1CV3gc%2BnxVSD7q1%2FBcaTGfllS1nWBwZkfHjNGbLSFxvANFN%2FikOz0k5lnjQZEZ89twQoesBuowZ48Wv%2BcslDbPJLaft%2FtfVffj10bn9%2FEfyH%2Fnr4sufv%2F99Vgx2s88p1RPGNOIHD%2F356Ty8u7t7fhijx7vRw8OX8Hx1Vj4aX5XTSf10dkWTxXzGpiwi4XUtvcinjGajgrRV9%2FnK2CIVWqnwX8r5SqgKWXKWimZ8HoqjOz6OeOyELeMx3dAPFf2yG29ohJiEW8rmlMertENMQ8KDp7baEKF906pfdeodC9L7g0BQxRNzVfLEAe0ROImnlIuTahzSH427qEU5OnsgZX0gtStSLjQLlW0CKvoS8H8av783fl%2B9iHHzxko09gP31KDZtnsQaFsHkscptPRk4GOT4IN3Cj5CVht87B0GvjyQPM7xwN9k4J5IuBRTcR1xGmfRz4wFqW2UdaNGPoPreRZw%2Bm1BciP6nMZrbZQnLOJCBax0Ji%2BmIUkSgWfCY%2FZYBUBZ7ypcyQ5PgjC8ZCGL88siH1PPt6vTGkc8OEKOs7eCPNGY05eNKlIh1DbOpa1%2BrmM3q5TNGnGbDdYrVQvGvR0rMsrYT%2FhEnG16484Hd4zETcjS64wdhZID6JB5Rq1olGR%2FSmqC7HDWA3TEWmGY5jN0B462iUatlGpuF9GGjovIKYm2LgjaRjTvVERD7yzZ6HwIEVsUSrvpYXV5TmiWXq5CL5VOsBd0ct4an8o4t195xlYGenqIhUu1NUQsbwdidUQu749YNnhrxLL64KiGemgi11rQUC9NhjvQpKMe8%2F5o4rw5%2F2NZytxfp3Zfmew2M%2FabcAIBgFjkvg35JP90AeHcgPSjEYhK47cBIReijgYEfAf2SnOWactav2sBybMkcKU7OXH1EBqJ6faDcmvuAzWFaBaWQAcHgm5BCXWsGfWhCdRTsONVowaVNb%2BXAXzWqMP5vHWieB4iVa00rh6dxzFZNTosMpCT9Up3JlkabIGNulX2X1uxHgJJpYo7Oq6CqYVp4vvZU%2Bfn8lkWL%2FmUkyBMsjaTa2SDfK2erNTK2Gu8O0VjL%2FfVkncHQPhwxbtfgCE%2BqXeHa%2FyIOeeuJoIFdBGZU4FVgY1aZukZNpa9xt4bAwd1lLbemrveaoDRrn4daVq%2Fl2uaNtKbUyI1sSHJ4yDbmxRX1rJJPz9IFmHuRWobyiaqahyYdQKAAZ3skwQBYF1dXGqshkLXdDaKjOy6ODYVNTHMlhiG5dXVUzPMSMD7TsGSc1tHtzlUg0c10pix%2BWiZ7G3aJjj7ZnsZYuIHtGXeRvm3s8aTf05p3uRF644aj6fVuqnL2MGk9kJB5nEWMU1opNbf0mfmbRDaExqxiErICBEJg2mUNsc038WCLrIZDMYkPBcH5oHvh%2BscWpuvp4IKOduDQqcDKplEx1uWM7JTs5HMuyazedSxQG5yL6ht2S31cHf0dPuWBeTrDOHmtN%2BTPPCu%2FdfueoQaygi20we37RrSPKzZbatbMzrylH5XDBBuY1DFueYqBmo5R3HkEeMd9bef073LiaY9xIbdO9hAqwE6r7HMYQST%2FAWjnvNMLptWKYoxntlYgUn1XZF%2Fnr2AVjOiMemvUe%2BtrqUxLbhjVkrZa%2Bto5Zt8JSp4%2BAm3B1mzsNXhzKShdL9S04eCga1r65q0Loo1b12zO5YsGvXTRuVUcXIJJfF4pmLdn8qpLS1iVPsKjVVOcR%2Bieoz1cMuR4HN23GhytNfL%2BmAIdYGFpbDE1bw5Ee8QhPSsclr5msr3QMW8aa2cYjUN%2FqicFtAMJag6XsXTmlo5Rt7EO7Zt0xTkydtQywKiNtumBnk%2FXXkJyytzxncLOWp14qO8tCkal2ygY9wGqntPPspLtrMmjjPHM7g9sut7eUm2fp51cHlJzqo8zc7MsRU4OXnMLWa0WPINHq1HlQkpcj9lYSJt1v83qwCx%2Fu9k6PoH")
