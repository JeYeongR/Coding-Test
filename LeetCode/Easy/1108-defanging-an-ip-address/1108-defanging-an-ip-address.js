/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(address) {
    let answer = "";
    for(let i in address) {
        let c = address.charAt(i);
        if(c === ".") {
            answer += "[.]";
        } else {
            answer += c;
        } 
    }
    
    return answer;
};