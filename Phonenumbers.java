import java.util.*;
class PhoneNumbers {
    public static void main(String[] args)
   {
   String contact[];    //declaring array
   contact = new String[30]; // allocating memory to array
   String contact_name[];    //declaring array
   contact_name = new String[30]; // allocating memory to array
   Scanner sc = new Scanner(System.in); //declare scanner class
   int counter=10,i,flag=0;
   contact[0]="Gina";//initilize values
   contact_name[0]="(847) 341-0912";//initilize values
   contact[1]="Marcia";//initilize values
   contact_name[1]="(847) 341-2392";//initilize values
   contact[2]="Rita";//initilize values
   contact_name[2]="(847) 354-0654";//initilize values
   contact[3]="Jennifer";//initilize values
   contact_name[3]="(414) 234-0912";//initilize values
   contact[4]="Fred";//initilize values
   contact_name[4]="(414) 435-6567";//initilize values
   contact[5]="Neil";//initilize values
   contact_name[5]="(608) 123-0904";//initilize values
   contact[6]="Judy";//initilize values
   contact_name[6]="(608) 435-0434";//initilize values
   contact[7]="Arlene";//initilize values
   contact_name[7]="(847) 341-0912";//initilize values
   contact[9]="LaWanda";//initilize values
   contact_name[9]="(920) 787-9813";//initilize values
   contact[8]="Deepak";//initilize values
   contact_name[8]="(930) 412-0991";//initilize values
   System.out.print("Please enter the name you want to find ::");//user input msg
   String find_name = sc.nextLine();
        while(counter<31 && find_name.equals("quit")!=true)
   {
   flag=0;
   //System.out.print("Please enter the name you want to find ::");//user input msg
   //find_name = sc.nextLine();//scanner class user input
  

   for(i=0;i<counter;i++)
   {
   if(find_name.equals(contact[i])==true)
   {
   flag=1;
   System.out.println("Phone number is "+contact_name[i]);
   }
   }
   if(flag==0)
   {
   System.out.print("Please enter the Phone Number::");//user input msg
   String phone_num = sc.nextLine();//scanner class user input
   counter++;
   contact[counter]=find_name;
   contact_name[counter]=phone_num;
   }
   System.out.print("Please enter the name you want to find ::");//user input msg
   find_name = sc.nextLine();//scanner class user input

}
  // System.out.println("Name Phone #");
  //  for(i=0;i<=counter;i++)
  // {
  // System.out.println(contact[i]+" "+contact_name[i]);
  // }

   }}
