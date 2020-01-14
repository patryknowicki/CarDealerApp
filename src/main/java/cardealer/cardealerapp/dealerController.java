package cardealer.cardealerapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;

@Controller
public class dealerController {
    private carRepo carRepo;
    @Autowired
    public dealerController(carRepo carRepo){ this.carRepo = carRepo; }


    @RequestMapping("/home")
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

        for(Car car : carRepo.findAll()){
            System.out.println(car);
        }
        model.addAttribute("car", carRepo.findAll());
        return "List";
    }

    @RequestMapping("/DetailsCar")
    public String DetailsCar(Model model,Integer id){
                    for(Car car : carRepo.findAll()){
        System.out.println(car);
    }
        model.addAttribute("car", carRepo.findById(id));
        return "DetailsCar";
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

@Controller
    public class motorController{
        private motorcycleRepo motorcycleRepo;
        @Autowired
    public motorController(motorcycleRepo motorcycleRepo) { this.motorcycleRepo = motorcycleRepo; }

    @RequestMapping("/addmoto")
    public String addMoto(
            @RequestParam(required = false) String mark,
            @RequestParam(required = false) String motorcycleModel,
            @RequestParam(required = false) String version,
            @RequestParam(required = false) String destiny,
            @RequestParam(required = false) String engineType,
            @RequestParam(required = false) String capacity,
            @RequestParam(required = false) String engineOperationStrokes,
            @RequestParam(required = false) String productionDate,
            @RequestParam(required = false) String license,
            @RequestParam(required = false) String keyNumber,
            @RequestParam(required = false) String addictives,
            Model model)
        throws Exception{
            Motorcycle motorcycle = new Motorcycle(mark, motorcycleModel, version, destiny, engineType, capacity,
                    engineOperationStrokes, productionDate, license, keyNumber, addictives, true);
        System.out.println(motorcycle);
        if(motorcycle.getMark()!=null)
            motorcycleRepo.save(motorcycle);
        model.addAttribute("motorcycle", motorcycle);
        return "AddMoto";
    }

    @RequestMapping("/listmoto")
    public String listMoto(Model model){
        int i = 0;
        for(Motorcycle motorcycle : motorcycleRepo.findAll()){
            System.out.println(motorcycle);
        }
        model.addAttribute("motorcycle", motorcycleRepo.findAll());
        return "ListMoto";
    }
    @RequestMapping("/DetailsMoto")
    public String detailsMoto(Model model,Integer id){

        for(Motorcycle motorcycle : motorcycleRepo.findAll()){
            System.out.println(motorcycle);
        }
        model.addAttribute("motorcycle", motorcycleRepo.findById(id));
        return "DetailsMoto";
    }

    @RequestMapping("/deletemoto")
    public String deleting(@RequestParam("id") Integer id, Model model){
        motorcycleRepo.deleteById(id);

        model.addAttribute("motorcycle", motorcycleRepo.findAll());
        return "ListMoto";
    }

    @RequestMapping("/searchmoto")
    public String searching(@RequestParam("criterion") String criterion, Model model){
        model.addAttribute("motorcycle", motorcycleRepo.findAllBymark(criterion));
        return "ListMoto";
    }

    @RequestMapping("/redirectmoto")
    public String redirecting(
            @RequestParam("id") Integer id, Model model
    )
            throws Exception {
        System.out.println(motorcycleRepo.findById(id));
        model.addAttribute("motorcycle", motorcycleRepo.findById(id));
        return "UpdateMoto";
    }

    @RequestMapping("/updatemoto")
    public String updateMoto(
            @RequestParam("id") Integer id,
            @RequestParam("mark") String mark,
            @RequestParam("motorcycleModel") String motorcycleModel,
            @RequestParam("version") String version,
            @RequestParam("destiny") String destiny,
            @RequestParam("engineType") String engineType,
            @RequestParam("capacity") String capacity,
            @RequestParam("engineOperationStrokes") String engineOperationStrokes,
            @RequestParam("productionDate") String productionDate,
            @RequestParam("license") String license,
            @RequestParam("keyNumber") String keyNumber,
            @RequestParam("addictives") String addictives,
            Model model)
        throws Exception{
        Motorcycle motorcycle = new Motorcycle(id, mark, motorcycleModel, version, destiny, engineType, capacity,
                engineOperationStrokes, productionDate, license, keyNumber, addictives, true);
        System.out.println(motorcycle);
        motorcycleRepo.save(motorcycle);
        model.addAttribute("motorcycle", motorcycleRepo.findAll());
        return "ListMoto";
        }


}




    }