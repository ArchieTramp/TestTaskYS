package Service;

import Model.Color;
import Repository.ColorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Artur Gilyazov
 * Реализация сервиса вывода данных о цвете
 */

@Service
public class ColorServiceImpl implements ColorService {

    @Autowired
    private ColorsRepository colorsRepository;

    @Override
    public String showColor(Color color) {
        String nameOfColor = color.getName();
        String colorOfColor = color.getColor();
        int sizeOfColor = color.getSize();
        String show = "This is " + nameOfColor +
                ". Attributes: color = " + colorOfColor +
                " size = " + sizeOfColor + ".";
        return show;
    }
}
