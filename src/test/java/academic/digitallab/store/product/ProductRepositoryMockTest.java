package academic.digitallab.store.product;

import academic.digitallab.store.product.Entity.Categoria;
import academic.digitallab.store.product.Entity.Product;
import academic.digitallab.store.product.repository.ProductRepositorio;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;
import java.util.List;

@DataJpaTest
public class ProductRepositoryMockTest {

    @Autowired
    private ProductRepositorio productRepositorio;

    @Test //este decorador permite que se pueda hacer testing de la clase, vemos que se activa el play
    public void whenFindByCategory_thenReturnListProduct(){
        Product product01 = Product.builder()
                .name("Computer")
                .categoria(Categoria.builder().id(1L).build())
                .description("Dell inspiron 13")
                .stock(Double.parseDouble("10"))
                .price(Double.parseDouble("1249.99"))
                .status("Created")
                .create_at(new Date()).build();

        productRepositorio.save(product01);

        List<Product> founds= productRepositorio.findByCategoria(product01.getCategoria());

        // aserción si el tamaño de

        Assertions.assertThat(  founds.size()).isEqualTo(3);

    }

}
