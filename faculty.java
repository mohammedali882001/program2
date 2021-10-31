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
public class faculty extends employee
{
    int officeHours;
    String rank;

    public faculty(int officeHours, String rank, String name, String address, String phoneNo, String emailAdress, String office, int salary, String dataHired) {
        super(name, address, phoneNo, emailAdress, office, salary, dataHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    
    public String toString()
    {
        return  " faculty " +name ;
    }
}
