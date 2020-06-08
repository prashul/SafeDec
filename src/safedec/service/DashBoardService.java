/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safedec.service;

import java.util.List;
import safedec.controls.ViewController;
import safedec.dao.AlarmDAO;
import safedec.dao.AlarmDAOImpl;
import safedec.dao.SensorDAO;
import safedec.dao.SensorDAOImpl;
import safedec.models.Alarm;
import safedec.models.MotionSensor;

/**
 *
 * @author Prashul Singh
 */
public class DashBoardService {
    public void getAllMotionSensors()
    {
       
    }
    
    public List< Alarm > getAllAlarmSensors()
    {
        AlarmDAO alarmDAO = new AlarmDAOImpl();
        List< Alarm > alarms = alarmDAO.getAllAlarms(ViewController.getInstance().getLoggedInUser());
        return alarms;
        
    }
    
    public List< MotionSensor > getAllSensors()
    {
        SensorDAO sensorDAO =  new SensorDAOImpl();
        List< MotionSensor > sensors = sensorDAO.getAllSensors(ViewController.getInstance().getLoggedInUser());
        return sensors;
    }
}
