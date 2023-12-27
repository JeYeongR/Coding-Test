/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function(nums) {
    let answer = 0;
    for(let lt = 0; lt < nums.length; lt++) {
        for(let rt = lt + 1; rt < nums.length; rt++) {
            if(nums[lt] == nums[rt]) {
                answer++;
            }
        }
    }
    return answer;
};