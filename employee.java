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
public class employee extends person
{
    String office ;
    int salary;
    String dataHired;

    public employee(String name, String address, String phoneNo, String emailAdress,String office ,int salary,String dataHired) {
        super(name, address, phoneNo, emailAdress);
        this.office=office;
        this.salary=salary;
        this.dataHired=dataHired;
    }

    
    public String toString()
    {
        return  " employee " +name ;
    }
}
