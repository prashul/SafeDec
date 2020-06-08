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
public class MapService {
     public List< Alarm > getAllAlarmsBySection(int sectionId)
    {
        AlarmDAO alarmDAO = new AlarmDAOImpl();
        List< Alarm > alarms = alarmDAO.getAllAlarmsBySectionId(ViewController.getInstance().getLoggedInUser(),sectionId);
        return alarms;
        
    }
    
    public List< MotionSensor > getAllSensorsBySection(int sectionId)
    {
        SensorDAO sensorDAO =  new SensorDAOImpl();
        List< MotionSensor > sensors = sensorDAO.getAllSensorsBySectionId(ViewController.getInstance().getLoggedInUser(), sectionId);
        return sensors;
    }

    
}
