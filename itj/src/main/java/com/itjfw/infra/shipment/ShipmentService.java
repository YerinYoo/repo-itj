package com.itjfw.infra.shipment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipmentService {

	@Autowired
	ShipmentDao poDao;

	// selectList 구현 - 페이징처리
	public List<ShipmentDto> selectListWithPaging(ShipmentVo shipmentVo) {
		return poDao.selectListWithPaging(shipmentVo);
	}

	// 페이징 처리안된 리스트
	public List<ShipmentDto> selectListWithoutPaging() {
		return poDao.selectListWithoutPaging();
	}

	// 개수 리턴
	public Integer selectCount(ShipmentVo shipmentVo) {
		return poDao.selectCount(shipmentVo);
	}

	public ShipmentDto selectOne(ShipmentDto shipmentDto) {
		return poDao.selectOne(shipmentDto);
	}

	// 등록버튼
	public int insert(ShipmentDto shipmentDto) {
		return poDao.insert(shipmentDto);
	}

	// 수정버튼
	public int update(ShipmentDto shipmentDto) {
		return poDao.update(shipmentDto);
	}

	// 삭제버튼(uelete)
	public int uelete(ShipmentDto shipmentDto) {
		return poDao.uelete(shipmentDto);
	}

	// 삭제버튼(delete
	public int delete(ShipmentDto shipmentDto) {
		return poDao.delete(shipmentDto);
	}


}
