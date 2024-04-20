package com.itjfw.infra.receipt;

import java.util.List;

public interface ReceiptDao {

	// 셀렉 리스트
	public List<ReceiptDto> selectListWithoutPaging(ReceiptVo vo);
	
	// 셀렉 리스트 카운트
	public int selectOneCount(ReceiptVo vo);
	
	// 셀렉원
	public ReceiptDto selectOne(ReceiptDto dto);
	
	// 인서트
	public int insert(ReceiptDto dto);
	
	// 업데이트
	public int update(ReceiptDto dto);
	
	// delNy = 1 변경 삭제
	public int updateDelete(ReceiptDto dto);
	
	// 완전 삭제
	public int delete(ReceiptDto dto);

	// 페이지네이션
	public List<ReceiptDto> selectListWithPaging(ReceiptVo vo);
	
}
