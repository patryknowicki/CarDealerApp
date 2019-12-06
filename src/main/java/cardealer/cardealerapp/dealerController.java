package cardealer.cardealerapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class dealerController {
    private carRepo carRepo;
    @Autowired
    public dealerController(carRepo carRepo){
        this.carRepo = carRepo;
    }
    @RequestMapping("/")
    public String homePage(){
        return "Add";
    }
    @RequestMapping("/add")
    public String addCar(
            @RequestParam("mark") String mark,
            @RequestParam("carModel") String carModel,
            @RequestParam("engineType") String engineType,
            @RequestParam("capacity") String capacity,
            @RequestParam("productionDate") String productionDate,
            @RequestParam("keyNumber") String keyNumber,
            @RequestParam("addictives") String addictives,
            Model model)
        throws Exception{
        Car car = new Car(mark, carModel, engineType, capacity, productionDate, keyNumber, addictives, true);
        System.out.println(car);
        carRepo.save(car);
        model.addAttribute("car", car);
        return "View";
    }
    @RequestMapping("/list")
    public String list(Model model){
        int i = 0;
        for(Car car : carRepo.findAll()){
            System.out.println(car);
        }
        model.addAttribute("car", carRepo.findAll());
        return "List";
    }
}
