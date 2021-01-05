
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int>A;
        int j=nums.size();
        unordered_map<int,int>m;
        for(int i=0;i<j;i++){
            int d=target-nums[i];
            if(m.find(d)!=m.end()){
                auto p=m.find(d);
                A.push_back(p->second);
                A.push_back(i);
            }
            m.insert(make_pair(nums[i],i));
        }
        return A;
    }
};