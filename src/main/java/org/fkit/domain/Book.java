package org.fkit.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
@XmlRootElement
public class Book implements Serializable {
    private String num;
    private String name;
    private String author;

    public Book() {
    }


    public Book(String num, String name, String author) {
        this.num = num;
        this.name = name;
        this.author = author;
    }

    public String getNum() {
        return num;
    }

    @XmlElement
    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }
    @XmlElement
    public void setAuthor(String author) {
        this.author = author;
    }
}
