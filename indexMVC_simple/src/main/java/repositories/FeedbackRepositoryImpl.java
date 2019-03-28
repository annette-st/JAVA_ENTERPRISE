package repositories;
import models.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FeedbackRepositoryImpl implements FeedbackRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String SQL_GET_ALL_FEEDBACK =
            "select first_name, content from customers c inner join feedback f on c.id=f.customer_id";

    private RowMapper<Feedback> rowMapperFeedback = (rs, i) -> Feedback.builder()
                    .first_name(rs.getString("first_name"))
                    .content((rs.getString("content")))
                    .build();

    public List<Feedback> showAllFeedback() {
        return jdbcTemplate.query(SQL_GET_ALL_FEEDBACK, rowMapperFeedback);
    }

}
