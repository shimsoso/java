package miniproject;

import java.util.ArrayList;

public interface IShop {
	/*
	 * setTitle : ���θ��� ����ޱ� 
	 * =================================================
	 */
	public abstract void setTitle(String title);
	/*
	 * genUser : ����������� ����ϱ� 
	 * =================================================
	 */
	public abstract void genUser();
	/*
	 * getProduct : ��ǰ������ ����ϱ�
	 * =================================================
	 */
	public abstract void getProduct();
	/*
	 * start : ���θ��� ��ü����� ���� �ó����� �ֱ�
	 * =================================================
	 */
	public abstract void start();
}
