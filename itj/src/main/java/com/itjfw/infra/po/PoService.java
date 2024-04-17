package com.itjfw.infra.po;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoService {

	// @autowired : 객체 생성어노테이션
	@Autowired
	PoDao poDao;

	// selectList 구현 - 페이징처리
	public List<PoDto> selectListWithPaging(PoVo poVo) {
		return poDao.selectListWithPaging(poVo);
	}

	// 페이징 처리안된 리스트
	public List<PoDto> selectListWithoutPaging() {
		return poDao.selectListWithoutPaging();
	}

	// 개수 리턴
	public Integer selectCount(PoVo poVo) {
		return poDao.selectCount(poVo);
	}

	public PoDto selectOne(PoDto poDto) {
		return poDao.selectOne(poDto);
	}

	// 등록버튼
	public int insert(PoDto poDto) {
		return poDao.insert(poDto);
	}

	// 수정버튼
	public int update(PoDto poDto) {
		return poDao.update(poDto);
	}

	// 삭제버튼(uelete)
	public int uelete(PoDto poDto) {
		return poDao.uelete(poDto);
	}

	// 삭제버튼(delete
	public int delete(PoDto poDto) {
		return poDao.delete(poDto);
	}


}
