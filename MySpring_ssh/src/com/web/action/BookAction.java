package com.web.action;


import java.io.File;
import java.util.Date;




import com.domain.Book;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.BookService;
import com.servlet.FileUploadUtil;



//图书管理
public class BookAction extends ActionSupport implements ModelDriven<Book>{
	
	private File myFile;
	private String myFileFileName;
	private String myFileContentType;

	
	private Book book = new Book();

	@Override
	public Book getModel() {
		return book;
	}
	
	private BookService bookService;

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	//业务方法---添加
	public String add(){
		
		System.out.println("添加图书...");
		System.out.println(myFileFileName);
		String imageFileName = new Date().getTime()+FileUploadUtil.getExtention(myFileFileName);
		System.out.println(imageFileName);
		book.setSrc(imageFileName);
		FileUploadUtil.imageupload(this.getMyFile(),imageFileName);

		bookService.saveBook(book);
		return NONE;
	}



	public File getMyFile() {
		return myFile;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public String getMyFileFileName() {
		return myFileFileName;
	}

	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}

	public String getMyFileContentType() {
		return myFileContentType;
	}

	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

	
}
