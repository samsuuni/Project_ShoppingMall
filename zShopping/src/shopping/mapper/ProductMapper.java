package shopping.mapper;

import java.util.List;

import shopping.vo.ProductVO;

@MyMapper
public interface ProductMapper {

	public List<ProductVO> selectAll();
	
}
