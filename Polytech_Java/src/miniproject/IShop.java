package miniproject;

import java.util.ArrayList;

public interface IShop {
	/*
	 * setTitle : 쇼핑몰의 제목달기 
	 * =================================================
	 */
	public abstract void setTitle(String title);
	/*
	 * genUser : 사용자정보를 등록하기 
	 * =================================================
	 */
	public abstract void genUser();
	/*
	 * getProduct : 상품정보를 등록하기
	 * =================================================
	 */
	public abstract void getProduct();
	/*
	 * start : 쇼핑몰의 전체기능을 위한 시나리오 넣기
	 * =================================================
	 */
	public abstract void start();
}
