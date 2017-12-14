package guru.springframework.spring5recipeapp.controllers;

import com.sun.org.apache.xpath.internal.SourceTree;
import guru.springframework.spring5recipeapp.domain.Category;
import guru.springframework.spring5recipeapp.domain.UnitOfMeasure;
import guru.springframework.spring5recipeapp.repositories.CategoryRepository;
import guru.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.management.OperatingSystemMXBean;
import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        System.out.println("some message to say....");

        Optional<Category> category = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Cup");

        System.out.println("cat id is" + category.get().getiD());
        System.out.println("uni id is" + unitOfMeasure.get().getiD());


        return "index";
    }
}
