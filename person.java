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
public class person
{
    String name;
    String address;
    String phoneNo;
    String emailAdress;

    public person(String name, String address, String phoneNo, String emailAdress) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.emailAdress = emailAdress;
    }
    
   
    public String toString()
    {
        return  " person " +name ;
    }
    
}
