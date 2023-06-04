package Config;

import Driver.Driver;
import Transport.Car;
import Transport.Bus;
import Transport.Pickup;
import Transport.Transport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "Car")
    public Transport getCarBean() {
        return new Car("BMW");
    }

    @Bean(name = "Bus")
    public Transport getBusBean() {
        return new Bus("Volvo");
    }

    @Bean(name = "Pickup")
    public Transport getPickupBean() {
        return new Pickup("Ford");
    }

    @Bean(name = "driver1")
    public Driver getDriver1() {
        return new Driver("Вася" , getCarBean());
    }

    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver("Миша" , getBusBean());
    }

    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver("Коля" , getPickupBean());
    }


}
