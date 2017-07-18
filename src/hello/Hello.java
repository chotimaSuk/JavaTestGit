/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author ARIT
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        //int input = Integer.valueOf(args[0]);
         //int input1 = Integer.valueOf(args[1]);
         //int input2 = Integer.valueOf(args[2]);
         //System.out.println(input * input1 * input2);  
        
        int ans = 1 ;
        for (int count = 0 ;count <= 2;count++)
        {
            ans = Integer.valueOf(args[count]);
            System.out.println(ans * ans);
        }
    }
    
}
