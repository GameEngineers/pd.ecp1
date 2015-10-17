package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumbersManager {
    NaturalNumber number;
    NaturalNumberCreator creator;
    
    public void createNaturalNumber(int value){
        this.creator.createNaturalNumber(value);
    }
    
    public void setNaturalNumberCreator(NaturalNumberCreator creator){
        this.creator = creator;
    }
    
    public NaturalNumber getNaturalNumber(){
        return number;
    }
    
}