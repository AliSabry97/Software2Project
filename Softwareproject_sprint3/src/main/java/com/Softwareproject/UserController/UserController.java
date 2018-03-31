package com.Softwareproject.UserController;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Softwareproject.Repositories.UserRepository;
import com.Softwareproject.Stores.Store;
import com.Softwareproject.User.User;
import com.Softwareproject.products.Product;

@Controller
public class UserController {
	@Autowired
	private UserRepository repo;
	
	@GetMapping("/Signin")
	
	public String sign_in(Model model)
	{
		model.addAttribute("signin_user", new User());
		return "Signin";
	}
		
	
	@PostMapping("/Signin")
		public String check_information(Model model,@ModelAttribute User signin_user,HttpServletRequest session)
		{
		
		model.addAttribute("signin_user", new User());
		Iterable<User> user_iterable=repo.findAll();
		
		for(User obj: user_iterable)
		{
			if(signin_user.getUsername().equals(obj.getF_name()) &&signin_user.getSignin_password().equals(obj.getPassword()))
			{
				session.getSession().setAttribute("user", signin_user.getUsername());
			
				if(obj.getType_of_user().equals("Normal User"))
			
					return "normaluserpage";
				
				else if (obj.getType_of_user().equals("Store owner"))
				{	
					Store stor=new Store();
					return "storeowner";
					
				}
					
				else
					return "done";
		}
		}
		return "Signin";
		}

	
	@GetMapping("/Signup")
	
	public String showsignup(Model model)
	{
	 model.addAttribute("user",new User());
		return "Signup";
	}
	@PostMapping("/Signup")
	public String sign_up(Model model,@ModelAttribute User user )
	{
		repo.save(user);
		model.addAttribute("user", new User());
		return "Signup";
	}
	

@GetMapping("/users_stat")

public String users_stat1(Model model)
{
	int sum=0;
	double average=0;
	Iterable<User> my_users=repo.findAll();
	List<User> users=new ArrayList<>();
	for (User user: my_users)
	{
		users.add(user);
	}
	sum=users.size();
	average=sum/users.size();
	model.addAttribute("sum",sum);
	model.addAttribute("average", average);
	return "users_stat";
}

	
	}
