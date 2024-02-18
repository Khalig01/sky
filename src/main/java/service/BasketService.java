package service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {
    private final Basket backet;
    public BasketService(Basket basket){
        this.backet=basket;
    }
    public void add(Integer... ids){
        backet.add(ids);
    }
    public List<Integer> getAll(){
        return backet.getAll();

    }
}
