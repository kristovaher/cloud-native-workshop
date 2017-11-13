package com.github.rometkoiv.app;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.github.rometkoiv.app.model.ItemType;
import com.github.rometkoiv.app.model.StockItem;

public interface StockItemRepository extends CrudRepository<StockItem, Long> {
    List<StockItem> findByType(ItemType type);
}