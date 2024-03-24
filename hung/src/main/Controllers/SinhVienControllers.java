package main.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import Models.SinhVien;

@Controller
public class SinhVienControllers {
    static List<SinhVien> dsSinhVien=  new ArrayList<SinhVien>();
	static {
			dsSinhVien.add(new SinhVien("0001", "Gia Hưng"));
			dsSinhVien.add(new SinhVien("0002", "Nguyễn Ngọc"));
		 }
	//----------hết phần hard-code dữ liệu ---------------------	
	@GetMapping("/danhsachSV")
	public String listStudent(ModelMap mm) {
	    mm.addAttribute("dsSV", dsSinhVien);
	    return "index.html";
	}
}
