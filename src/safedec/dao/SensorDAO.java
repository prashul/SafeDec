/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safedec.dao;

import java.util.List;
import safedec.models.Customer;
import safedec.models.MotionSensor;

/**
 *
 * @author Prashul Singh
 */
public interface SensorDAO {
    public boolean create( Customer customer, MotionSensor sensor );
    public boolean destroy(MotionSensor sensor );
    public boolean edit( Customer customer, MotionSensor sensor );
    public List< MotionSensor > getAllSensors( Customer customer);
    public List<MotionSensor> getAllSensorsBySectionId(Customer customer, int sectionId);
}
