    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safedec.dao;

import java.util.List;
import safedec.models.Customer;
import safedec.models.Section;

/**
 *
 * @author Prashul Singh
 */
public interface CustomerDAO {
    boolean insertCustomer(Customer customer);
    void removeCustomer(Customer customer);
    Customer findCustomerByEmailId( String emailAddress);

    /**
     *
     * @param customer
     * @return
     */
    boolean updateCustomer( Customer customer);
    
    List< Section > getAllSections( Customer customer );
   
}
