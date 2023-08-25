/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
    let answer = [];
    let sum = 0;
    for(let i in nums) {
        sum += nums[i];
        answer.push(sum);
    }
    
    return answer;
};