

public class Calculate {

	public static double square(double number) {
		double answer;
		answer = number *number;
		return answer;
	
	}
	
	public static double cube(double number){
		double answer;
		answer = number*number*number;
		return answer;
	}
	
	public static double average (double x,double y){
		double averageanswer;
		double addingtogether;
		addingtogether = x + y;
		averageanswer  = addingtogether/2;
		return averageanswer;
	}
	public static double average (double inputnumber, double otherinput, double inputofinputs){
			double avg;
			double addingtogether;
			addingtogether = inputnumber + otherinput + inputofinputs;
			avg  = addingtogether/3;
			return avg;
	}
	public static double toDegrees(double input) {
		double degrees = input*180/3.14159;
		return degrees;
		
	}public static double toRadians(double input){
	double degrees = input/180*3.14159;
	return degrees;

	
	}public static double discriminant(double a, double b, double c){
		double answerofa = (b*b)-4*a*c;
		return answerofa;
	
	}public static String toImproperFrac(int a, int b, int c){
		
		int addthemup = (a*c)+b;
		
		String numberAsString = addthemup +" / " + c;
		return numberAsString;
	
	}public static String MixedNum (int a, int j){
		
		double firstnumb = a/j;
		int firstnumb1 = (int)firstnumb;
		int numb = a%j;
		String finalMixed = firstnumb1 + " " + numb + "/" + j;
		return finalMixed;
	}public static String foil (int a, int b, int c, String n){
		String foils = a+n+"^2 + "+b+n+" - "+c;
		return foils;
		
	}public static boolean isDivisibleBy( int DivInput, int Divinputt){
		if(Divinputt<=0){
			throw new IllegalArgumentException ("Negative Found");}
		int number = DivInput%Divinputt;
		int number1 = Divinputt%DivInput;
		int newnumb =  number1+number;
		if (newnumb  == 0){
			return true;
		}else{
			return false;
		}
	}

	public static double absValue(double number){
		if(number<0){
		double number1 = number * -1;
		return number1;
	}else{
		return number;
		
		}
	}
	public static int max(int Trump, int HRC){	
		if(Trump>HRC){
			System.out.println("Trump is greater!!!");
			System.out.println("My Easter egg!");
		return Trump;
		}else{
			System.out.println("Trump is still great, despite he is less!");
			System.out.println("My Easter egg!");
			return HRC;
		}
	}
	
	public static double max(double Trump, double HRC,double GaryJ){
	 int nothing = 0;// political easter eggs :D
		if(Trump>GaryJ && Trump>HRC){
			//System.out.println("Trump is greater!!!");
		return Trump;
		}else if(HRC>GaryJ && Trump>HRC){
			//System.out.println("Trump is still great, despite he is less!");
			return HRC;
		}else if (Trump<GaryJ && GaryJ>HRC){
		//System.out.println("America is saved!");
			return GaryJ;
		
		}
		return nothing;
		}
		public static int min(int i, int k){	
			if(i<k){
				//System.out.println("Trump is greater!!!");
			return i;
			}else{
				//System.out.println("Trump is still great, despite he is less!");
				return k;
			}
		}
		public static double round2(double a){
			double b = a * 100.0;
			double y = b +.5;
			y = (int)y;
			double answer = y/100.0;
			return answer;
		}
		public static double exponent(double inter, int powerto){
			if(inter<=0){
				throw new IllegalArgumentException ("Negative Found");}
			for(int i=powerto; i<=powerto; i++){
			inter = inter*inter; 

		}return inter;
		
}

		public static int factorial(int beingfac) {
			if(beingfac<0){
				throw new IllegalArgumentException ("Negative Found");
				
			}
			for(int intial = beingfac; beingfac<0; intial--){
				intial = intial*(intial-1);
			
				return intial;
			}
			return beingfac;
			
		}
		public static boolean isPrime(int n) {
		    for(int i=2;i<n;i++) {
		        if(n%i==0)
		            return false;
		    }
		    return true;
		    
		  
		}
		public static int gcf(int a, int b){
		while(a!=0 && b!=0){
		 int c = b;
		    b = a%b;
		    a = c; }
          int s = Math.abs(a);
          	int t = Math.abs(b);
				return s+t; 
		}

		public static double sqrt(double unsqt){
			if(unsqt<=0){
				throw new IllegalArgumentException ("Negative Found");
				}
			
			double qsqrt = Math.sqrt(unsqt);
			return unsqt;
			
			
			
		}
		public static String quadForm(int a, int b, int c){
			double aa = (double)a;
			double bb = (double)b;
			double cc = (double)c
;			double discrmin = discriminant(aa,bb,cc);
			if (discrmin <= 0){
				System.out.println("There are no real roots");
			}else{
				double root1 = (-b)+ sqrt(discrmin)/2;  
				double root2 = (-b)- sqrt(discrmin)/2;  
				if (root1==root2){
					int newroot1 = (int) round2(root1);
					String finalrootboth = Integer.toString(newroot1);
					
					return finalrootboth;
				}
				int newroot2 = (int)round2(root2);
				int newroot1 = (int)round2(root1);
				//String finalroot1 = Integer.toString(newroot1);
				//String finalroot2 = Integer.toString(newroot2);
				return newroot1 + "  and " + newroot2;
			}
			return "";
		}
}
	
		

	
		
		