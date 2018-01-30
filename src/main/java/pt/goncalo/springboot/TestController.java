package pt.goncalo.springboot;

import java.util.Collection;
import java.util.LinkedList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author silvagc
 */
@Controller()
@RequestMapping("Test")
public class TestController {
    public TestController(){
        
    }
    @GetMapping("/")
    public ResponseEntity<String> theOne(){
        return ResponseEntity.status(HttpStatus.CONFLICT).body("The body");
    }
    @DeleteMapping("/")
    public ResponseEntity<String> theOneDelete(){
        return ResponseEntity.status(HttpStatus.CONFLICT).body("The body");
    }
    @GetMapping("/list")
    public ResponseEntity<Collection<Bono>> list(){
        Collection<Bono> list = new LinkedList<Bono>();
        list.add(new Bono("asd",1));
        list.add(new Bono("asd2",2));
        return ResponseEntity.status(HttpStatus.CONFLICT).body(list);
    }
    
    private static class Bono{
        private String name;
        private long id;

        public Bono(String name, long id) {
            this.name = name;
            this.id = id;
        }

        
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }
        
    }
    
}
