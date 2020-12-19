/*
 * �����Խ����� ��Ͽ�û�� ó���ϴ� ���� ��Ʈ�ѷ�
*/package com.model2.notice.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model2.controller.Controller;
import com.model2.notice.domain.Notice;
import com.model2.notice.model.NoticeDAO;

public class ListController implements Controller{
	NoticeDAO noticeDAO = new NoticeDAO();
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3�ܰ� : �˸´� ������ü���� �� ��Ų��.
		List list = noticeDAO.selectAll();
		
		//4�ܰ� : Ŭ���׳�Ʈ�� ������ ����� �ִٸ�, ��� ����(�׷��� ������Ʈ�ѷ���
		//����� �� ������
		//HttpSession session = request.getSession();
		request.setAttribute("noticeList", list);
		
	}
	
	@Override
	public String getResultView() {
		//5�ܰ� : �˸´� �並 �����ش�.
		return "/view/notice/list";
	}
	
	@Override
	public boolean isForward() {
		return true;
	}
}