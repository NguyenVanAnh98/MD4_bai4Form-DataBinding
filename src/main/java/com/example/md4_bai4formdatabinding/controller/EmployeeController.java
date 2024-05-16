package com.example.md4_bai4formdatabinding.controller;

import model.Employee;
import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
//    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
    @GetMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());

        return "/create";
    }
    /*
    @GetMapping("/showForm1")
    public ModelAndView showForm1() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("employee", new Employee());
        return modelAndView;
    }
    */
    @ModelAttribute("employee2222")
    public Employee getEmployee() {
        return new Employee();
    }

    @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
    public String submit(Product product,Employee employee,String name, ModelMap model) {
        /*
        Employee employee = new Employee()
        employee.setId(Long.parseLong("text o input id"));
         */
//        model.addAttribute("name", employee.getName());
//        model.addAttribute("contactNumber",employee.getContactNumber());
//        model.addAttribute("id",employee.getId());
        return "/info";
    }


}
