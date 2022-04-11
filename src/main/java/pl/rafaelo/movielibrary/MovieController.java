package pl.rafaelo.movielibrary;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController

public class MovieController {

    @GetMapping("/test")
    public int test() {
        return 1;
    }
}
