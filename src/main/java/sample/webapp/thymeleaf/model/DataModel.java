package sample.webapp.thymeleaf.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataModel {
    private int id;
    private String value;
}