class Persist {
	public static int persistence(long n) {
		int count = 0;
        if(n < 10) return count;
        
        long prod = 1;
        while(n != 0) {
            prod *= (n % 10);
            n /= 10; 
        }

        count++;

        return count + persistence(prod);
	}
}