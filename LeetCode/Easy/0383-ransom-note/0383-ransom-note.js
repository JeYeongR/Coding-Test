/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    const map1 = new Map();
    
    for(let i in ransomNote) {
        const c = ransomNote[i];
        if(map1.has(c)){
            map1.set(c, map1.get(c) + 1);
        } else {
            map1.set(c, 1);
        }
    }
    
    for(let i in magazine) {
        const c = magazine[i];
        if(map1.has(c)){
            map1.set(c, map1.get(c) - 1);
            if(map1.get(c) === 0) map1.delete(c);
        }
    }
    
    return map1.size === 0;
};