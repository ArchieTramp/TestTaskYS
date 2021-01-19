package model;

import lombok.*;

import javax.persistence.*;

/**
 * @author Artur Gilyazov
 * Модель для создания и использования цветов
 */

@Data
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
@Table(name = "colors", uniqueConstraints = @UniqueConstraint(columnNames = {"Id"}))
public final class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String color;
    private int size;
}
