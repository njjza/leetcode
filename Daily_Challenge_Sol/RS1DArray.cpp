#include <iostream>
#include <vector>

using namespace std;

void printVector(vector <int>& nums) {
    cout << "v = {";
    for (int n : nums) {
        cout << n << " ";
    }
    cout << "};\n";
}

vector<int> runningSum(vector<int>& nums) {
    int len = nums.size(), i;

    for (i = 1; i < len; i++) {
        nums[i] += nums[i - 1];
    }

    return nums;
}

int main (){
    vector<int> ans;
    bool res;

    vector<int> case1   =   {1, 2, 3, 4};
    vector<int> ans1    =   {1, 3, 6, 10};
    ans = runningSum(case1);
    printVector(ans);
    res = (ans == ans1);
    cout << res << "\n";

    vector<int> case2   =   {1, 1, 1, 1, 1};
    vector<int> ans2    =   {1, 2, 3, 4, 5};
    ans = runningSum(case2);
    res = (ans == ans2);
    cout << res << "\n";

    vector<int> case3   =   {3, 1, 2, 10, 1};
    vector<int> ans3    =   {3, 4, 6, 16, 17};
    ans = runningSum(case3);
    res = (ans == ans3);
    cout << res << "\n";

    return 0;
}
    