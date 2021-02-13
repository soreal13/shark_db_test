package com.soreal.shark_db_test.site;


import com.soreal.shark_db_test.domain.Site;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class SiteController {

    private final SiteRepository siteRepository;

    @GetMapping("/home")
    @ResponseBody
    public String home() {
        return "Hello! World?.";
    }

    @GetMapping("/findall")
    public String findAll() {

        String result = "";

        for (Site site : siteRepository.findAll()) {
            result += site.toString() + "<br/>";
        }
        return result;
    }


    @GetMapping("/findbyarea1")
    public String findByArea1 (@RequestParam("area1") String area1) {
        String result = "";

        for (Site site : siteRepository.findByArea1(area1)) {
            result += site.toString() + "<br/>";
        }
        return result;
    }

}
