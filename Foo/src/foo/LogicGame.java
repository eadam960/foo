/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foo;

import java.util.Arrays;

/**
 *
 * @author eadam
 */
public class LogicGame {
    private final int SIZE = 8;
    
    private boolean[] elements;
    private boolean locked;

    
    public LogicGame(){
        locked = false;
        elements = new boolean[SIZE];
    }

    public void switchElement(int elementIndex) {  // switch element current state
        if(elementIndex >= SIZE || elementIndex < 0) {return; }
        
        elements[elementIndex] = !elements[elementIndex];
        if(locked){
            int elementPre = (elementIndex-1 + SIZE) % SIZE ;
            int elementNext = (elementIndex+1) % SIZE;    // sorrend?
            
            elements[elementPre] = !elements[elementPre];
            elements[elementNext] = !elements[elementNext];
        }
        
    }

    
    

    public boolean[] getElements() {
        return elements.clone();    
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public int getSIZE() {
        return SIZE;
    }

    public boolean setElementsIfUnlocked(boolean[] elements) {
        if(!locked){
            this.elements = elements.clone();
            return true;
        }
        return false;
        
    }
    
    
    
    
    
    
    


    
    
    
    
    
}
