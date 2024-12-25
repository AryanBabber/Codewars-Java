class Kata {
    static int singleDigit(int n) {
        if (n < 10)
            return n;
        String bin = Integer.toBinaryString(n);
        int count = 0;

        for (char c : bin.toCharArray()) {
            if (c == '1')
                count++;
        }

        return singleDigit(count);
    }
}