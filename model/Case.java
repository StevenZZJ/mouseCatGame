package TD5.model;

public class Case {
    private TypeCase typeCase;
    private Animal animal;

    public Animal getAnimal() {
        return this.animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public TypeCase getTypeCase(){
        return this.typeCase;
    }

    public void setTypeCase(TypeCase typeCase){
        this.typeCase = typeCase;
    }

}
