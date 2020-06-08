/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package safedec.business;

import javax.swing.Icon;
import safedec.views.SensorIcon;


/**
 *
 * @author Prashul Singh
 */
public class SensorStateDown implements SensorState {

    @Override
    public void handleChange(SensorIcon sensor) {
        Icon down = sensor.getDownIcon();
        sensor.setIcon(down);
        sensor.getParent().setComponentZOrder(sensor, 0);
        sensor.getAlertClip().stop();
    //    ViewController.getInstance().updateSensorStatus(sensor.getSensorId(), SensorProtocol.SENSOR_STATUS_DOWN);
    }

    @Override
    public SensorState nextState() {
        return new SensorStateOff();
    }
    
}
