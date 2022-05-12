public class Counter {
    private int value;
 
    public Counter(int value) {
        this.value = value;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() {
        return value;
    }

    public void increase() {
        this.value +=1;
    }

    public void decrease() {
        this.value -=1;
    }

    public void increase(int increaseBy) {

        if (increaseBy > 0){

        this.value +=  increaseBy;

        } else {

            this.value +=0;

    }
}

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0){

            this.value -=  decreaseBy;
    
            } else {
    
                this.value -=0;
    
        }
    }


  
}