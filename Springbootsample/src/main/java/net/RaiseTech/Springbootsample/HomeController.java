package net.RaiseTech.Springbootsample;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class HomeController {
    @RequestMapping(value="/hello")
    @ResponseBody
    String hello(){
        return """
                <html>
                    <head><title>Hello</title></head>
                    <body>
                    <h1>お疲れ様です。</h1>
                    <h2>仕事は順調ですか？<br></h2>
                    <h3>現在時刻は%Sです。</h3>
                    </body>
                </html>
                """.formatted(LocalDateTime.now());

    }


}







