import java.util.Random;

import com.google.common.annotations.VisibleForTesting;

public class TestDemo {
public  int addPositive(int a, int b) {
	int sum = a + b;
	if(a > 0 &&  b > 0) {
		return sum;
	}else {
		throw new IllegalArgumentException("Both parameters must be positive!") ;
	}	
}
public int randomNumberSquared() {
	return getRandomInt() * getRandomInt();
}
@VisibleForTesting
 int getRandomInt() {
	Random random = new Random();
	return random.nextInt(10) + 1;
}
 

}
 
  