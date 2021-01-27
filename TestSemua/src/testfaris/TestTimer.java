/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfaris;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Simple demo that uses java.util.Timer to schedule a task 
 * to execute once 5 seconds have passed.
 */

public class TestTimer {
    Timer timer;

    public TestTimer(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
	}

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Time's up!");
            timer.cancel(); //Terminate the timer thread
        }
    }

    public static void main(String args[]) {
        new TestTimer(5);
        System.out.println("Task scheduled.");
    }
}