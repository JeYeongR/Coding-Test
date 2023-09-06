/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    const set = new Set();

    let max = 0;
    let lt = 0;
    for (let rt = 0; rt < s.length; rt++) {
        while (set.has(s[rt])) {
            set.delete(s[lt])
            lt++;
        }
        set.add(s[rt]);
        max = Math.max(max, set.size)
    }

    return max;
};