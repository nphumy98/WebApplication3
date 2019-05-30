/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import javax.jws.WebMethod;
import javax.jws.WebService;



/**
 *
 * @author MY PHU NGUYEN
 */
@WebService
public class testBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @WebMethod
    public String sayHello(String name)
    {
        String sayHello= "Hello "+name;
        return sayHello;
    }
}
