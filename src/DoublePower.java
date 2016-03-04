/**
* @author : gaoweibupt@gmail.com
* Date: 2016年3月4日上午10:04:06
*/
public class DoublePower {
	public double Power(double base, int exponent) throws Exception {
		if (doubleCompare(base, 0.0) && exponent < 0){
			throw new Exception();
		}
		if (exponent == 0)
			return 1;
		boolean flag = exponent<0?false:true;
		if (flag){
			return powerWithUnsigned(base, exponent);
		}
		else{
			return 1.0 / powerWithUnsigned(base, 0 - exponent);
		}
	}
	double powerWithUnsigned(double base, int exponent){
		double result = 1.0;
		for (int i = 0; i < exponent; i++){
			result *= base;
		}
		return result;
	}
	boolean doubleCompare(double x, double y){
		if ((x - y) < 0.0000001 && (x - y) > -0.0000001)
			return true;
		else
			return false;
	}
}
