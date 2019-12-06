package cardealer.cardealerapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface carRepo extends JpaRepository <Car, Integer> {
}
