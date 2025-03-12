class Solution {
public:
    int scoreOfString(string s) {
        int init = (int)s[0];
        int score = 0;
        for(int i=1; i<s.size();i++){
            int ascii = (int)s[i];
            score += abs(init-ascii);
            init = ascii;
        }
        return score;
    }
};