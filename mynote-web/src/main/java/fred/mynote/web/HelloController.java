package fred.mynote.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzf
 * @date 2018/6/15 14:46.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/index")
    public Object index() {

        return "hello";
    }
}
