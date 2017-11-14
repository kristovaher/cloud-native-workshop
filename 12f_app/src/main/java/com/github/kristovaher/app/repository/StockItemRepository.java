package com.github.kristovaher.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.github.kristovaher.app.domain.model.ItemType;
import com.github.kristovaher.app.domain.model.StockItem;

public interface StockItemRepository extends CrudRepository<StockItem, Long>{
	List<StockItem> findByType(ItemType type);
}
