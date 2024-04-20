package com.itjfw.infra.purchaseorderdetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PurchaseOrderDetailService {

	@Autowired
	PurchaseOrderDetailDao purchaseOrderDetailDao;
	
	// 셀렉 리스트
	public List<PurchaseOrderDetailDto> selectListWithoutPaging(PurchaseOrderDetailVo vo) {
		return purchaseOrderDetailDao.selectListWithoutPaging(vo);
	}
	
	// 셀렉 리스트 카운트
	public int selectOneCount(PurchaseOrderDetailVo vo) throws Exception{
		return purchaseOrderDetailDao.selectOneCount(vo);
	}
	
	// 셀렉 원
	public PurchaseOrderDetailDto selectOne(PurchaseOrderDetailDto dto) {
		return purchaseOrderDetailDao.selectOne(dto);
	}
	
	// 인서트
	public int insert(PurchaseOrderDetailDto dto) {
		return purchaseOrderDetailDao.insert(dto);
	}
	
	// 업데이트
	public int update(PurchaseOrderDetailDto dto) {
		return purchaseOrderDetailDao.update(dto);
	}
	
	// deyNy = 1 삭제
	public int updateDelete(PurchaseOrderDetailDto dto) {
		return purchaseOrderDetailDao.updateDelete(dto);
	}
	
	// 완전 삭제
	public int delete(PurchaseOrderDetailDto dto) {
		return purchaseOrderDetailDao.delete(dto);
	}
	
	// 페이징 처리 리스트
	public List<PurchaseOrderDetailDto> selectListWithPaging(PurchaseOrderDetailVo vo){
		return purchaseOrderDetailDao.selectListWithPaging(vo);
	}
}
