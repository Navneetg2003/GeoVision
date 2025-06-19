package com.myapp.p_23_maplocator.Controller;



import com.myapp.p_23_maplocator.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/mapp")
    public String map() {
        return "Mapp";
    }

    @GetMapping("/form")
    public String form() {
        return "form";
    }
}
