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
        return "Home";
    }
    @RequestMapping("/add")
    public String addCar(
            @RequestParam(required = false) String mark,
            @RequestParam(required = false) String carModel,
            @RequestParam(required = false) String engineType,
            @RequestParam(required = false) String capacity,
            @RequestParam(required = false) String productionDate,
            @RequestParam(required = false) String keyNumber,
            @RequestParam(required = false) String addictives,
            Model model)
        throws Exception{
        Car car = new Car(mark, carModel, engineType, capacity, productionDate, keyNumber, addictives, true);
        System.out.println(car);
        if(car.getMark()!=null)
        carRepo.save(car);
        model.addAttribute("car", car);
        return "Add";
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
    @RequestMapping("/delete")
    public String deleting(@RequestParam("id") Integer id, Model model){
        carRepo.deleteById(id);

        model.addAttribute("car", carRepo.findAll());
        return "List";
    }
    @RequestMapping("/search")
    public String searching(@RequestParam("criterion") String criterion, Model model){
        model.addAttribute("car", carRepo.findAllBymark(criterion));
        return "List";
    }

    @RequestMapping("/update")
    public String update(
            @RequestParam("id") Integer id,
            @RequestParam("mark") String mark,
            @RequestParam("carModel") String carModel,
            @RequestParam("engineType") String engineType,
            @RequestParam("capacity") String capacity,
            @RequestParam("productionDate") String productionDate,
            @RequestParam("keyNumber") String keyNumber,
            @RequestParam("addictives") String addictives,
            Model model)
            throws Exception {
                Car car = new Car(id, mark, carModel, engineType, capacity, productionDate, keyNumber, addictives, true);
        System.out.println(car);
        carRepo.save(car);
        model.addAttribute("car", carRepo.findAll());
        return "List";
    }

    @RequestMapping("/redirect")
    public String redirecting(
            @RequestParam("id") Integer id, Model model
    )
            throws Exception {
        System.out.println(carRepo.findById(id));
        model.addAttribute("car", carRepo.findById(id));
        return "Update";
    }


}