/**
 * Created by s-gheldd on 1/8/16.
 */
public class Doctor<T extends Disease> {

    void visitAll(Patient<? extends T>... patients){
        for (Patient<? extends T> patient : patients ){
            patient.visit(this);
        }
    }
}
