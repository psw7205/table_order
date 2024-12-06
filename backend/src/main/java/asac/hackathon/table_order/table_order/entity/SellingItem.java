package asac.hackathon.table_order.table_order.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SellingItem extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "category_id")
    ItemCategory itemCategory;

    String name;
    Integer price;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    ItemEntityEnum entityEnumStatus;
    @Lob
    String description;
    @Lob
    String profilePath;

    public static SellingItem from(ItemCategory category,String name, Integer price, ItemEntityEnum status,String description,String profilePath){
        return new SellingItem(category,name,price,status,description,profilePath);
    }

}
