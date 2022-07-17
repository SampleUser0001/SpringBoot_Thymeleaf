package sample.webapp.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.ArrayList;

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
	

}