package com.itjfw.infra.codegroup;

import java.util.List;

public interface CodeGroupDao {

	// DTO 중 하나를 리턴
	public CodeGroupDto selectOne(CodeGroupDto dto);

	// 등록 버튼
	public int insert(CodeGroupDto dto);

	// 수정 버튼
	public int update(CodeGroupDto dto);

	// 삭제 버튼
	public int uelete(CodeGroupDto dto);

	// 삭제 버튼(drop)
	public int delete(CodeGroupDto dto);

	// 페이징처리없는 코드그룹 리스트 리턴
	public List<CodeGroupDto> selectListWithoutPaging();

	// 페이징 처리 리스트
	public List<CodeGroupDto> selectListWithPaging(CodeGroupVo vo);

	// 개수 리턴
	public Integer selectCount(CodeGroupVo vo);

}
