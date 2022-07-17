package sample.webapp.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.ArrayList;

import sample.webapp.thymeleaf.model.DataModel;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="nameList", required=false) List<String> nameList, Model model) {
		nameList = new ArrayList<String>();
		nameList.add("World");
		nameList.add("Thymeleaf");
		
		model.addAttribute("nameList", nameList);
		return "greeting";
	}
	
	@GetMapping("/list")
	public String list(@RequestParam(name="dataList", required=false) List<DataModel> dataList, Model model) {
		dataList = new ArrayList<DataModel>();
		dataList.add(new DataModel(1, "hoge"));
		dataList.add(new DataModel(2, "piyo"));
		
		model.addAttribute("dataList", dataList);
		return "list";
	}

}