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
public class student extends person
{
    final String status1 = " freshman ";
    final String status2 = " sophomore ";
    final String status3 = " junior ";
    final String status4 = " senior ";

    public student(String name, String address, String phoneNo, String emailAdress) {
        super(name, address, phoneNo, emailAdress);
    }

   
    
    public String toString()
    {
        return  " student " +name ;
    }
}
