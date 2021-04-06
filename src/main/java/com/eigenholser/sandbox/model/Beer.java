package com.eigenholser.sandbox.model;

import java.util.List;

public class Beer {
    private String brewers_tips;
    private Float ph;
    private Integer target_og;
    private Integer ibu;
    private Integer srm;
    private Integer id;
    private Integer target_fg;
    private Integer abv;
    private Integer attenuation_level;
    private List<String> food_paring;
    private Ingredients ingredients;
    private Integer ebc;
    private String first_brewed;
    private String contributed_by;
    private Method method;
    private String name;
    private String tagline;
    private Volume volume;
    private String image_url;
    private BoilVolume boil_volume;
    private String description;

    public Beer() {

    }

    public String getBrewers_tips() {
        return brewers_tips;
    }

    public Float getPh() {
        return ph;
    }

    public Integer getTarget_og() {
        return target_og;
    }

    public Integer getIbu() {
        return ibu;
    }

    public Integer getSrm() {
        return srm;
    }

    public Integer getId() {
        return id;
    }

    public Integer getTarget_fg() {
        return target_fg;
    }

    public Integer getAbv() {
        return abv;
    }

    public Integer getAttenuation_level() {
        return attenuation_level;
    }

    public List<String> getFood_paring() {
        return food_paring;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public Integer getEbc() {
        return ebc;
    }

    public String getFirst_brewed() {
        return first_brewed;
    }

    public String getContributed_by() {
        return contributed_by;
    }

    public Method getMethod() {
        return method;
    }

    public String getName() {
        return name;
    }

    public String getTagline() {
        return tagline;
    }

    public Volume getVolume() {
        return volume;
    }

    public String getImage_url() {
        return image_url;
    }

    public BoilVolume getBoil_volume() {
        return boil_volume;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "brewers_tips='" + brewers_tips + '\'' +
                ", ph=" + ph +
                ", target_og=" + target_og +
                ", ibu=" + ibu +
                ", srm=" + srm +
                ", id=" + id +
                ", target_fg=" + target_fg +
                ", abv=" + abv +
                ", attenuation_level=" + attenuation_level +
                ", food_paring=" + food_paring +
                ", ingredients=" + ingredients +
                ", ebc=" + ebc +
                ", first_brewed='" + first_brewed + '\'' +
                ", contributed_by='" + contributed_by + '\'' +
                ", method=" + method +
                ", name='" + name + '\'' +
                ", tagline='" + tagline + '\'' +
                ", volume=" + volume +
                ", image_url='" + image_url + '\'' +
                ", boil_volume=" + boil_volume +
                ", description='" + description + '\'' +
                '}';
    }
}