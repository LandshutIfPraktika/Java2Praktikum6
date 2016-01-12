/**
 * Created by s-gheldd on 1/8/16.
 */
public class Patient<T extends Disease> {
    private T disease;

    public Patient<T> sicken(final T t){
        this.disease = t;
        return this;
    }

    public T getDisease(){
        return this.disease;
    }


    public  Patient<T> visit(Doctor<? super T> doctor){
     return this;
    }
}
