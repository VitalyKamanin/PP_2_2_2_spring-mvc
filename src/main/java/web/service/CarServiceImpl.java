package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>(5);
        cars.add(new Car("Лада", "белый", 111));
        cars.add(new Car("Toyota", "красный", 222));
        cars.add(new Car("Subaru", "зеленый", 333));
        cars.add(new Car("Honda", "оранжевый", 444));
        cars.add(new Car("Audi", "фиолетовый", 555));
        if (count < 1) {
            count = cars.size();
        }
        return cars.stream()
                .limit(count)
                .toList();
    }
}
