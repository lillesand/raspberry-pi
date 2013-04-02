package no.bekk;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Let's rooooll!");

        GpioController gpioController = GpioFactory.getInstance();

        GpioPinDigitalOutput pin0 = gpioController.provisionDigitalOutputPin(RaspiPin.GPIO_00, "IO0", PinState.LOW);
        while (true) {
            pin0.setState(PinState.HIGH);
            Thread.sleep(10);
            pin0.setState(PinState.LOW);
            Thread.sleep(10);
        }
    }
}
