package de.dennis_boldt.examples.led;

import com.pi4j.io.gpio.RaspiPin;

import de.dennis_boldt.rasberrypi.led.Led;

public class LedExample {

	public static void main(String[] args) throws InterruptedException {
		
		// 
		Led led = new Led(RaspiPin.GPIO_29);
		while (true) {
			System.out.println("LED on");
			led.off();
			Thread.sleep(1000);
			System.out.println("LED off");
			led.on();
			Thread.sleep(1000);
		}
		
	}
	
}
