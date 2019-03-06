package com.sunnsoft.yunpi.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * 手动分页可以用这个
 * @author rk
 */
public class PageListDTO {
	private Object otherData;
	private int totalPage;
	private int currentPage;
	private List<HashMap<String, Object>> list;
	private int pageSize;
	private int totalRecord;
	private int scale = 3;
	private boolean firstPage;
	private boolean lastPage;
	private int listSize;
	private List<Integer> nextPageNoSequence = new ArrayList<>();
	private List<Integer> previousPageNoSequence = new ArrayList<>();

	public boolean isFirstPage() {
		return firstPage;
	}

	public void setFirstPage(boolean firstPage) {
		this.firstPage = firstPage;
	}

	public boolean isLastPage() {
		return lastPage;
	}

	public void setLastPage(boolean lastPage) {
		this.lastPage = lastPage;
	}

	public int getListSize() {
		return listSize;
	}

	public void setListSize(int listSize) {
		this.listSize = listSize;
	}

	public List<Integer> getNextPageNoSequence() {
		return nextPageNoSequence;
	}

	public void setNextPageNoSequence(List<Integer> nextPageNoSequence) {
		this.nextPageNoSequence = nextPageNoSequence;
	}

	public List<Integer> getPreviousPageNoSequence() {
		return previousPageNoSequence;
	}

	public void setPreviousPageNoSequence(List<Integer> previousPageNoSequence) {
		this.previousPageNoSequence = previousPageNoSequence;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public List<HashMap<String, Object>> getList() {
		return list;
	}

	public void setList(List<HashMap<String, Object>> list2) {
		this.list = list2;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}
	/**
	 * 手动分页！
	 * @param result
	 * @param page 页码
	 * @param pageSize 分页大小
	 */
	public PageListDTO(ArrayList<HashMap<String, Object>> result,Integer page,Integer pageSize) {
		this.pageSize = pageSize;
		totalRecord = result.size();
		totalPage = new BigDecimal(totalRecord).divide(new BigDecimal(pageSize),0,BigDecimal.ROUND_CEILING).intValue();

		if(totalRecord < pageSize ) {
			totalPage = 1;
		}
		if(page > totalPage) {
			currentPage = totalPage;
			page = totalPage;
		}else {
			currentPage = page;
		}
		if(page == 1) {
			firstPage = true;
		}
		if(page == totalPage ) {
			lastPage = true;
		}
		
		Integer fromIndex = 0;
		if(page > 1) {
			fromIndex = (page - 1 )* pageSize;
		}
		Integer toIndex = fromIndex + pageSize - 1;

		if(totalRecord < pageSize) {
			fromIndex = 0;
			toIndex = totalRecord;
		}
		if(totalRecord <= toIndex) {
			toIndex = totalRecord;
		}else {
			toIndex = toIndex+1;
		}

		list = result.subList(fromIndex, toIndex);
		listSize = list.size() ;
		
		for (int j = 1; j <= scale; j++) {
			if(page - j >0) {
				previousPageNoSequence.add(page - j);
			}
			if(page + j <= totalPage) {
				nextPageNoSequence.add(page + j);
			}
		 }
	}

	public Object getOtherData() {
		return otherData;
	}
	/**
	 * 额外的数据
	 * @param otherData
	 */
	public void setOtherData(Object otherData) {
		this.otherData = otherData;
	}
}
