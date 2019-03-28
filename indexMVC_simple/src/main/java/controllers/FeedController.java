package controllers;

import models.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import services.ProductService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class FeedController implements Controller {

    @Autowired
    private ProductService productService;

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        List<Feedback> feeds = productService.showFeedback();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jsp/index");
        modelAndView.addObject("feeds", feeds);
        return modelAndView;
    }

}
