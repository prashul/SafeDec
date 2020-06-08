/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safedec.views;

import java.awt.Insets;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import safedec.business.FlyweightSensorIconFactory;
import safedec.models.Alarm;
import safedec.models.MotionSensor;
import safedec.models.Sensor;
import safedec.service.MapService;

/**
 *
 * @author Prashul Singh
 */
public class MapView extends javax.swing.JPanel {

    /**
     * Creates new form MapView
     */
    public MapView() {
        initComponents();
        updateComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        mainPanel = new javax.swing.JPanel();
        mapPanel = new javax.swing.JPanel();
        mapTitleLabel = new javax.swing.JLabel();
        sensorTableLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sensorsTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        alarmTable = new javax.swing.JTable();
        mapLocationLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sectionDropdown = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        mainPanel.setPreferredSize(new java.awt.Dimension(1000, 1000));

        mapPanel.setPreferredSize(new java.awt.Dimension(950, 470));

        javax.swing.GroupLayout mapPanelLayout = new javax.swing.GroupLayout(mapPanel);
        mapPanel.setLayout(mapPanelLayout);
        mapPanelLayout.setHorizontalGroup(
            mapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        mapPanelLayout.setVerticalGroup(
            mapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        mapTitleLabel.setText("Current Map");

        sensorTableLabel.setText("Sensors");

        sensorsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String [] {
                "Sensor Id", "Pos"
            }
        ));
        jScrollPane1.setViewportView(sensorsTable);

        jLabel2.setText("Alarms");

        alarmTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String [] {
                "Alarm Id", "Pos1"
            }
        ));
        jScrollPane3.setViewportView(alarmTable);

        mapLocationLabel.setText("mapLocation");

        jLabel1.setText("Section");

        sectionDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sectionDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionDropdownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sectionDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addComponent(mapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mapTitleLabel)
                            .addComponent(sensorTableLabel)
                            .addComponent(jLabel2))
                        .addGap(50, 50, 50)
                        .addComponent(mapLocationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mapTitleLabel)
                    .addComponent(mapLocationLabel))
                .addGap(6, 6, 6)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(sectionDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sensorTableLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1174, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sectionDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionDropdownActionPerformed

    private List< Alarm > alarms;
    private List< MotionSensor> sensors;
    private List< Sensor > allSensors;
    Map< Long, SensorIcon > sensorIcons;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable alarmTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel mapLocationLabel;
    private javax.swing.JPanel mapPanel;
    private javax.swing.JLabel mapTitleLabel;
    private javax.swing.JComboBox<String> sectionDropdown;
    private javax.swing.JLabel sensorTableLabel;
    private javax.swing.JTable sensorsTable;
    // End of variables declaration//GEN-END:variables

    private void updateComponents() {
        mapPanel.setLayout(null);
        System.out.println("safedec.views.MapView.updateComponents()");
        URL url = getClass().getResource("/safedec/res/BuildingA.jpg");
        ImageIcon imageIcon = new ImageIcon(url);
        mapLocationLabel.setText("" + url.getFile());
        JLabel mapPicLabel = new javax.swing.JLabel(imageIcon);
        mapPanel.add(mapPicLabel);
        Insets insets = mapPanel.getInsets();
        System.out.println( mapPicLabel.getIcon().getIconWidth() + " " + mapPicLabel.getIcon().getIconHeight());
        mapPicLabel.setBounds(insets.left, insets.top, mapPicLabel.getIcon().getIconWidth(), mapPicLabel.getIcon().getIconHeight());
        
        MapService service = new MapService();
        sensors = service.getAllSensorsBySection(1);
        alarms = service.getAllAlarmsBySection(1);
        javax.swing.table.DefaultTableModel sensorModel = (javax.swing.table.DefaultTableModel) sensorsTable.getModel();
        
        for( MotionSensor sensor : sensors )
        {
            Object[]  tableRow = new Object[8];
            tableRow[0]= sensor.getId();
            tableRow[1]= sensor.getSectionId();
            tableRow[2]= sensor.getIpAddress();
            tableRow[3]= sensor.getPortNumber();
            tableRow[4]= sensor.getLoc().getX1()+","+sensor.getLoc().getY1();
            tableRow[5]= sensor.getPrice();
            tableRow[6] = sensor.isIsCamera();
            
             sensorModel.addRow(tableRow);
        }
        
                javax.swing.table.DefaultTableModel alarmModel = (javax.swing.table.DefaultTableModel) alarmTable.getModel();
         for( Alarm alarm : alarms )
         {
            Object[]  tableRow = new Object[8];
            tableRow[0]= alarm.getId();
            tableRow[1]= alarm.getSectionId();
            tableRow[2]= alarm.getIpAddress();
            tableRow[3]= alarm.getPortNumber();
            tableRow[4]= alarm.getLoc().getX1()+","+alarm.getLoc().getY1();
            tableRow[5]= alarm.getPrice();
            
             alarmModel.addRow(tableRow);
             
         }
       allSensors =  new ArrayList< Sensor >();
       allSensors.addAll(alarms);
       allSensors.addAll(sensors);
       sensorIcons = new HashMap<>();

       refreshSensorIcons();
    }
     private void refreshSensorIcons()
     {      
        Set<Integer> exsitingSensorIds = new HashSet<>();
        
        for (Sensor sensor : allSensors) {
            // Record all existing sensor ids for deleting missing sensors
            exsitingSensorIds.add(sensor.getId());
            // Donot add duplicated sensor icons
            if (sensorIcons.containsKey(sensor.getId())) {
                continue;
            }
            
            // Add new Sensor Icons
            SensorIcon newSensor = FlyweightSensorIconFactory.getSensorIcon(sensor);
            mapPanel.add(newSensor);
            sensorIcons.put(newSensor.getSensorId(), newSensor);
            Insets insets = mapPanel.getInsets();
            int ScreenPosX = insets.left + newSensor.getIcon().getIconWidth();
            int ScreenPosY = insets.top;
            int width = newSensor.getIcon().getIconWidth();
            int height = newSensor.getIcon().getIconHeight();
            ScreenPosX = sensor.getLoc().getX1();
            ScreenPosY = sensor.getLoc().getY1();
            newSensor.setBounds(ScreenPosX, ScreenPosY, width, height);
            }
     }
     
}