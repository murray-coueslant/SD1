class Animal {
    //data fields
    private String type; //mammals, reptiles, avian, etc...
    private String habitat; //water, forest, desert
    private String diet; //carnivore, herbivore, omnivore

    //methods

    public String getType(){
        return this.type;
    }

    public void setType(String inType){
        this.type = inType;
    }

    public String getHabitat(){
        return this.habitat;
    }

    public void setHabitat(String inHabitat){
        this.habitat = inHabitat;
    }

    public String getDiet(){
        return this.diet;
    }

    public void setDiet(String inDiet){
        this.diet = inDiet;
    }
}