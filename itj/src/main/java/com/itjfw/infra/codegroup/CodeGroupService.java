package com.itjfw.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {

	@Autowired
	CodeGroupDao codeGroupDao;

	public CodeGroupDto selectOne(CodeGroupDto dto) {
		return codeGroupDao.selectOne(dto);
	}

	// 등록버튼
	public int insert(CodeGroupDto dto) {
		return codeGroupDao.insert(dto);
	}

	// 수정버튼
	public int update(CodeGroupDto dto) {
		return codeGroupDao.update(dto);
	}

	// 삭제버튼(uelete)
	public int uelete(CodeGroupDto dto) {
		return codeGroupDao.uelete(dto);
	}

	// 삭제버튼(delete)
	public int delete(CodeGroupDto dto) {
		return codeGroupDao.delete(dto);
	}

	// 페이징없는 코드그룹 리스트
	public List<CodeGroupDto> selectListWithoutPaging() {
		return codeGroupDao.selectListWithoutPaging();
	}

	// 페이징 처리 리스트
	public List<CodeGroupDto> selectListWithPaging(CodeGroupVo vo) {
		return codeGroupDao.selectListWithPaging(vo);
	}

	// 개수 리턴
	public Integer selectCount(CodeGroupVo vo) {
		return codeGroupDao.selectCount(vo);
	}
}
