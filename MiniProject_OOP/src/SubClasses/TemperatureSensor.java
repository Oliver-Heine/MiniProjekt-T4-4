package SubClasses;

import com.company.Sensor;

public class TemperatureSensor extends Sensor {
    public TemperatureSensor(String type, int id, double currentSensorValue) {
        super(type, id, currentSensorValue);
    }
}
