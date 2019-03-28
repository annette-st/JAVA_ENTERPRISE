package repositories;

import models.Feedback;
import java.util.List;

public interface FeedbackRepository {
    List<Feedback> showAllFeedback();
}
