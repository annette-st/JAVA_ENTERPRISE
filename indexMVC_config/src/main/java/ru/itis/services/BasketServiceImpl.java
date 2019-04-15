package ru.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itis.models.ProductName;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import ru.itis.repositories.AuthRepository;
import ru.itis.repositories.BasketRepositoryImpl;
import java.util.List;

@Component
public class BasketServiceImpl implements BasketService {

    private PasswordEncoder encoder;

    @Autowired
    private BasketRepositoryImpl basketRepository;

    @Autowired
    private AuthRepository authRepository;

    public BasketServiceImpl(BasketRepositoryImpl basketRepository, AuthRepository authRepository) {
        this.basketRepository = basketRepository;
        this.authRepository = authRepository;
        this.encoder = new BCryptPasswordEncoder();
    }

    public void add(Long userId, Long productId){
        basketRepository.add(userId, productId);
    }
    public void delete(Long userId, Long productId){
        basketRepository.delete(userId, productId);
    }
    public List<ProductName> getAllByUserId(Long userId) {
        return basketRepository.getAllByUserId(userId);
    }

}
