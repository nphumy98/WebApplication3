/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanPackage;

import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author MY PHU NGUYEN
 */
@Stateless
public class CustomerBean {
    private ArrayList<Customer> customerList;
    
    public CustomerBean()
    {
        customerList= new ArrayList<Customer>();
    }
    
    public CustomerBean(ArrayList<Customer> customerList)
    {
        this.customerList=customerList;
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public Customer createCustomer(String name)
    {
        Customer aCustomer= new Customer(name);
        return aCustomer;
    }
    
    public int addCustomer(Customer aCustomer)
    {
        customerList.add(aCustomer);
        return customerList.size();
    }
    
    public int plusCustomer(String name)
    {
        Customer aCustomer= new Customer(name);
        customerList.add(aCustomer);
        return customerList.size();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    
}
