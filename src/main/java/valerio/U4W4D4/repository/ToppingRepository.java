package valerio.U4W4D4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import valerio.U4W4D4.entities.Topping;

import java.util.List;
@Repository
public interface ToppingRepository extends JpaRepository<Topping, Integer> {
    List<ToppingRepository> findByName(String name);
}
