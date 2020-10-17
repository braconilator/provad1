package br.usjt.ads20.atividaded1;

import java.io.Serializable;
/**
 Vinicius Braconi Solis 818123641
 */
public class Universidade implements Serializable, Comparable<Universidade> {
    private String name;
    private String country;
    private String alphaTwoCode;

    public String getWebPages() {
        return webPages;
    }

    public void setWebPages(String webPages) {
        this.webPages = webPages;
    }

    private String webPages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAlphaTwoCode() {
        return alphaTwoCode;
    }

    public void setAlphaTwoCode(String alphaTwoCode) {
        this.alphaTwoCode = alphaTwoCode;
    }


    @Override
    public int compareTo(Universidade universidade) {
        return getName().compareTo(universidade.getName());
    }
}
