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
public class staff extends employee
{
    String title;

    public staff(String title, String name, String address, String phoneNo, String emailAdress, String office, int salary, String dataHired) {
        super(name, address, phoneNo, emailAdress, office, salary, dataHired);
        this.title = title;
    }

    
    public String toString()
    {
        return  " staff " +name ;
    }
}
