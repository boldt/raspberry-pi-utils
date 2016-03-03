# Rasberry Pi Utils for Java

The goal of this project is to abstract different Rasberry Pi hardware components as a Java maven package.
Thus, a simple and fast reuse of different hardware components is possible, without reinventing the code behind using them.

This project is based on the amazing pi4j project!

## An Example

### The pi4j way to switch on and off an LED

Using pi4j, you must understand the classes `GpioController` and the `GpioPinDigitalOutput`. Additionally, you must know *high* and *low* levels.

```
GpioController gpio = GpioFactory.getInstance();
GpioPinDigitalOutput led = gpio.provisionDigitalOutputPin(pin, "LED", PinState.LOW);
led.low();
...
led.high();
```

### The "Rasberry Pi Utils" way to switch on and off an LED

With this Utils, you just define on which gpio pin you connected the LED and you switch the LED **on** and **off**

```
Led led = new Led(RaspiPin.GPIO_29);
led.off();
...
led.on();
```