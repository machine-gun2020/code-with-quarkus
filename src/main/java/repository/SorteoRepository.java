package repository;


import com.example.study.model.Sorteo;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SorteoRepository implements PanacheRepository<Sorteo> {
    // Métodos adicionales si es necesario.
}
