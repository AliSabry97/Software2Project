package com.Softwareproject.ProductController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.Softwareproject.ProdcutRepositroy.ProductRepository;
import com.Softwareproject.products.Product;
@Controller
public class ProductController {
	@Autowired
	ProductRepository repoo;
	@GetMapping("/addproduct")
	public String add_product(Model model)
	{
		model.addAttribute("product", new Product());
		return "addproduct";
		
	}
	@PostMapping("/addproduct")
	public String add_product1(Model model,@ModelAttribute Product product)
	{	
		model.addAttribute("product", new Product());
		repoo.save(product);
		return "addproduct";
		
	}
	
	
	@GetMapping("/productview")
	public String	show_all_products(Model model)
	{
		Iterable<Product> products=repoo.findAll();
		List<Product> products_list=new ArrayList<Product>();
		for(Product obj: products)
		{
			products_list.add(obj);
			}
		model.addAttribute("products", products_list);
		return "productview";
		
	}
}
