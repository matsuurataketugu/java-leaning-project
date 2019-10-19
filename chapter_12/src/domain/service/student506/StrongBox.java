package domain.service.student506;


public class StrongBox<T> {

    private T value;

    public void put(T arg){
        this.value = arg;
    }
    public T get(){
        return this.value;
    }


}
