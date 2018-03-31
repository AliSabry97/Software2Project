package com.Softwareproject.Brandcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Softwareproject.Brandrepository.Brandrepository;
import com.Softwareproject.Brands.Brand;
import com.Softwareproject.User.User;
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
	
	@GetMapping("/brands_stat")
	public String brand_stat1(Model model)
	{
		int sum=0;
		double average=0;
		Iterable<Brand> my_brands=rep.findAll();
		List<Brand> brands=new ArrayList<>();
		for (Brand brand: my_brands)
		{
			brands.add(brand);
		}
		sum=brands.size();
		average=sum/brands.size();
		model.addAttribute("sum",sum);
		model.addAttribute("average", average);
		return "brands_stat";
	}
	

}
