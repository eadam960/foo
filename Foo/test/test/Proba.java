/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import foo.LogicGame;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eadam
 */
public class Proba {
    
    private LogicGame logicGm;
    
    public Proba() {
    }
    
    @Before
    public void setUp() {
        logicGm = new LogicGame();
    }

    @Test
    public void first(){
        boolean [] asd = logicGm.getElements();
        for (boolean b : asd) {
            assertFalse(b);
        }
        asd[2] = true;
        
        asd = logicGm.getElements();
        for (boolean b : asd) {
            assertFalse(b);
        }
        
    }
}
