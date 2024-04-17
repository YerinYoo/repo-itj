package com.itjfw.infra.po;

import java.util.List;

public interface PoDao {

	// 수많은 DTO 목록들을 리스트로 리턴 - 페이징 처리
	public List<PoDto> selectListWithPaging(PoVo vo);

	//페이징 처리안된 리스트 리턴
	public List<PoDto> selectListWithoutPaging();
	
	// 개수 리턴
	public Integer selectCount(PoVo vo);

	// DTO 중 하나를 리턴
	public PoDto selectOne(PoDto dto);

	// 등록 버튼
	public int insert(PoDto dto);

	// 수정 버튼
	public int update(PoDto dto);

	// 삭제 버튼
	public int uelete(PoDto dto);

	// 삭제 버튼(drop)
	public int delete(PoDto dto);


}
