package cardealer.cardealerapp;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface carRepo extends JpaRepository<Car, Integer> {
    List<Car> findAllBymark(String wyszukaj);

}