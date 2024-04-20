package com.itjfw.infra.receipt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ReceiptService {

	@Autowired
	ReceiptDao receiptDao;
	
	// 셀렉 리스트
	public List<ReceiptDto> selectListWithoutPaging(ReceiptVo vo) {
		return receiptDao.selectListWithoutPaging(vo);
	}
	
	// 셀렉 리스트 카운트
	public int selectOneCount(ReceiptVo vo) throws Exception{
		return receiptDao.selectOneCount(vo);
	}
	
	// 셀렉 원
	public ReceiptDto selectOne(ReceiptDto dto) {
		return receiptDao.selectOne(dto);
	}
	
	// 인서트
	public int insert(ReceiptDto dto) {
		return receiptDao.insert(dto);
	}
	
	// 업데이트
	public int update(ReceiptDto dto) {
		return receiptDao.update(dto);
	}
	
	// deyNy = 1 삭제
	public int updateDelete(ReceiptDto dto) {
		return receiptDao.updateDelete(dto);
	}
	
	// 완전 삭제
	public int delete(ReceiptDto dto) {
		return receiptDao.delete(dto);
	}
	
	// 페이징 처리 리스트
	public List<ReceiptDto> selectListWithPaging(ReceiptVo vo){
		return receiptDao.selectListWithPaging(vo);
	}
}
