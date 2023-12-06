function solution(nums) {
    const max = nums.length / 2;
    const setSize = new Set(nums).size;
        
    return setSize > max ? max : setSize;
}