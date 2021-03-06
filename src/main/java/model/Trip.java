package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Data
@AllArgsConstructor

public class Trip {

    private LocalDate startOfTrip;
    private LocalDate endOfTrip;
    private String destiny;
    private BigDecimal price;


    @Override
    public String toString() {
        return  "Trip to: " + destiny +
                ", date: " + startOfTrip +
                " - " + endOfTrip +
                ", cost: " + this.getPrice() +
                "$";
    }
}
