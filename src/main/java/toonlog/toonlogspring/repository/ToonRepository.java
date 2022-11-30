package toonlog.toonlogspring.repository;
import toonlog.toonlogspring.domain.Toon;

import java.util.List;
import java.util.Optional;

public interface ToonRepository {
    Toon save(Toon member);
    Optional<Toon> findById(Long id);
    Optional<Toon> findByName(String name);
    List<Toon> findAll();
}
