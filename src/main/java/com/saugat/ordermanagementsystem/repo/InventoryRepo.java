package com.saugat.ordermanagementsystem.repo;

import com.saugat.ordermanagementsystem.model.Inventory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepo extends AbstractRepo<Inventory> {
    @Query("SELECT CASE WHEN COUNT(i) > 0 THEN true ELSE false END FROM Inventory i WHERE i.product.id = :productId AND i.unitsInStock > 0")
    boolean isStockAvailableByProductId(Long productId);
}
