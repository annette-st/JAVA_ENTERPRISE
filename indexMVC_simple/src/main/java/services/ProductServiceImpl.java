package services;

import models.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.FeedbackRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public List<Feedback> showFeedback() {
        return feedbackRepository.showAllFeedback();
    }
}
