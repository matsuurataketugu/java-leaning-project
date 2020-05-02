package domain.service.student645;

public class StrongBox <A>{

    // ・金庫には、１つのインスタンスを保存できる必要がある
    // ・put()でインスタンスを保存し、get()でインスタンスを取得できる
    // ・get()で取得する際、キャストを使わなくても格納前の型に代入できる
    private A value;

    public void put(A hensu){
         this.value =  hensu;
    }

    public A get(){
        return value;
    }
    
}
