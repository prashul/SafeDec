package safedec.test.dao;

import java.util.List;
import static org.junit.Assert.assertEquals;
import safedec.controls.ViewController;
import safedec.dao.CustomerDAO;
import safedec.dao.CustomerDAOImpl;
import safedec.models.Customer;
import safedec.models.Section;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prashul Singh
 */
public class CustomerDAOTest {
       public boolean insertCustomer(Customer customer) {
     //TODO
     return false;
    }

  
    public void removeCustomer(Customer customer) {
     // TODO 
     
    }

    
    
    /**
     * @param emailAddress
     * @return
     */
   
    public Customer findCustomerByEmailId(String emailAddress) {
        return ViewController.getInstance().getLoggedInUser();
    }

    public boolean updateCustomer(Customer customer ) {
    boolean flag = false;
    return flag;
    }

   public void getAllSections() {
       CustomerDAO customerDAO = new CustomerDAOImpl();
       Customer customer = new Customer();
       customer.setCustomerId(1);
        List<Section> allSections = customerDAO.getAllSections(customer);
        assertEquals(2,allSections.size() );
        
        System.out.println("safedec.test.dao.CustomerDAOTest.getAllSections" + customer.getCustomerId() + " sections size " + allSections.size());
       
    }

}
