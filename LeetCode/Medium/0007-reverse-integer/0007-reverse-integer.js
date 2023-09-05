/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    x = String(x);
    if (x.includes("-")) {
        x = x.slice(1);
        const num = Number(x.split("").reverse().join(""));
        if (num > 2**31) return 0;  
        
        return -num;
    }  
    
    const num = Number(x.split("").reverse().join(""));
    if (num > 2**31) return 0;  
    
    return num;
};