package com.mycompany.entities;

import javax.json.bind.annotation.JsonbPropertyOrder;
import javax.json.bind.config.PropertyOrderStrategy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id", "title", "director", "imdbRef", "year", "metascore", "rottenTomatoes", "keyword1", "keyword2", "keyword3"
})
@XmlRootElement(name = "dvd")
@JsonbPropertyOrder(PropertyOrderStrategy.ANY)
public class DVD {
    @XmlAttribute
    private int id;
    private String title;
    private String director;
    private String imdbRef;
    private int year;
    private int metascore;
    private int rottenTomatoes;
    private String keyword1;
    private String keyword2;
    private String keyword3;
    
    
    public DVD() {
    }

    public DVD(int id, String title, String director, String imdbRef, int year, int metascore, int rottenTomatoes, String keyword1, String keyword2, String keyword3) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.imdbRef = imdbRef;
        this.year = year;
        this.metascore = metascore;
        this.rottenTomatoes = rottenTomatoes;
        this.keyword1 = keyword1;
        this.keyword2 = keyword2;
        this.keyword3 = keyword3;
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getImdbRef() {
        return imdbRef;
    }

    public void setImdbRef(String imdbRef) {
        this.imdbRef = imdbRef;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMetascore() {
        return metascore;
    }

    public void setMetascore(int metascore) {
        this.metascore = metascore;
    }

    public int getRottenTomatoes() {
        return rottenTomatoes;
    }

    public void setRottenTomatoes(int rottenTomatoes) {
        this.rottenTomatoes = rottenTomatoes;
    }

    public String getKeyword1() {
        return keyword1;
    }

    public void setKeyword1(String keyword1) {
        this.keyword1 = keyword1;
    }

    public String getKeyword2() {
        return keyword2;
    }

    public void setKeyword2(String keyword2) {
        this.keyword2 = keyword2;
    }

    public String getKeyword3() {
        return keyword3;
    }

    public void setKeyword3(String keyword3) {
        this.keyword3 = keyword3;
    }

    

}
