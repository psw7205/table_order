package asac.hackathon.table_order.table_order.repository;

import asac.hackathon.table_order.table_order.entity.ItemCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<ItemCategory, Long> {

    @Transactional
    Optional<ItemCategory> findByName(String name);

    @Transactional
    @Query("SELECT c from ItemCategory c where c.id = :id")
    Optional<ItemCategory> findByCategoryId(Long id);

    @Transactional
    List<ItemCategory> findAllByOrderByPriority();

    @Transactional
    ItemCategory save(ItemCategory itemCategory);

}
