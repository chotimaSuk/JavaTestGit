/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2;

/**
 *
 * @author ARIT
 */
import java.util.Scanner;
public class Stock {
  public static void main(String[] args) 
  {
      /*
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();     
      if((Integer.valueOf(input)) > (Integer.valueOf(args[0])))
      {
          System.out.println("In stock");
      }
      else
      {
          System.out.println("Out of Stock");
      }
      
      String Name[] = {"One","Two","Three","Four"};
      */
      
      /*
      String Item[] = new String[3];
      Item[0] =  "shrit1";
      Item[1] =  "shrit2";
      Item[2] =  "shrit3";
      System.out.println("Please choose Item");
      
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();   
              
     if( (Integer.valueOf(input)) > Item.length)
     {
         System.out.println("Out of lenght");
     }
     else
     {
       System.out.println(Item[(Integer.valueOf(input))-1]);
     }
     */
      
    String items [] = {"shirt","plant","polo"};
    System.out.println("Please choose Item");
    int i = 0;
    for(String item : items)
    {
       System.out.println(item);
    }
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();                 
    if( (Integer.valueOf(input)) > items.length)
    {
        System.out.println("Out of Bound");        
    }
    else
    {
       System.out.println("You choose" + items[i]);
    }
   

  }
}
