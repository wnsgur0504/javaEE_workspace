package com.model2.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model2.board.model.BoardDAO;
import com.model2.controller.Controller;
import com.model2.domain.Board;

public class EditController implements Controller{
	BoardDAO dao = new BoardDAO();
	
	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String board_id = request.getParameter("board_id");
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		Board board = new Board();
		board.setTitle(title);
		board.setWriter(writer);
		board.setContent(content);
		board.setBoard_id(Integer.parseInt(board_id));
		
		//3�ܰ�: ����ó��
		int result = dao.update(board);
		
		//4�ܰ� : ���� �� ������������, ������ ������ �����ϱ⿡ ������ ���� �ִ�.
		request.setAttribute("board",board);
	}
	@Override
	public String getResultView() {
		return "/view/board/detail";
	}
	@Override
	public boolean isForward() {
		return true;
	}

}