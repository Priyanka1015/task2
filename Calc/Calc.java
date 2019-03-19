/*
*@author Priyanka
*/

class Calc{
	/*
	*Method that preform Arithmetic operation based on parameters
	*@param num1=number1
	*@param num2=number2
	*@param op=operator
	*/
	public int operation(int num1,int num2,String op)
		switch(op){
			case "Addition":{
				Addition(num1,num2);
				break;
			}
			case "Subtraction":{
				Subtraction(num1,num2);
				break;
			}
			case "Multiplication":{
				Multiplication(num1,num2);
				break;
			}
			default:{
				return -1;
			}
		}
		int Addition(int num1,int num){
			return num1+num2;
		}
		int Subtraction(int num1,int num2){
			return num1-num2;
		}
		int Multiplication(int num1,int num2){
			return num1*num2;
		}
	}
