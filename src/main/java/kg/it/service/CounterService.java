package kg.it.service;

import kg.it.entity.Counter;

import java.util.List;

public interface CounterService {
     Counter create(Counter counter);
     List<Counter> getAll();
}
