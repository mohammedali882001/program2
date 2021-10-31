/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program2;

/**
 *
 * @author messi
 */
public class Program2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        person p=new person(" mohammed " , " malawy " , " 010000000 " , " m88@gmail.com ");
        System.out.println(p.toString());
        
        
        student s=new student(" ali " , " malawy " , " 0111111 " , " o88@gmail.com ");
         System.out.println(s.toString());
         
         employee e = new employee(" ashraf " , " malawy " , " 0155555 " , " a88@gmail.com " , " h " , 3500 , " 8/8/1990 ");
         System.out.println(e.toString());
         
         faculty f=new faculty(12 , " fff " , " ahmed " , " malawy " , " 017777 " , " l88@gmail.com " , "ggg " , 2540,"12/5/1990");
         System.out.println(f.toString());
         
         staff ss = new staff("egypt " , " ragab " , " malawy " , " 018888 " , " mk8@gmail.com " , "ese " , 5550,"12/5/200");
         System.out.println(ss.toString());
       
    }
    
}
