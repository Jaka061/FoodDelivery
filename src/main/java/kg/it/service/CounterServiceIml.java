package kg.it.service;

import kg.it.entity.Counter;
import kg.it.repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CounterServiceIml implements CounterService {
    @Autowired
    private CounterRepository counterRepository;
    @Override
    public Counter create(Counter counter) {
        return counterRepository.save(counter);
    }
    @Override
    public List<Counter> getAll() {
        return counterRepository.findAll();
    }
}
