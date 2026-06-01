class Solution {

    public boolean lemonadeChange(int[] bills) {
        int change5 = 0;
        int change10 = 0;
        // int change = 0;
        int n = bills.length;
        for(int i = 0; i< n; i++){
            if(bills[i] == 5){
                change5++;
                continue;
            }
            else if(bills[i] == 10){
                if(change5 < 1) return false;
                else{
                    change5--;
                    change10++;
                }
            }
            else{
                if(change10 >= 1 && change5 >= 1){
                    change10--;
                    change5--;
                }
                else if(change10 <1 && change5 >= 3){
                    change5 -= 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}