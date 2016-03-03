package de.dennis_boldt.rasberrypi.pin;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;

public class DigitalOutput {

	public static GpioPinDigitalOutput pin(Pin pin) {
		GpioController gpio = GpioFactory.getInstance();
		return gpio.provisionDigitalOutputPin(pin, PinState.LOW);
	}
	
}
