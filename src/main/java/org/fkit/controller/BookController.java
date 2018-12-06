package org.fkit.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.codehaus.jackson.map.ObjectMapper;
import org.fkit.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.InputStream;

@Controller
@RequestMapping("/json")
public class BookController {

    @RequestMapping(value = "/{re}")
    public String redirect(@PathVariable String re)
    {

        return re;
    }


    @RequestMapping("/test")
    public void test(@RequestBody Book book,HttpServletResponse response) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String a = book.getName();
        String b = book.getNum();
        book.setAuthor("llll");
        System.out.print(book.getName());
//        System.out.print(book.getId());
        book.setNum("555");
        book.setName("555555");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(mapper.writeValueAsString(book));
    }

   @RequestMapping("/send")
    public void sendxml(@RequestBody Book  book){
        System.out.print(book);
   }


   @RequestMapping("/read")
    public @ResponseBody Book readxml(HttpServletRequest request) throws JAXBException {
       request.getServletPath();
       JAXBContext context = JAXBContext.newInstance(Book.class);
       Unmarshaller unbar = context.createUnmarshaller();
       InputStream is = this.getClass().getResourceAsStream("/book.xml");
       Book bbok3 = (Book) unbar.unmarshal(is);
        System.out.print(bbok3.getAuthor());
       return bbok3;
   }
}
