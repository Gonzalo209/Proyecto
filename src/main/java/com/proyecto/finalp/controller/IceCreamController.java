package com.proyecto.finalp.controller;

import com.proyecto.finalp.service.IceCreamService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import com.proyecto.finalp.model.IceCream;


@Controller
@RequestMapping("/list-todos")
@SessionAttributes("name")
public class IceCreamController {

    private IceCreamService iceCreamService;

    public IceCreamController(IceCreamService iceCreamService) {

        this.iceCreamService = iceCreamService;

    }

    @GetMapping
    public String listAllTodos(ModelMap model) {

        List<IceCream> todos = iceCreamService.findByUsername("Gonzalo");

        model.put("todos", todos);

        return "listTodos";

    }

    @GetMapping("/add-todo")
    public String showNewTodo() {

        return "todo";

    }

    @PostMapping("/add-todo")
    public String addNewTodo(@RequestParam String flavor, @RequestParam String capacity, @RequestParam String price, ModelMap model) {

        iceCreamService.add(flavor, capacity, price);

        return "redirect:/list-todos";

    }

    @PostMapping("/delete-todo")
    public String deleteTodo(@RequestParam int id) {

        iceCreamService.deleteById(id);

        return "redirect:/list-todos";

    }

    @GetMapping("/update-todo")
    public String showUpdateTodo() {

        return "updateTodo";

    }

    @PostMapping("/update-todo")
    public String updateTodo(@RequestParam int id, @RequestParam String capacity, @RequestParam String price, ModelMap model) {

        IceCream iceCream = iceCreamService.findById(id);

        iceCream.setCapacity(capacity);
        iceCream.setPrice(price);

        model.addAttribute("todo", iceCream);

        return "redirect:/list-todos";

    }

}