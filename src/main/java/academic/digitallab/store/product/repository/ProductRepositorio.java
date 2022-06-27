package academic.digitallab.store.product.repository;

import academic.digitallab.store.product.Entity.Categoria;
import academic.digitallab.store.product.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepositorio extends JpaRepository <Product, Long> {

    public List<Product> findByCategoria(Categoria categoria);


}
