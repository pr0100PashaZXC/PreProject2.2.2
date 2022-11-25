package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAOImpl implements CarDAO{

    private static int CARS_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS_COUNT, "type1", 1));
        cars.add(new Car(++CARS_COUNT, "type2", 12));
        cars.add(new Car(++CARS_COUNT, "type3", 123));
        cars.add(new Car(++CARS_COUNT, "type4", 1234));
        cars.add(new Car(++CARS_COUNT, "type5", 12345));
    }


    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
