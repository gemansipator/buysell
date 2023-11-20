package site.javadev.buysell.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import site.javadev.buysell.services.ProductService;

@Controller
@RequiredArgsConstructor //автоматически неявно прописывает конструкторы
public class ProductController {
    private final ProductService productService;



    @GetMapping("/")
    public String products(Model model){
        model.addAttribute("products", productService.listProducts());
        return "products";

    }

}
