package com.company;

public class BagSweets {
    private Sweet[][] bag;
    private int weight;

    public Sweet[][] getBag() {
        return bag;
    }

    public void setBag(Sweet[][] bag) {
        this.bag = bag;
    }


    public void setWeight() {
        weight=0;
        if(!this.bag[1][1].equals(null)) {
            for (Sweet[] i : this.bag){
                for(Sweet j: i){
                    weight += j.getWeight();
                }
            }
        }

    }

    public int getWeight() {
        if(this.weight == 0){
            this.setWeight();
        }
        return weight;
    }

    public BagSweets(){
        this.bag = new Sweet[3][3];
        bag[0] = new Candy[3];
        bag[1] = new Cake[3];
        bag[2] = new Cookie[3];

    }

}
