package seki.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ParameterTestController {

    // car/1/owner/seki
    //PathVariable
    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id,
                                     @PathVariable("username") String name,
                                     @PathVariable Map<String,Object> pv){

        Map<String,Object> map = new HashMap<>() ;
        map.put("id",id) ;
        map.put("name",name);
        map.put("pv",pv) ;
        return map ;
    }
}
