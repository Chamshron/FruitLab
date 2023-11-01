import org.junit.Test;

public class FruitMachineTest {
    @Test
    public void FruitMachineCanRandomNumber(){
        FruitMachine fruitMachine = new FruitMachine(1000);
        fruitMachine.spin();
    }

}
