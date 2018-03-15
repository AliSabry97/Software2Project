package com.Softwareproject.Brandcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Softwareproject.Brandrepository.Brandrepository;
import com.Softwareproject.Brands.Brand;
import com.Softwareproject.products.Product;

@Controller
public class Brandcontroller {
	@Autowired
	Brandrepository rep;
	@GetMapping("/AddBrand")
	public String add_brand(Model model)
	{
		model.addAttribute("brand", new Brand());
		return "AddBrand";
		
	}
	@PostMapping("/AddBrand")
	public String add_product1(Model model,@ModelAttribute Brand brand)
	{	
		model.addAttribute("brand", new Product());
		rep.save(brand);
		return "AddBrand";
		
	}
	

}
