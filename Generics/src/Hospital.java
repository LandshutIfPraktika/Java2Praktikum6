/**
 * Created by s-gheldd on 1/8/16.
 */
public class Hospital {


    public static void main(String[] args) {
        Patient<Mental> madAdam = new Patient<>();
        madAdam.sicken(new Dementia());

        //madAdam.sicken(new Fracture());  Fracture extends not Mental

        //Patient<Disease> somePatient;
        //somePatient = madAdam; invariant definition of Patient<Disease>

        Patient<? extends Disease> somePatient;
        somePatient = madAdam;

        System.out.println(somePatient.getDisease().getClass()); //dynamic typing

        Doctor<Physical> drWho = new Doctor<>();
        Doctor<Mental> drFreud = new Doctor<>();
        Doctor<Disease> mediBot = new Doctor<>();

//        madAdam.visit(drWho); wildcards need to be in method declaration
//        madAdam.visit(drFreud);
//        madAdam.visit(mediBot);
//        somePatient.visit(drWho);
//        somePatient.visit(drFreud);
//        somePatient.visit(mediBot);

        madAdam.visit(drFreud);
        madAdam.visit(mediBot);
        //madAdam.visit(drWho);

        Patient<Lovesickness> susi = new Patient<>();

        drFreud.visitAll(susi,madAdam);

        mediBot.visitAll(susi,madAdam,somePatient);
        //drFreud.visitAll(madAdam,susi,new Patient<Dementia>(),new Patient<Rash>());
        // Rash !extends Mental
        drWho.visitAll(new Patient<Rash>());

    }
}
