package de.dennis_boldt.rasberrypi.led;

import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;

import de.dennis_boldt.rasberrypi.pin.DigitalOutput;

public class Led {

	private final GpioPinDigitalOutput led;
	
	/**
	 * A simple GPIO wrapper to switch on and off an LED
	 * 
	 * @param pin GPIO pin
	 */
	public Led(Pin pin) {
		this.led = DigitalOutput.pin(pin);
	}
	
	/**
	 * Switches the LED on
	 */
	public void on() {
		// Set GPIO pin to high
		this.led.high();
	}
	
	/**
	 * Switches the LED off
	 */
	public void off() {
		// Set GPIO pin to low		
		this.led.low();
	}

}
