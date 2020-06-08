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
public class SensorStateOn implements SensorState {

    @Override
    public void handleChange(SensorIcon sensor) {
        Icon on = sensor.getOnIcon();
        sensor.setIcon(on);
        sensor.getParent().setComponentZOrder(sensor, 0);
        sensor.getAlertClip().stop();
//        ViewController.getInstance().updateSensorStatus(sensor.getSensorId(), SensorProtocol.SENSOR_STATUS_ON);
    }

    @Override
    public SensorState nextState() {
        return new SensorStateHot();
    }
}
