/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safedec.business;

/**
 *
 * @author Prashul Singh
 */
public interface SystemState {
    public void handleState();
    public void nextState();
}
