package com.lcomputerstudy.testmvc.vo;

import com.lcomputerstudy.testmvc.service.UserService;


// ���� ��, �� �κ�(����¡ó��)�� ���� ������ ���� ������ �� ���� ����.
public class Pagination {
	int userCount; //user���̺� ��� �� �� user ��
	int page; //���� ��������ȣ
	int pageNum; //userCount/page = ȭ�鿡 ��Ÿ�� user index��ȣ
	int startPage; //paginatoin�� ����(ex 1, 6, 11)
	int endPage; //pagination�� ��(ex 5, 10, 15)
	int lastPage; //(userCount/ȭ�鿡 ǥ���� ����), pagination ������ ��ȣ
	int prevPage; //pagination�� ���� ���
	int nextPage; //pagination�� ���� ���
	public static final int pageUnit=5; // �ѹ��� �ҷ� �� pagination ��
	public static final int perPage=3; //�ѹ��� �ҷ� �� userCount ��
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
