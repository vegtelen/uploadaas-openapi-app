package uploadaas.sys.aok.de.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uploadaas.sys.aok.de.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
