package com.Softwareproject.StoreController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Softwareproject.StoreRepository.StoreRepository;
import com.Softwareproject.Stores.Store;

@Controller
public class StoreController {
	@Autowired
	private StoreRepository repp;
	@GetMapping ("/addstore")
	public String add_store(Model model)
	{
		model.addAttribute("store", new Store());
		return "addstore";
	}
	
	@PostMapping ("/addstore")
	public String add_store1(Model model,@ModelAttribute Store store)
	{
		model.addAttribute("store", new Store());
		repp.save(store);
		return "addstore";
	}


}
