package spring_boot_web_jpa.category.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QueryCategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
