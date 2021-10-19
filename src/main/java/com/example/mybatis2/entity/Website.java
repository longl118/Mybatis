package com.example.mybatis2.entity;


public class Website {
    private int id;
    private String name;
    private String url;
    private int alexa;
    private String country;

    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String  getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public String getUrl(){
        return url;
    }
    public void setUrl(){
        this.url = url;
    }
    public int getAlexa(){
        return alexa;
    }
    public void setAlexa(){
        this.alexa = alexa;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(){
        this.country = country;
    }
    @Override
    public String toString() {
        return "WebSite{" +
                "name=" + name +
                ", url='" + url + '\'' +
                ", Alexa='" + alexa + '\'' +
                ",country=" + country + '\'' +
                '}';
    }
}

