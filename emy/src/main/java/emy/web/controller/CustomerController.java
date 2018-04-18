package emy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import emy.entity.Customer;
import emy.web.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/list")
	public String listCustomer(Model theModel) {
		List<Customer> customers= customerService.getCustomers();
		theModel.addAttribute("customers",customers);

		return "list-customer";
	}
	
	@RequestMapping(value="/addCustomer",method=RequestMethod.GET)
	public String addCustomer(Model theModel) {
		theModel.addAttribute("customer",new Customer());
		return "add-customer";
	}
	
	@RequestMapping(value="/addCustomer",method=RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer") Customer customer,BindingResult result) {
		customerService.save(customer);
		return "redirect:/customer/list.html";
	}
	
	@RequestMapping(value="/showFormForUpdate",method=RequestMethod.GET)
	public String showFormForUpdate(@RequestParam("customerId") int id,Model theModel) {
		Customer customer = customerService.getCustomer(id);
		theModel.addAttribute("customer",customer);
		return "add-customer";
	}
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String deleteCustomer(@RequestParam("customerId") int id,Model theModel) {
		customerService.delete(id);
		return "redirect:/customer/list.html";
	}
}
