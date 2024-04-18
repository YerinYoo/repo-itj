package com.itjfw.infra.Receipt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ReceiptService {

	@Autowired
	ReceiptDao productDao;
	
	// 셀렉 리스트
	public List<ReceiptDto> selectList(ReceiptVo vo) {
		return productDao.selectList(vo);
	}
	
	// 셀렉 리스트 카운트
	public int selectOneCount(ReceiptVo vo) throws Exception{
		return productDao.selectOneCount(vo);
	}
	
	// 셀렉 원
	public ReceiptDto selectOne(ReceiptDto dto) {
		return productDao.selectOne(dto);
	}
	
	// 인서트
	public int insert(ReceiptDto dto) {
		return productDao.insert(dto);
	}
	
	// 업데이트
	public int update(ReceiptDto dto) {
		return productDao.update(dto);
	}
	
	// deyNy = 1 삭제
	public int updateDelete(ReceiptDto dto) {
		return productDao.updateDelete(dto);
	}
	
	// 완전 삭제
	public int delete(ReceiptDto dto) {
		return productDao.delete(dto);
	}
	
	// 페이징 처리 리스트
	public List<ReceiptDto> selectListWithPaging(ReceiptVo vo){
		return productDao.selectListWithPaging(vo);
	}
}
