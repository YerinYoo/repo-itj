package com.itjfw.common.base;

import com.itjfw.common.constants.Constants;

public class BaseVo {

//	paging
	private int thisPage = 1; // 현재 페이지
	private int rowNumToShow = Constants.ROW_NUM_TO_SHOW; // 화면에 보여줄 데이터 줄 갯수
	private int pageNumToShow = Constants.PAGE_NUM_TO_SHOW; // 화면에 보여줄 페이징 번호 갯수

	private int totalRows; // 전체 데이터 갯수
	private int totalPages; // 전체 페이지 번호
	private int startPage; // 시작 페이지 번호
	private int endPage; // 마지막 페이지 번호

	private int startRnumForOracle = 1; // 쿼리 시작 row
	private int endRnumForOracle; // 쿼리 끝 row
	private Integer RNUM;

	private int startRnumForMysql = 0; // 쿼리 시작 row

	// search 관련
	private Integer voUseNy = 1; /* null 값을 받아야 되는 경우가 있어서 int 대신 Integer 사용 */
	private Integer voDelNy = 0; /* null 값을 받아야 되는 경우가 있어서 int 대신 Integer 사용 */
	private Integer voOptionDate = 2; /* null 값을 받아야 되는 경우가 있어서 int 대신 Integer 사용 */
	private String voDateStart;
	private String voDateEnd;
	private Integer voOption; /* null 값을 받아야 되는 경우가 있어서 int 대신 Integer 사용 */
	private String voValue;

	// 페이징 관련 totalRoswParam
	public void setParamsPaging(int totalRowsParam) {

		totalRows = totalRowsParam;

		totalPages = totalRows / rowNumToShow;

		if (totalRows % rowNumToShow > 0) {
			totalPages = totalPages + 1;
		}

		if (totalPages < thisPage) {
			thisPage = totalPages;
		}

		startPage = (((thisPage - 1) / pageNumToShow) * pageNumToShow + 1);

		endPage = (startPage + pageNumToShow - 1);

		if (endPage > totalPages) {
			endPage = (totalPages);
		}

		endRnumForOracle = ((rowNumToShow * thisPage));
		startRnumForOracle = ((endRnumForOracle - rowNumToShow) + 1);
		if (startRnumForOracle < 1)
			startRnumForOracle = 1;

		if (thisPage == 1) {
			startRnumForMysql = 0;
		} else {
			startRnumForMysql = ((rowNumToShow * (thisPage - 1)));
		}

//		System.out.println("최종 결과값--------------------------------------------------");
//		System.out.println("getThisPage():" + thisPage);
//		System.out.println("getTotalRows():" + totalRows);
//		System.out.println("getRowNumToShow():" + rowNumToShow);
//		System.out.println("getTotalPages():" + totalPages);
//		System.out.println("getStartPage():" + startPage);
//		System.out.println("getEndPage():" + endPage);		
//		System.out.println("getStartRnumForOracle():" + startRnumForOracle);
//		System.out.println("getEndRnumForOracle():" + endRnumForOracle);
//		System.out.println("getStartRnumForMysql(): " + startRnumForMysql);
//		

	}

	// get/set

	public int getThisPage() {
		return thisPage;
	}

	public void setThisPage(int thisPage) {
		this.thisPage = thisPage;
	}

	public int getRowNumToShow() {
		return rowNumToShow;
	}

	public void setRowNumToShow(int rowNumToShow) {
		this.rowNumToShow = rowNumToShow;
	}

	public int getPageNumToShow() {
		return pageNumToShow;
	}

	public void setPageNumToShow(int pageNumToShow) {
		this.pageNumToShow = pageNumToShow;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getStartRnumForOracle() {
		return startRnumForOracle;
	}

	public void setStartRnumForOracle(int startRnumForOracle) {
		this.startRnumForOracle = startRnumForOracle;
	}

	public int getEndRnumForOracle() {
		return endRnumForOracle;
	}

	public void setEndRnumForOracle(int endRnumForOracle) {
		this.endRnumForOracle = endRnumForOracle;
	}

	public Integer getRNUM() {
		return RNUM;
	}

	public void setRNUM(Integer rNUM) {
		RNUM = rNUM;
	}

	public int getStartRnumForMysql() {
		return startRnumForMysql;
	}

	public void setStartRnumForMysql(int startRnumForMysql) {
		this.startRnumForMysql = startRnumForMysql;
	}

	public Integer getVoUseNy() {
		return voUseNy;
	}

	public void setVoUseNy(Integer voUseNy) {
		this.voUseNy = voUseNy;
	}

	public Integer getVoDelNy() {
		return voDelNy;
	}

	public void setVoDelNy(Integer voDelNy) {
		this.voDelNy = voDelNy;
	}

	public Integer getVoOptionDate() {
		return voOptionDate;
	}

	public void setVoOptionDate(Integer voOptionDate) {
		this.voOptionDate = voOptionDate;
	}

	public String getVoDateStart() {
		return voDateStart;
	}

	public void setVoDateStart(String voDateStart) {
		this.voDateStart = voDateStart;
	}

	public String getVoDateEnd() {
		return voDateEnd;
	}

	public void setVoDateEnd(String voDateEnd) {
		this.voDateEnd = voDateEnd;
	}

	public Integer getVoOption() {
		return voOption;
	}

	public void setVoOption(Integer voOption) {
		this.voOption = voOption;
	}

	public String getVoValue() {
		return voValue;
	}

	public void setVoValue(String voValue) {
		this.voValue = voValue;
	}

	
}
