package service;

import model.Color;
import org.springframework.stereotype.Service;

/**
 * @author Artur Gilyazov
 * Реализация сервиса вывода данных о цвете
 */

@Service
public class ColorServiceImpl implements ColorService {

    @Override
    public String showColor(Color color) {
        String nameOfColor = color.getName();
        String colorOfColor = color.getColor();
        int sizeOfColor = color.getSize();
        return "This is " + nameOfColor +
                ". Attributes: color = " + colorOfColor +
                " size = " + sizeOfColor + ".";
    }
}
