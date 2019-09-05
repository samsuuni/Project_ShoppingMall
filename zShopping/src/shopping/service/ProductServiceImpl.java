package shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopping.dao.ProductDAO;
import shopping.vo.ProductVO;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDAO productDao;

	@Override
	public List<ProductVO> selectAll() {
		return productDao.selectAll();
	}



}
