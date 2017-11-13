package com.github.kristovaher.app;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.github.kristovaher.app.model.ItemType;
import com.github.kristovaher.app.model.StockItem;

public interface StockItemRepository extends CrudRepository<StockItem, Long> {
    List<StockItem> findByType(ItemType type);
}
