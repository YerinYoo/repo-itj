package com.itjfw.infra.shipment;

import java.util.List;

public interface ShipmentDao {

	// 수많은 DTO 목록들을 리스트로 리턴 - 페이징 처리
	public List<ShipmentDto> selectListWithPaging(ShipmentVo shipmentVo);

	// 페이징 처리안된 리스트 리턴
	public List<ShipmentDto> selectListWithoutPaging();

	// 개수 리턴
	public Integer selectCount(ShipmentVo shipmentVo);

	// DTO 중 하나를 리턴
	public ShipmentDto selectOne(ShipmentDto shipmentVo);

	// 등록 버튼
	public int insert(ShipmentDto shipmentVo);

	// 수정 버튼
	public int update(ShipmentDto shipmentVo);

	// 삭제 버튼
	public int uelete(ShipmentDto shipmentVo);

	// 삭제 버튼(drop)
	public int delete(ShipmentDto shipmentVo);

}
