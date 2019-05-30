/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import BeanPackage.Customer;
import BeanPackage.CustomerBean;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author MY PHU NGUYEN
 */
@WebService(serviceName = "CustomerWebService")
@Stateless()
public class CustomerWebService {
    @EJB
    private CustomerBean ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createCustomer")
    public Customer createCustomer(@WebParam(name = "name") String name) {
        return ejbRef.createCustomer(name);
    }

    @WebMethod(operationName = "addCustomer")
    public int addCustomer(@WebParam(name = "aCustomer") Customer aCustomer) {
        return ejbRef.addCustomer(aCustomer);
    }

    @WebMethod(operationName = "plusCustomer")
    public int plusCustomer(@WebParam(name = "name") String name) {
        return ejbRef.plusCustomer(name);
    }
    
    @WebMethod(operationName = "getCustomerList")
    public ArrayList<Customer> getCustomerList() {
        return ejbRef.getCustomerList();
    }
    
}
