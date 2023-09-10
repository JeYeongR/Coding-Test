/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if(s.length !== t.length) return false;
    
    const arr = new Array(26).fill(0);
    
    for(let i in s) {
        arr[s.charCodeAt(i) - 97]++;
        arr[t.charCodeAt(i) - 97]--;
        console.log(arr[t.charCodeAt(i) - 97], arr[s.charCodeAt(i) - 97]);
    }
    
    for(let i in arr) {
        if(arr[i] !== 0) return false;
    }
    
    return true;
};