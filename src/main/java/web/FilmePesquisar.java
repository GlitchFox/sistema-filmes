/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 08/05/2019
Objetivo sucinto do programa: 
Refer�ncia ao enunciado/origem do exerc�cio: https://www.youtube.com/user/educandoweb
*/

package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/filme/pesquisar")
public class FilmePesquisar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String DESTINO = "/filme/formPesquisar.jsp";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher(DESTINO).forward(request, response);
	}
}