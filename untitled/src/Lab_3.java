class SD1 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += 1.0/i;
            System.out.printf("Harmonic number %d: %.2f\n", i, sum);
        }
    }
}