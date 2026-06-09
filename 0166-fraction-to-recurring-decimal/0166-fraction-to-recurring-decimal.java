class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(denominator == 0 || numerator == 0) return "0";
        StringBuilder result = new StringBuilder();
        if(numerator < 0 ^ denominator < 0){
            result.append("-");
        }
        long num = Math.abs((long)numerator);
        long de = Math.abs((long)denominator);
        result.append(num/de);
        long remainder = num%de;
        if(remainder == 0) return result.toString();
        result.append(".");
        Map<Long,Integer> mp = new HashMap<>();

        while(remainder != 0){
            if(mp.containsKey(remainder)){
                int indexForBracket = mp.get(remainder);
                result.insert(indexForBracket, "(");
                result.append(")");
                break;
            }
            mp.put(remainder, result.length());
            remainder *= 10;
            result.append(remainder/de);
            remainder %= de;
        }
        return result.toString();

    }
}