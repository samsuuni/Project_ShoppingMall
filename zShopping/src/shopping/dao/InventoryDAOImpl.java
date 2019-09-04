package shopping.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import shopping.mapper.InventoryMapper;

@Repository("inventoryDao")
public class InventoryDAOImpl implements InventoryDAO{
	
	@Autowired
	private InventoryMapper inventoryMapper;
	
	

}
