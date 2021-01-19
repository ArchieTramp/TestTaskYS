package repository;

import model.Color;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Artur Gilyazov
 * Репозиторий для хранения данных
 */

public interface ColorsRepository extends JpaRepository<Color, Long> {

    Color findByColor(String color);

    Color findBySize(Integer size);


}
