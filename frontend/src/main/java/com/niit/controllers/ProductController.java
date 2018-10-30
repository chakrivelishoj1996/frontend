package com.niit.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.configuration.DBconfig;
import com.niit.daoimpl.ProductDaoImpl;
import com.niit.model.Product;
import com.niit.services.ProductService;
import com.niit.servicesimpl.ProductServiceImpl;



@Controller
public class ProductController 
{
@Autowired
private ProductService ps;

ApplicationContext ac = new AnnotationConfigApplicationContext(DBconfig.class, ProductDaoImpl.class, ProductServiceImpl.class);
ProductService pds = (ProductService)ac.getBean("productServiceImpl");

public ProductController() {
System.out.println("Product Controller Bean has been created");
}
@RequestMapping(value="/all/getallproducts/")
public String getAllProducts(Model m)
{
List<Product> products = ps.getAllProducts();
m.addAttribute("product",products);
return "listofproduct";
}
@RequestMapping(value="/all/getproducts")
public String getProduct(@RequestParam int id,Model m)
{
Product products = ps.selectProducts(id);
m.addAttribute("productAttr",products);
return "viewproduct";
}
@RequestMapping(value="/admin/deleteproduct")
public String deleteProduct(@RequestParam int id,Model m)
{
   ps.deleteProducts(id);
return "redirect:/all/getallproducts/";
}
@RequestMapping(value="/admin/getproductform")
public String getProductForm(Model model)
{
Product p=new Product();
model.addAttribute("product",p);
 return "Productform";
}
@RequestMapping(value="/admin/addproduct")
public String addProduct(@Valid @ModelAttribute Product product, BindingResult result)
{
if(result.hasErrors())
{
return "Productform";
}
pds.addProduct(product);
return "redirect:/all/getallproducts/";
}
@RequestMapping(value="/admin/getupdateproductform")
public String getUpdateProductForm(@RequestParam int id, Model model)
{
Product p=ps.selectProducts(id);
model.addAttribute("product",p);
 return "updateproductform";
}
@RequestMapping(value="/admin/updateproduct")
public String updateProduct(@Valid @ModelAttribute Product product, BindingResult result)
{
if(result.hasErrors())
{
return "updateproductform";
}
pds.updateProduct(product);
return "redirect:/all/getallproducts/";
}
}
