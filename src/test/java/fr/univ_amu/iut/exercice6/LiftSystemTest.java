package fr.univ_amu.iut.exercice6;

import java.util.Arrays;
import java.util.Collections;

public class LiftSystemTest {

    // TODO: enable this test and finish writing it
    //@Test
    public void doSomething() {
        Lift liftA = new Lift("A", 0);
        LiftSystem lifts = new LiftSystem(Arrays.asList(0, 1), Collections.singletonList(liftA), Collections.emptyList());
        lifts.tick();
        //verify(new LiftSystemPrinter().print(lifts));
    }
}
