package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car("VAZ", "2121", "white"));
        carList.add(new Car("Moskvich", "412", "green"));
        carList.add(new Car("VAZ", "2106", "blue"));
        carList.add(new Car("VAZ", "2114", "grey"));
        carList.add(new Car("LADA", "Granta", "brown"));
    }

    public List<Car> getListCar(Integer count) {
        if(count != null && count >= 0 && count <= this.carList.size()) {
            return this.carList.subList(0, count);
        }
        return this.carList;
    }
}