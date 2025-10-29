[Count Digits – GeeksforGeeks](https://www.geeksforgeeks.org/problems/count-digits5716/1)



class Solution {
    static int evenlyDivides(int n) {
        
        int num = n;
        int count = 0;
        while(n > 0)
        {
            int rem = n % 10;
            if(rem != 0 && num % rem == 0)
            {
                count = count + 1;
            }
            n = n / 10;
        }
        return count;
    }
}
