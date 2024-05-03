package com.itjfw.infra.purchaseorderdetail;

import java.util.List;

public interface PurchaseOrderDetailDao {

	// 셀렉 리스트
	public List<PurchaseOrderDetailDto> selectListWithoutPaging(PurchaseOrderDetailVo vo);
	
	// 셀렉 리스트 카운트
	public int selectOneCount(PurchaseOrderDetailVo vo);
	
	// 셀렉원
	public PurchaseOrderDetailDto selectOne(PurchaseOrderDetailDto dto);
	
	// 인서트
	public int insert(PurchaseOrderDetailDto dto);
	
	// 업데이트
	public int update(PurchaseOrderDetailDto dto);
	
	// delNy = 1 변경 삭제
	public int updateDelete(PurchaseOrderDetailDto dto);
	
	// 완전 삭제
	public int delete(PurchaseOrderDetailDto dto);

	// 완전 삭제 발주
	public int deletePurchase(PurchaseOrderDetailDto dto);
		
	// 완전 삭제 상품
	public int deleteProduct(PurchaseOrderDetailDto dto);	
	
	// 페이지네이션
	public List<PurchaseOrderDetailDto> selectListWithPaging(PurchaseOrderDetailVo vo);
	
}
