package com.alex.Optional;

public class Boy {
    
    private Girl girl;

    public Boy(){

    }

    public Boy(Girl girl){
        this.girl = girl;
    }

    public Girl getGirl(){
        return this.girl;
    }

    public void setGirl(Girl girl){
        this.girl = girl;
    }
    


}
