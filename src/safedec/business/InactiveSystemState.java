/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safedec.business;

import safedec.controls.ViewController;

/**
 *
 * @author Prashul Singh
 */
public class InactiveSystemState implements SystemState{
  
    BuildingSystem buildingSystem;
    
    InactiveSystemState(BuildingSystem buildingSystem) {
     this.buildingSystem = buildingSystem;
    }

    @Override
    public void handleState() {
        //handle Inactive state 
        //ViewController.getInstance().
    }

    @Override
    public void nextState() {
      this.buildingSystem.state = new ActiveSystemState(buildingSystem);
    }

  
}
