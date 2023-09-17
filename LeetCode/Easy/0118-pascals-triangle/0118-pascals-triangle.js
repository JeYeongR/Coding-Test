/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    const answer = [];
    for (var i = 0; i < numRows; i++) {
        answer[i] = [];
        answer[i][0] = 1;
        for (var j = 1; j < i; j++) {
            answer[i][j] = answer[i-1][j-1] + answer[i-1][j]
        }
        answer[i][i] = 1;
    }
    return answer;
};