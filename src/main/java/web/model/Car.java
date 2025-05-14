package web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Car {

    private String brand;

    private String model;

    private int yearOfRelease;

    @Override
    public String toString() {
        return "Car{" +
               "model='" + brand + '\'' +
               ", series=" + model +
               ", yearOfRelease=" + yearOfRelease +
               '}';
    }
}
