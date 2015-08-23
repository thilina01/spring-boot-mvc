package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.model.Item;

@Controller
public class ItemController {

	@RequestMapping("/item") 
	String showItem(Model model){
		Item item = new Item();
		item.setCode("001");
		item.setName("Test Item");
		model.addAttribute(item);
		return "itemPage";
	}
}
