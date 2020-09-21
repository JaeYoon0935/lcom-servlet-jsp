package com.lcomputerstudy.testmvc.vo;

import com.lcomputerstudy.testmvc.service.UserService;


// 면접 때, 이 부분(페이징처리)에 대한 질문에 대해 설명을 잘 하지 못함.
public class Pagination {
	int userCount; //user테이블에 등록 된 총 user 수
	int page; //현재 페이지번호
	int pageNum; //userCount/page = 화면에 나타낼 user index번호
	int startPage; //paginatoin의 시작(ex 1, 6, 11)
	int endPage; //pagination의 끝(ex 5, 10, 15)
	int lastPage; //(userCount/화면에 표시할 갯수), pagination 마지막 번호
	int prevPage; //pagination의 이전 목록
	int nextPage; //pagination의 다음 목록
	public static final int pageUnit=5; // 한번에 불러 올 pagination 수
	public static final int perPage=3; //한번에 불러 올 userCount 수
	UserService userService =null;
	
	public Pagination() {
		
	}
	
	public Pagination(int page) {
	this.page = page;
	userService = UserService.getInstance();
	userCount = userService.getUsersCount();
	startPage = ((page-1)/pageUnit)*pageUnit+1;
	lastPage = (int)Math.ceil(userCount /(float)perPage);
	endPage = startPage+pageUnit-1;
	endPage = endPage < lastPage ? endPage : lastPage;
	prevPage=(endPage-pageUnit);
	nextPage=(startPage+pageUnit);
		
		
	}

	public int getUserCount() {
		return userCount;
	}

	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
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

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public int getPrevPage() {
		return prevPage;
	}

	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public static int getPageunit() {
		return pageUnit;
	}

	public static int getPerpage() {
		return perPage;
	}
	
	
	
	
	
}
