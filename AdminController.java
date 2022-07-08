package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	@Autowired
	HttpSession session;

	@Autowired
	BookRepository BookRepository;

	@Autowired
	UserRepository UserRepository;


	@RequestMapping(value = "/admin_rogin",method = RequestMethod.GET)
	public ModelAndView admin_rogin(ModelAndView mv) {

		mv.setViewName("admin_top");
		return mv;
		}

	@RequestMapping(value = "/admin_bksearch_result")
	public ModelAndView bookByBookName(
			@RequestParam(name = "bookName")String bookName,
			ModelAndView mv
					) {
		List<Book> bookList;
		if(bookName.isEmpty()) {
			bookList = BookRepository.findAll();
		} else {
			bookList = BookRepository.findByBookCode(Integer.parseInt(bookName));
		}
		if(bookList.size() == 0) {
			mv.addObject("msg","該当する教科書はありません");
		} else {
			mv.addObject("bookList",bookList);
		}
		mv.setViewName("admin_bksearch_result");
		return mv;
	}

	@RequestMapping(value = "/admin_bk_edit",method = RequestMethod.GET)
	public ModelAndView admin_bk_edit(ModelAndView mv,
			@RequestParam("stockId") int stockId,
			@RequestParam("isbn") int isbn,
			@RequestParam("bookName") String bookName,
			@RequestParam("auther") String auther,
			@RequestParam("catCode") int catCode,
			@RequestParam("qualCode") int qualCode,
			@RequestParam("price") int price,
			@RequestParam("stock") char stock,
			@RequestParam("note") String note,
			@RequestParam("sellerId") int sellerId,
			@RequestParam("buyerId") int buyerId,
			@RequestParam("bookCreate") int bookCreate,
			@RequestParam("sale") int sale,
			@RequestParam("image") String image
			) {
		mv.addObject("stockId",stockId);
		mv.addObject("isbn",isbn);
		mv.addObject("bookName",bookName);
		mv.addObject("auther",auther);
		mv.addObject("catCode",catCode);
		mv.addObject("qualCode",qualCode);
		mv.addObject("price",price);
		mv.addObject("stock",stock);
		mv.addObject("note",note);
		mv.addObject("sellerId",sellerId);
		mv.addObject("buyerId",buyerId);
		mv.addObject("bookCreate",bookCreate);
		mv.addObject("sale",sale);
		mv.addObject("image",image);
		mv.setViewName("admin_top");

		return mv;
	}


	@RequestMapping(value = "/admin_user_edit",method = RequestMethod.GET)
	public ModelAndView admin_user_edit(ModelAndView mv,
			@RequestParam("userId") int userId,
			@RequestParam("userName") String userName,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("tel") String tel,
			@RequestParam("postalCode") String postalCode,
			@RequestParam("address") String address,
			@RequestParam("userCreate") int userCreate,
			@RequestParam("admin") char admin,
			@RequestParam("quit") char quit
			) {
		mv.addObject("userId",userId);
		mv.addObject("userName",userName);
		mv.addObject("email",email);
		mv.addObject("password",password);
		mv.addObject("tel",tel);
		mv.addObject("postalCode",postalCode);
		mv.addObject("address",address);
		mv.addObject("userCreate",userCreate);
		mv.addObject("admin",admin);
		mv.addObject("quit",quit);
		mv.setViewName("admin_top");

		return mv;
	}



	ModelAndView admin_top(
			@RequestParam("adminId")String adminId,
			@RequestParam("adminPass")String adminPass,
			ModelAndView mv) {



		mv.setViewName("admin_top");



		return mv;
	}

}
