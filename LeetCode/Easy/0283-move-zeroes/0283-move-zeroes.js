/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    let lt = 0;
    let rt = lt + 1;

    while (rt <= nums.length - 1) {
        if (nums[lt] !== 0) {
            lt++;
            rt++;
        } else {
            if (nums[rt] !== 0) {
                [nums[lt], nums[rt]] = [nums[rt], nums[lt]];
                lt++;
            }
            rt++;
        }
    }
};