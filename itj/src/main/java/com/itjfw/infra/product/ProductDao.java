package com.itjfw.infra.product;

import java.util.List;

public interface ProductDao {

	// 셀렉 리스트
	public List<ProductDto> selectList(ProductVo vo);
	
	// 셀렉 리스트 카운트
	public int selectOneCount(ProductVo vo);
	
	// 셀렉원
	public ProductDto selectOne(ProductDto dto);
	
	// 인서트
	public int insert(ProductDto dto);
	
	// 업데이트
	public int update(ProductDto dto);
	
	// delNy = 1 변경 삭제
	public int updateDelete(ProductDto dto);
	
	// 완전 삭제
	public int delete(ProductDto dto);

	// 페이지네이션
	public List<ProductDto> selectListWithPaging(ProductVo vo);
	
}
