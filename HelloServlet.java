package helloPackage;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import def.Bean;
/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	String[][] sikaku = {{"基本情報技術者試験","7500"},{"CCNA","42900"},{"Java Silver","34300"},{"LinuC","16500"}};
	
	ArrayList<Bean> beans = new ArrayList<Bean>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
            for(int i = 0; i < 4; i++) {
			
			Bean bean = new Bean();
			
			bean.setSikenn(sikaku[i][0]);
			
			bean.setRyoukinn(sikaku[i][1]);
			
			beans.add(bean);
			
		}
		
        
            
		request.setAttribute("beans", beans);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/JSPFile.jsp");
			    
		dispatcher.forward( request, response ); 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 for(int i = 0; i < 4; i++) {
				
				Bean bean = new Bean();
				
				bean.setSikenn(sikaku[i][0]);
				
				bean.setRyoukinn(sikaku[i][1]);
				
				beans.add(bean);
				
			}
		
		ArrayList<Bean> bean_senntaku = new ArrayList<Bean>();
		
		String[] numbers = request.getParameterValues("senntaku");
		                                             
		
		for(int i = 0; i < numbers.length; i++) {
			
			int number = Integer.parseInt(numbers[i]);
			
		    bean_senntaku.add(beans.get(number));
			
		}
		
		request.setAttribute("bean_senntaku",  bean_senntaku);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP_postFile.jsp");
		
			    dispatcher.forward( request, response ); 
		
			    
		doGet( request,  response);
		
	}

}
