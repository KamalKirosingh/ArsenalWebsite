package uk.ac.city.aczh485.coursework.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * A controller to handle GET requests to the home and opera pages
 *
 */
@Controller
public class OperaController {


    /**
     * Controller method to handle a GET request to the / endpoint (homepage)
     *
     * @return ModelAndView returns a view constructed from index.html (no model required)
     */
    @RequestMapping (value = "/")
    public ModelAndView showHome(){
        return new ModelAndView("index");
    }

    /**
     * Controller method to handle a GET request to the /carmen endpoint
     *
     * @return ModelAndView returns a view constructed from carmen.html (no model required)
     */
    @RequestMapping(value = "/fixtures")
    public ModelAndView showFixtures(){
        return new ModelAndView("fixtures");
    }

    /**
     * Controller method to handle a GET request to the /flute endpoint
     *
     * @return ModelAndView returns a view constructed from flute.html (no model required)
     */
    @RequestMapping(value = "/stats")
    public ModelAndView showStats(){
        return new ModelAndView("stats");
    }

    /**
     * Controller method to handle a GET request to the /rigoletto endpoint
     *
     * @return ModelAndView returns a view constructed from rigoletto.html (no model required)
     */
    @RequestMapping(value = "/news")
    public ModelAndView showNews(){
        return new ModelAndView("news");
    }
}
