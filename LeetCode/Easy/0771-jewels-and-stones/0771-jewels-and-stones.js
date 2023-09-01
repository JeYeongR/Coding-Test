/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
var numJewelsInStones = function(jewels, stones) {
    let cnt = 0;
    for(let i in jewels) {
        for(let j in stones) {
            if(jewels[i] == stones[j]) cnt++;
        }
    }  
    return cnt;
};