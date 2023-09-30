/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function(nums1, nums2) {
    const map = new Map();
    const arr = [];
    
    for(let n of nums1) {
          map.set(n, (map.get(n) || 0) + 1);
    }
    
    for(let n of nums2) {
        if(map.get(n) > 0) {
            arr.push(n);
            map.set(n, map.get(n)  - 1);
        }
    }
    
    return arr;
};