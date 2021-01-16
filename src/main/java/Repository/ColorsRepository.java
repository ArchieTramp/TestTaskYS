package Repository;

import Model.Color;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.*;

/**
 * @author Artur Gilyazov
 * Репозиторий для хранения данных
 */

public interface ColorsRepository extends JpaRepository<Color, Long> {
}
