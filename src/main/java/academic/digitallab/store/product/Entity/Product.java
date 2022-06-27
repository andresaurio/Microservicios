package academic.digitallab.store.product.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TBL_PRODUCTS")
@Data //Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
@AllArgsConstructor @NoArgsConstructor @Builder // el primero crea un constructor con todos los argumentos y el segundo vacio
// el @Builder de lombok permite hacer nuevas instancias de nuestra entidad
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String description;
    private Double stock;
    private double price;
    private String status;

    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date create_at;

    @ManyToOne(fetch = FetchType.LAZY)//relacion de la tabla producto con categoria relación muchos a uno  Lazy carga los registros necesarios, mientras que Eager carga toda la info
    @JoinColumn(name = "category_id")
    private Categoria categoria;
}
