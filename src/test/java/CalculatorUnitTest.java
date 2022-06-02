

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorUnitTest {

  @Test
  public void addWhenTwoAndTwoShouldReturnFour(){
    assertThat(Calculator.add(2,2)).isEqualTo(4);
  }
}
