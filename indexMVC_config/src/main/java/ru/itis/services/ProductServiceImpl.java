package ru.itis.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.itis.forms.FeedbackForm;
import ru.itis.models.Category;
import ru.itis.models.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import ru.itis.models.ProductName;
import ru.itis.repositories.AuthRepository;
import ru.itis.repositories.ProductRepository;
import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    private PasswordEncoder encoder;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private AuthRepository authRepository;

    @Override
    public List<Feedback> showFeedback() {
        return productRepository.showAllFeedback();
    }

    @Override
    public void insertFeedback(FeedbackForm form) {

    }

    @Override
    public String get(Long productId) {
        return null;
    }

    @Override
    public List<ProductName> addProductToUserBasket(String cookieValue, Long productId) {
        return null;
    }

    public List<ProductName> showProducts() {
        return productRepository.getAllProducts();
    }

    public List<Category> showCategories() {
        return productRepository.getAllCategories();
    }

    public List<ProductName> showProductsByCatId(Long categoryId) {
        return productRepository.getAllByCategoryId(categoryId);
    }


}
