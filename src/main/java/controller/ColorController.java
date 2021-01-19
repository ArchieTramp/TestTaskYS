package controller;

import model.Color;
import org.springframework.web.bind.annotation.GetMapping;
import repository.ColorsRepository;
import service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Artur Gilyazov
 * Контроллер-фасад
 */

@Controller
public class ColorController {

    @Autowired
    private ColorsRepository colorsRepository;
    @Autowired
    private ColorService colorService;


    @GetMapping (value = "/byColor")
    public void finderByColor() {
        String plug = "red";
        //заглушка для простоты реализации, по факту можно прикрутить заполнение с консоли/фронтчасти и прочее
        Color color = colorsRepository.findByColor(plug);
        colorService.showColor(color);
    }
    @GetMapping(value = "/bySize")
    public void finderBySize() {
        int cap = 5;
        Color color = colorsRepository.findBySize(cap);
        colorService.showColor(color);
    }
}
