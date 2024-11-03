public class Euler{
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        for (long e = 0; e*e*e*e*e<= n; e++){
            for(long a = 0; a*a*a*a*a < e*e*e*e*e; a++) {
                for (long b = a; b*b*b*b*b < e*e*e*e*e; b++) {
                    for (long c = b; c*c*c*c*c < e*e*e*e*e; c++){
                        for (long d = c; d*d*d*d*d < e*e*e*e*e; c++){
                            if (Math.pow(a, 5)+Math.pow(b, 5) +Math.pow(c, 5) + Math.pow(d, 5) == Math.pow(e, 5) ) {
                                System.out.println(a + "^5 + " + b + "^5 + " + c + "^5 + " + d + "^5 = " + e + "^5");
                            }
                        }
                    }
                }
            }
        }
    }
}