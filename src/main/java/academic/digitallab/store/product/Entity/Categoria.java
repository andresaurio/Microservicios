package academic.digitallab.store.product.Entity;

import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name="tbl_categories")
//@Getter genera los getter por debajo con lombok
//@Setter  genera los Setter por debajo con lombok
@Data //genera los getter, setter, hashcode, toString por debajo con Lombok
@AllArgsConstructor //lombok crea un constructor con todos los argumentos
@Builder            // lombok permite hacer nuevas instancias de nuestra entidad
@NoArgsConstructor // lombok  crea un constructor sin argumentos
public class Categoria {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
