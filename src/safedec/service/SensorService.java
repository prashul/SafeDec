/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safedec.service;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.View;
import safedec.controls.ViewController;
import safedec.dao.AlarmDAO;
import safedec.dao.AlarmDAOImpl;
import safedec.dao.SensorDAO;
import safedec.dao.SensorDAOImpl;
import safedec.models.Alarm;
import safedec.models.Customer;
import safedec.models.Location;
import safedec.models.MotionSensor;
import safedec.models.Sensor;

/**
 *
 * @author Prashul Singh
 */
public class SensorService {
    public boolean updateSensorPosition( Sensor sensor, int x, int y )
    {
        Customer customer = ViewController.getInstance().getLoggedInUser();
        Location loc = new Location( x,y);
        sensor.setLoc(loc);
        System.out.println("safedec.service.SensorService.updateSensorPosition()" + sensor.getClass());
        if( sensor instanceof Alarm )
        {
            AlarmDAO alarmDAO = new AlarmDAOImpl();
            return alarmDAO.edit( customer, (Alarm) sensor );
        }
    SensorDAO sensorDAO = new SensorDAOImpl();
    return sensorDAO.edit( customer, (MotionSensor) sensor );
    }
}
