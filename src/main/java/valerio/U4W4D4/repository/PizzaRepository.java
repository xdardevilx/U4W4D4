package valerio.U4W4D4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import valerio.U4W4D4.entities.Pizza;

import java.util.List;
@Repository
public interface PizzaRepository  extends JpaRepository<Pizza, Integer> {
    List<Pizza> findByName(String name);
    List<Pizza> findByIsXl(boolean isXl);
}
