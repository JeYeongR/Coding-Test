/**
 * @param {number} celsius
 * @return {number[]}
 */
var convertTemperature = function(celsius) {
    let answer = [];
    answer.push(celsius + 273.15);
    answer.push(celsius * 1.8 + 32);
    
    return answer
};