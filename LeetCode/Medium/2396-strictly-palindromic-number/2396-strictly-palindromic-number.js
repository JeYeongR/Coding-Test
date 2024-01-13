/**
 * @param {number} n
 * @return {boolean}
 */
var isStrictlyPalindromic = function(n) {
    let base = 2;
    while(base<=n-2){
        x = n.toString(base)
        if(x == String(x).split('').reverse().join('')){
            base++;
        }else{
            return false;
        }
    }
    return true;
};
