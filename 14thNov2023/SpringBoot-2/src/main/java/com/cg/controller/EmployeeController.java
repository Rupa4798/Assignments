package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cg.entity.Employee;
import com.cg.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@RequestMapping("/employee")
	public String viewHomePage(Model model) {
		System.out.println("Hello");
		List<Employee> listproducts = service.listAll();
		model.addAttribute("listproducts", listproducts);
		for(Employee p : listproducts) {
			System.out.println("data "+ p.getId()+p.getCompany());
		}
		return "index";
	}
	@RequestMapping("/new")
	public String showNewProduct(Model model) {
		Employee e=new Employee();
		model.addAttribute("employee", e);
		return "new_employee";
	}
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		
		
		service.save(employee);
		return "redirect:/employee";
		
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name="id") Long id) {
		service.delete(id);
		return "redirect:/employee";
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name="id") Long id) {
		
		ModelAndView mav=new ModelAndView("edit_employee");
		Employee employee=service.get(id);
		mav.addObject("employee", employee);
		return mav;
	}

}
