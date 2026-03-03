class LeapYear{
	static int year=2028;
	public static void main(String[] args){
		if((year%4 == 0) && (year%100!= 0)){
			System.out.println("leaf year:"+year);
		}
		else{
			System.out.println("not a leaf year:"+year);
		}
	}
}