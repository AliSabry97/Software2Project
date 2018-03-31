package com.Softwareproject.ProductController;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	@GetMapping("/buyproduct")
	public String	buyproduct(Model model)
	{
		model.addAttribute("myproduct", new Product());
		return "buyproduct";
		
	}
	@PostMapping("/buyproduct")
	public String buy_product1(Model model,@ModelAttribute Product myproduct,HttpServletRequest session)
	{	
	
		model.addAttribute("myproduct",new Product());
		Iterable<Product> products_in=repoo.findAll();
	
		for(Product productt: products_in)
		{
			if (myproduct.getName().equals(productt.getName())&& (myproduct.getAmounts()<=productt.getAmounts()))
			{
				System.out.println(session.getSession().getAttribute("user"));
				return "success_buying";
				
			}
		}
		
		return "buyproduct";
	}
	
	
	@GetMapping("/showstatistics")
	public String	show_stat(Model model)
	{
		model.addAttribute("myproduct", new Product());
		return "showstatistics";
		
	}
	
	@GetMapping("/product_stat")
	public String	see_product_statistics(Model model)
	{
		int sum=0;
		double average=0;
	
		Iterable<Product> products=repoo.findAll();
		List<Product> products_list=new ArrayList<Product>();
		for(Product obj: products)
		{
			products_list.add(obj);
			}
		sum=products_list.size();
		average=sum/products_list.size();
		model.addAttribute("sum", sum);
		model.addAttribute("average",average);
		return "product_stat";
		
	}

}
