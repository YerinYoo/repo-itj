package com.itjfw.infra.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	// 셀렉 리스트
	public List<ProductDto> selectList(ProductVo vo) {
		return productDao.selectList(vo);
	}
	
	// 셀렉 리스트 카운트
	public int selectOneCount(ProductVo vo) throws Exception{
		return productDao.selectOneCount(vo);
	}
	
	// 셀렉 원
	public ProductDto selectOne(ProductDto dto) {
		return productDao.selectOne(dto);
	}
	
	// 인서트
	public int insert(ProductDto dto) {
		return productDao.insert(dto);
	}
	
	// 업데이트
	public int update(ProductDto dto) {
		return productDao.update(dto);
	}
	
	// deyNy = 1 삭제
	public int updateDelete(ProductDto dto) {
		return productDao.updateDelete(dto);
	}
	
	// 완전 삭제
	public int delete(ProductDto dto) {
		return productDao.delete(dto);
	}
	
	// 페이징 처리 리스트
	public List<ProductDto> selectListWithPaging(ProductVo vo){
		return productDao.selectListWithPaging(vo);
	}
}
