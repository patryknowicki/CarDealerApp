package cardealer.cardealerapp;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface motorcycleRepo extends JpaRepository<Motorcycle, Integer> {
    List<Motorcycle> findAllBymark (String wyszukaj);
}
