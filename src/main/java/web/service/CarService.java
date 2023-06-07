package web.service;
import org.springframework.stereotype.Service;
import web.model.Cars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private List<Cars> cars = Arrays.asList(
            new Cars(1, "Tesla Model 3", "Red"),
            new Cars(2, "BMW M3", "Blue"),
            new Cars(3, "Audi A6", "Black"),
            new Cars(4, "Mercedes C", "White"),
            new Cars(5, "Porsche 911", "Yellow")
    );

    public List<Cars> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}