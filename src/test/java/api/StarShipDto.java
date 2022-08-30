package api;

import java.util.ArrayList;
import java.util.Date;
import lombok.Data;

@Data
public class StarShipDto {
    private String name;
    private String model;
    private String manufacturer;
    //Must be an integer, but the request returns too large a number
    private Long cost_in_credits;
    private String length;
    private String max_atmosphering_speed;
    private String crew;
    private String passengers;
    private String cargo_capacity;
    private String consumables;
    private String hyperdrive_rating;
    private String mGLT;
    private String starship_class;
    private ArrayList<Object> pilots;
    private ArrayList<String> films;
    private String created;
    private String edited;
    private String url;
    private String additionLine;
}
