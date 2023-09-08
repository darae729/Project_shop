package org.sp.springapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.sp.springapp.domain.Gallery;
import org.sp.springapp.domain.GalleryImg;
import org.sp.springapp.exception.FileException;
import org.sp.springapp.exception.GalleryException;
import org.sp.springapp.exception.GalleryImgException;
import org.sp.springapp.model.gallery.GalleryService;
import org.sp.springapp.util.FileManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

//갤러리와 관련된 요청을 처리하는 하위 컨트롤러
@Controller
public class GalleryController {

	///컨트롤러가 직접 DAO를 다루게 될 경우에 트랙잭션 처리까지 부담한다거나
	//Model part 업무를 너무 전문적으로 처리하게 된다.
	//컨트롤러와 모델의 업무 경계가 모호해지므로 즉, 코드의 분리가 안되므로
	//추후 비슷한 업무 시 코드를 분리해놓지 않았기 때문에 코드의 재사용성이 떨어진다..
	@Autowired
	private GalleryService galleryService;
	
	@Autowired
	private FileManager fileManager;
	
	//게시판 목록 요청 처리
	@RequestMapping(value = "/gallery/list", method=RequestMethod.GET)
	public ModelAndView getList() {
		//3단계 : 일시키기
		
		//4단계 : 목록저장
		ModelAndView mav = new ModelAndView("gallery/list");
		
		return mav;
	}
	
	//글쓰기 폼 요청
	@RequestMapping(value = "/gallery/registform", method=RequestMethod.GET)
	public String getForm() {
		
		return "gallery/regist";
	}
	
	//글쓰기 요청 처리
	@RequestMapping(value = "/gallery/regist", method=RequestMethod.POST)
	public ModelAndView regist(Gallery gallery, HttpServletRequest request) {
		//3단계 : 오라클에 글 등록 + 파일 업로드 + 
//		System.out.println("title =" +gallery.getTitle());
//		System.out.println("writer =" +gallery.getWriter());
//		System.out.println("content =" +gallery.getContent());
		
		MultipartFile[] photo=gallery.getPhoto();
		System.out.println("넘겨받은 파일의 수는"+photo.length);
		
		
		//jsp의 application 내장객체는 서블릿 api에서 ServletContext 이다
		//따라서 이 객체를 얻기 위해 HttpSession을 얻어야 한다.
		ServletContext context = request.getSession().getServletContext();
		String path=context.getRealPath("/resources/data/");
		System.out.println("파일이 저장될 풀 경로는" +path);
		
		List<GalleryImg> imgList=new ArrayList<GalleryImg>(); //새롭게 생성한 파일명이 누적될 곳
		
		for(int i=0;i<photo.length;i++) {
			String filename=photo[i].getOriginalFilename();			
			String name=fileManager.save(path, filename, photo[i]);
			
			GalleryImg galleryImg = new GalleryImg(); //empty
			galleryImg.setGallery(gallery); //이 시점의 gallery DTO에는 아직 gallery_idx는 0인 상태
			galleryImg.setFilename(filename);
			
			imgList.add(galleryImg); //새로운 이름을 List에 적재		
		}
		
		//Gallery DTO에 GalleryImg 들을 생성하여 List로 넣어두기
		gallery.setGalleryImgList(imgList);
		
		//서비스에서 예외가 발생했을 땐 스프링의 컨트롤러는 예외를 감지하는 이벤트가 발생함..
		//이때 이 이벤트를 처리할 수 있는 메서드를 정의해놓고 개발자가 알맞는 에러 페이지 및 메시지를 구성
		galleryService.regist(gallery); //글 등록 요청
		
		return null;
	}
	
	//어떠한 예외가 발생했을 때 어떤 처리를 할지 아래의 메서드에서 로직 작성..
	@ExceptionHandler(FileException.class)
	public ModelAndView handle(FileException e) {
		//jsp에서 에러 메시지를 보여줘야 하므로 요청은 유지가 되어야 한다
		//즉, 저장할 것이 있고 가져갈 것이 있다
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("e", e); //에러객체 저장
		mav.setViewName("error/result");
		
		return mav;
	}
	
	//어떠한 예외가 발생했을 때 어떤 처리를 할지 아래의 메서드에서 로직 작성..
	@ExceptionHandler(GalleryException.class)
	public ModelAndView handle(GalleryException e) {
		//jsp에서 에러 메시지를 보여줘야 하므로 요청은 유지가 되어야 한다
		//즉, 저장할 것이 있고 가져갈 것이 있다
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("e", e); //에러객체 저장
		mav.setViewName("error/result");
		
		return mav;
	}
	
	//어떠한 예외가 발생했을 때 어떤 처리를 할지 아래의 메서드에서 로직 작성..
	@ExceptionHandler(GalleryImgException.class)
	public ModelAndView handle(GalleryImgException e) {
		//jsp에서 에러 메시지를 보여줘야 하므로 요청은 유지가 되어야 한다
		//즉, 저장할 것이 있고 가져갈 것이 있다
		ModelAndView mav = new ModelAndView();
		mav.addObject("e", e); //에러객체 저장
		mav.setViewName("error/result");
		
		return mav;
	}
}


