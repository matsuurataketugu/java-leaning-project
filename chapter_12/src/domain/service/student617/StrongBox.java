package domain.service.student617;

public class StrongBox<A> {

        private A value;

        public void put(A arg){
            this.value = arg;
        }
        public A get(){
            return this.value;
        }

    }

