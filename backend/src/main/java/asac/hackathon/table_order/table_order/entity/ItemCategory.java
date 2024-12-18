package asac.hackathon.table_order.table_order.entity;

import asac.hackathon.table_order.table_order.controller.dto.CategoryDto;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ItemCategory extends BaseEntity {

    String name;
    Integer priority;

    public void updateForm(CategoryDto categoryDto) {
        this.name = categoryDto.getCategoryName();
        this.priority = categoryDto.getCategoryPriority();
    }

}
