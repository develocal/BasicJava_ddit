package controller;

import java.util.Scanner;

import service.BoardService;
import service.BoardServiceImpl;
import service.CartService;
import service.CartServiceImpl;
import service.CategoryService;
import service.CategoryServiceImpl;
import service.PayService;
import service.PayServiceImpl;
import service.UserService;
import service.UserServiceImpl;
import data.Session;

public class Controller {

	UserService userService = UserServiceImpl.getInstance();
	CartService cartService = CartServiceImpl.getInstance();
	CategoryService categoryService = CategoryServiceImpl.getInstance();
	PayService payService = PayServiceImpl.getInstance();
	BoardService boardService = BoardServiceImpl.getInstance();
	
	public static void main(String[] args) {

		new Controller().begin();

	}

	private void begin() {
		Scanner s = new Scanner(System.in);

		int menu;

		do {
			if(Session.loginUser == null)
			{
				System.out.println("---------- MENU ----------");
				System.out.println("1. ȸ������");
				System.out.println("2. �α��� ");
				System.out.println("3. �����ϱ�");
				System.out.println("4. ��ǰ �˻�");
				System.out.println("-------------------------");
				System.out.println("�������ּ��� >>");
			}
			else
			{
				loginMain();
			}
			
			menu = Integer.parseInt(s.nextLine());
			System.out.println(); //���� �α� ���ؼ� ��� br.20191231 add
			
			switch (menu) {
			case 1:
				userService.join();
				break;
				
			case 2:
				userService.login();
				break;
				
			case 3:
				categoryService.printCategoryList();
				break;
				
			case 4:
				categoryService.searchCategoryWithKeyword("");
				break;
				
			default :
				break;

			}
		} while(menu != 0); 
		
		if(menu == 0)		//log-out -> begin()
			begin();
	}	
	
	
	private void loginMain(){ //br 20191226 add
		Scanner s = new Scanner(System.in);
		
		 int menu;
		 
		 do{
			System.out.println("---------- MENU ----------");
			System.out.println("1. My Page");
			System.out.println("2. �����ϱ�");
			System.out.println("3. ��ǰ �˻�");
			System.out.println("4. ��ü �ı� ����"); //�����߰�
			System.out.println("5. �Ǹ��� ��ǰ ����ϱ�");
			System.out.println("0. �α׾ƿ�");
			

			System.out.println("-------------------------");
			System.out.println("�������ּ��� >>");
						 
			 menu = Integer.parseInt(s.nextLine());
			 System.out.println(); //���� �α� ���ؼ� ��� br.20191231 add
			 
			 switch (menu) {
				case 1:
					userService.printMyPage();
					MyPage();
					break;
					
				case 2:
					categoryService.printCategoryList();
					shoppingMenu();
					break;
					
				case 3:
					categoryService.searchCategoryWithKeyword("");
					break;
					

				case 4://�ı� ��ü���
//					boardService.selectBoardList();
					boardService.boardListAll();
					break;

				case 5:
					categoryService.addCategory();
					break;
					
				case 0:
					System.out.println("Log-Out : Have a nice day!");
					Session.loginUser = null;
					break;

				default :
					break;

				}

			// if( menu == 3)
			// {
			// userService.printMyPage(); //br 20191226 add
			// loginMain();
			// break;
			// }
			// else if( menu == 0)
			// {
			// System.out.println("Have a nice day!");
			// begin();
			// break;
			// }

		} while (menu != 0);

		if (menu == 0) // log-out -> begin()
			begin();
	}
	
	private void shoppingMenu(){ //null 1231 add
		Scanner s = new Scanner(System.in);
		
		 int menu;
		 
		 do{
			System.out.println("---------- MENU ----------");
			System.out.println("1. ��ǰ �˻�");
			System.out.println("2. ��ٱ��� ���"); //�����ϱ�
			System.out.println("3. ���� ����"); //null 12.28 //�����ϱ�
			System.out.println("4. �Ǹ��� ��ǰ ����ϱ�");
			System.out.println("0. ����ȭ������");
			System.out.println("------------------------------");
			System.out.println("�������ּ��� >>");
						 
			 menu = Integer.parseInt(s.nextLine());
			 System.out.println(); //���� �α� ���ؼ� ��� br.20191231 add
			 
			 switch (menu) {
				case 1:
					categoryService.searchCategoryWithKeyword("");
					break;
					
				case 2:
					cartService.addToCart();
					break;
					
				case 3:
					payService.buying();
					break;
					
				case 4:
					categoryService.addCategory();
					break;
					
				case 0:
					break;

				default :
					break;

				}

		} while (menu != 0);

		if (menu == 0) // log-out -> begin()
			loginMain();
	}
	
	private void MyPage(){ //br 20191226 add
		Scanner s = new Scanner(System.in);
		
		 int menu;
		 
		 do{
			System.out.println("---------- MENU ----------");
			System.out.println("1. ��ٱ��� ����"); //My Page
			System.out.println("2. ���� ���� / �ı�"); //null 12.28 ////My Page
			System.out.println("3. ���� �ۼ��� �ı⺸��"); //�����߰� //My Page
			System.out.println("0. ���� ȭ��");
			System.out.println("-------------------------");
			System.out.println("�������ּ��� >>");
						 
			 menu = Integer.parseInt(s.nextLine());
			 System.out.println(); //���� �α� ���ؼ� ��� br.20191231 add
			 
			 switch (menu) {
				case 1:
					cartService.printCartList();
					break;
			
				case 2:
					PayList();
					break;
					
				case 3://���� �� �ı�
					boardService.selectMyBoardAndPrint();
					break;
					
				case 0:
					break;

				default :
					break;

				}

			// if( menu == 3)
			// {
			// userService.printMyPage(); //br 20191226 add
			// loginMain();
			// break;
			// }
			// else if( menu == 0)
			// {
			// System.out.println("Have a nice day!");
			// begin();
			// break;
			// }

		} while (menu != 0);

		if (menu == 0) // log-out -> begin()
			loginMain();
	}
	
	
	private void PayList(){ //br 20191226 add
		Scanner s = new Scanner(System.in);
		
		 int menu;
		 
		 do{
			System.out.println("---------- MENU ----------");
			System.out.println("1. ���� ���� ����");
			System.out.println("2. �ı⾲��");
			System.out.println("0. ���� ȭ��");
			System.out.println("-------------------------");
			System.out.println("�������ּ��� >>");
						 
			 menu = Integer.parseInt(s.nextLine());
			 System.out.println(); //���� �α� ���ؼ� ��� br.20191231 add
			 
			 switch (menu) {
				case 1:
					payService.payList();
					break;
					
				case 2:
					boardService.write();
					
					break;

				default :
					break;

				}

			// if( menu == 3)
			// {
			// userService.printMyPage(); //br 20191226 add
			// loginMain();
			// break;
			// }
			// else if( menu == 0)
			// {
			// System.out.println("Have a nice day!");
			// begin();
			// break;
			// }

		} while (menu != 0);

		if (menu == 0) // log-out -> begin()
			MyPage();
	}
	
	
	
	
	
	
	
}