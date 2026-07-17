
public class Problem3576 {

    static final int MOD = 1000000007;

    public static int sumAndMultiplyHelper(int[] query, int[] prefix, int[] nextNonZero, int[] prevNonZero, int[] packedIndex, long[] numberPrefix, long[] pow10) {
        int l = query[0];
        int r = query[1];
        long sum;

        if (l == 0) {
            sum = prefix[r];
        } else {
            sum = prefix[r] - prefix[l - 1];
        }

        int leftPos = nextNonZero[l];
        int rightPos = prevNonZero[r];

        if (leftPos == -1 || rightPos == -1 || leftPos > rightPos) {
            return 0;
        }
        int leftPacked = packedIndex[leftPos];
        int rightPacked = packedIndex[rightPos];

        long num;
        if (leftPacked == 0) {
            num = numberPrefix[rightPacked];
        } else {
            int len = rightPacked - leftPacked + 1;
            num = (numberPrefix[rightPacked] - (numberPrefix[leftPacked - 1] * pow10[len]) % MOD + MOD) % MOD;
        }
        return (int) ((num * sum) % MOD);
    }

    public static int[] sumAndMultiply(String s, int[][] queries) {
        int[] output = new int[queries.length];
        int[] prefixsum = new int[s.length()];
        int[] packedDigits = new int[s.length()];
        int[] packedIndex = new int[s.length()];
        int[] nextNonZero = new int[s.length()];
        int[] prevNonZero = new int[s.length()];

        prefixsum[0] = s.charAt(0) - '0';

        int nonZeroCount = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit != 0) {
                packedDigits[nonZeroCount] = digit;
                packedIndex[i] = nonZeroCount;
                nonZeroCount++;
            } else {
                packedIndex[i] = -1;
            }
        }

        for (int i = 1; i < s.length(); i++) {
            prefixsum[i] = prefixsum[i - 1] + (s.charAt(i) - '0');
        }

        int last = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '0') {
                last = i;
            }
            nextNonZero[i] = last;
        }

        last = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                last = i;
            }
            prevNonZero[i] = last;
        }

        long[] pow10 = new long[nonZeroCount + 1];
        pow10[0] = 1;
        for (int i = 1; i <= nonZeroCount; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        long[] numberPrefix = new long[nonZeroCount];
        if (nonZeroCount > 0) {
            numberPrefix[0] = packedDigits[0];
            for (int i = 1; i < nonZeroCount; i++) {
                numberPrefix[i] = (numberPrefix[i - 1] * 10 + packedDigits[i]) % MOD;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            output[i] = sumAndMultiplyHelper(queries[i], prefixsum, nextNonZero, prevNonZero, packedIndex, numberPrefix, pow10);
        }

        return output;
    }

    public static void main(String[] args) {
        String s = "1234712834710237481023489712348701234710923471203984701928374091283740129384710982347091273490812734089172340981723409817230984718902347901783412347908123471283478123749123571982768174673467138957182935001231231123704981723418947109758912759081275807125890712890571896725714516108957890571908571905719867136718930576128904732134";
        int[][] queries = {
            {0, 9}, {5, 80}, {11, 111}, {15, 169}
        };

        int[] ans = sumAndMultiply(s, queries);

        for (int x : ans) {
            System.out.println(x);
        }
    }
}
