package Jar.payload; // To jest ta kluczowa zmiana

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShapeEvent {
    private String id;
    private String type;
    private double x;
    private double y;
    private double width;
    private double height;
    private String color;
}
