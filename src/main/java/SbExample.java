import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class SbExample {

    @RequestMapping("/")
    String home() {
        return "Hello there!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SbExample.class, args);
    }

}