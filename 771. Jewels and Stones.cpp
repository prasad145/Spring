class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
        map<char, int> freq;
        for(int i = 0; i < stones.length(); i++)
        {
            freq[stones[i]]++;
        }
        
        int ans = 0;
        for(int j = 0; j < jewels.length(); j++)
        {
            ans += freq[jewels[j]];
        }
        
        return ans;
    }
};
