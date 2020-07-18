package kg.it.controller;

import kg.it.entity.Counter;
import kg.it.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/counter")
public class CounterController {
  @Autowired
    private CounterService counterService;

    @PostMapping
    public Counter create(){
        if(counterService.getAll() == null){
            Counter counter = new Counter(1);
            return counterService.create(counter);
        }
        int a = counterService.getAll().size();
        Counter counter = new Counter(a+1);
        return counterService.create(counter);
    }
    @GetMapping("/post")
    public Integer get(){
        return counterService.getAll().size();
    }

    @GetMapping("/report")
    public List<Counter> getAll(){
        return counterService.getAll();
    }
}
